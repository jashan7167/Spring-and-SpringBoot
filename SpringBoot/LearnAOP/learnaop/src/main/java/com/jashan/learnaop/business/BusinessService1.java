package com.jashan.learnaop.business;

import com.jashan.learnaop.Annotations.TrackTime;
import com.jashan.learnaop.data.DataService1;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BusinessService1 {

    private DataService1 dataService1;

    public BusinessService1(DataService1 dataService1) {
        this.dataService1 = dataService1;
    }

    // Business Logic
    // Data
    public int calculateMax() {
        dataService1.retrieveData();
        int[] data = new int[]{1,2,3,4,5,6,7,8,9};
        if (data == null) {
            throw new IllegalArgumentException("Data retrieved is null");
        }
        int max = Integer.MIN_VALUE;
        for(int d : data)
        {
            max = Math.max(max, d);
        }
        return max;
    }
}
