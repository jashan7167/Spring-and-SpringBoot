package com.jashan.learnaop.Aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class PerformanceTrackingAspect {
//proceeding join point allows us to execute the method and helps us in around annotation
// intercepts the call right before method is called starts the timer executes the method ends the timer and logs the execution time
    private Logger logger = LoggerFactory.getLogger(getClass());
    //@Around("execution(* com.jashan.learnaop.*.*.*(..))")
    @Around("com.jashan.learnaop.Pointcut.CommonPointcutConfig.trackTimeAnnotations()")
    public void findExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long startTime = System.currentTimeMillis();
        joinPoint.proceed();
        long endTime = System.currentTimeMillis();

        long executionTime = endTime - startTime;

        logger.info("Around execution time: {} ms", executionTime);
    }
}
