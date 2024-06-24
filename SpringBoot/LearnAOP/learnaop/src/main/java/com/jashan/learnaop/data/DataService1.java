package com.jashan.learnaop.data;


import com.jashan.learnaop.Annotations.TrackTime;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {
    @TrackTime
    public int[] retrieveData()
    {
        return new int[]{1,2,3,4,5};
    }

    public int[] dataRetrieval2()
    {
        return new int[]{2,2,3,5,6,7};
    }
}
