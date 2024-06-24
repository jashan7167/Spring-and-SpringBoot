package com.jashan.learnaop.Aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggingAspect {
    //we need to intercept all the method calls that are going into the business and data layer beans
    //we also need to define when to call the method before or after
    //PointCut - defins when?
    private Logger logger = LoggerFactory.getLogger(getClass());
    //before the execution of the methods in the business and the data packages we are able to intercept the method calls and able to execute the packages we want to execute
    //execution
    //execution (* com.in28minutes.learnspringaop.aopexample.business.*.*(..))
    //@Before("execution(* com.jashan.learnaop.business.*.*(..))")
    @Before("com.jashan.learnaop.Pointcut.CommonPointcutConfig.businessandDataPackageConfig()")
    public void logMethodCall(JoinPoint joinPoint)
    {
        logger.info("Before Aspect Method is called - {} with arguments {}",joinPoint,joinPoint.getArgs());
        // Before Aspect Method is called - execution(int com.jashan.learnaop.business.BusinessService1.calculateMax())
    }
   // @After("execution(* com.jashan.learnaop.*.*.*(..))")
   @Before("com.jashan.learnaop.Pointcut.CommonPointcutConfig.DataPackageConfig()")
    public void logMethodCallAfterExecution(JoinPoint joinPoint)
    {
        logger.info("After Aspect Method is called - {} with arguments {}",joinPoint,joinPoint.getArgs());
    }

    @AfterThrowing(pointcut = "execution(* com.jashan.learnaop.*.*.*(..))",
    throwing = "exception"
    )
    public void logMethodCallAfterException(JoinPoint joinPoint,Exception exception)
    {
        logger.info("AfterThrowing is called - {} with arguments {}",joinPoint,exception);
    }

    @AfterReturning(pointcut = "execution(* com.jashan.learnaop.*.*.*(..))", returning = "resultValue")
    public void logMethodCallAfterSuccessfulExecution(JoinPoint joinPoint, Object resultValue) {
        logger.info("AfterReturning Aspect: Method {} returned {}", joinPoint.getSignature(), resultValue);
    }
}
