package org.example.mockitointro;

public class SomeBusinessImpl {
    private DataService dataService;

    public SomeBusinessImpl(DataService dataService) {
        this.dataService = dataService;
    }

    public int findTheGreatestFromAllData()
    {
        int [] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for(int a : data)
        {
            greatest = Math.max(greatest,a);
        }

        return greatest;
    }

}

interface DataService {
    int [] retrieveAllData();
}
