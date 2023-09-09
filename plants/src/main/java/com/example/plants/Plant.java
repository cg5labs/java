package com.example.plants;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Plant {

    private String plantName;
    private Integer numberOfBranches;
    private ArrayList<String> regions;

    public ArrayList<String> getRegions() {
        return regions;
    }
    // constructor
    public Plant(String name) {
        this.plantName = name;
        this.regions = new ArrayList<>();
    }

    public void addRegion(String region) {
        this.regions.add(region);
    }
    public void setRegions(ArrayList<String> regions) {
        this.regions = regions;
    }

    public String getPlantName() {
       return this.plantName;
    }

    public Integer getNumberOfBranches() {
        return numberOfBranches;
    }

    public void setNumberOfBranches(Integer numberOfBranches) {
        this.numberOfBranches = numberOfBranches;
    }

}
