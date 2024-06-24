package com.jashan.learnaop.Pointcut;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointcutConfig {
    @Pointcut("execution(* com.jashan.learnaop.*.*.*(..))")
    public void businessandDataPackageConfig()
    {

    }

    @Pointcut("execution(* com.jashan.learnaop.business.*.*(..))")
    public void businessConfig()
    {

    }

    @Pointcut("execution(* com.jashan.learnaop.data.*.*(..))")
    public void DataPackageConfig()
    {

    }
    @Pointcut("bean(*Service*)")
    public void dataPackageConfigUsingBeans()
    {

    }
    @Pointcut("@annotation(com.jashan.learnaop.Annotations.TrackTime)")
    public void trackTimeAnnotations()
    {

    }




}
