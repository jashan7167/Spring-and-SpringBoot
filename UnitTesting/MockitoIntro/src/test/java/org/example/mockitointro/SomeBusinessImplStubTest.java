package org.example.mockitointro;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SomeBusinessImplStubTest {
    @Test
    void name() {
        DataServiceStub dss = new DataServiceStub();
        SomeBusinessImpl business = new SomeBusinessImpl(dss);
        int result = business.findTheGreatestFromAllData();
        assertEquals(5, result,"dont stalk my github repo");
    }
}
class DataServiceStub implements DataService {
    @Override
    public int[] retrieveAllData() {
        return new int[]{1,2,3,4,5};
    }
}
