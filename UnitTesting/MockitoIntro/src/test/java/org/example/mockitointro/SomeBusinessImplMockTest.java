package org.example.mockitointro;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.mock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {
    @Mock
    private DataService dss;
    @InjectMocks
    private SomeBusinessImpl business;


    @Test
    void name() {
        when(dss.retrieveAllData()).thenReturn(new int[]{1,2,3,4,5});
        int result = business.findTheGreatestFromAllData();
        assertEquals(5, result,"dont stalk my github repo");
    }

}
