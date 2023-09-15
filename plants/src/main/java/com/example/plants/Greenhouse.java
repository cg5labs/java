package com.example.plants;

import java.util.ArrayList;

public class Greenhouse {
    public static void main(String[] args) {

        ArrayList<String> regions = new ArrayList<>();
        regions.add("Tropics");
        regions.add("Subtropics");

        Plant orchid = new Plant("Orchid");

        orchid.setNumberOfBranches(5);
        orchid.setRegions(regions);
        orchid.addRegion("Temperate");

        System.out.println("My plant identifies as " + orchid.getPlantName());
        System.out.println("It has " + orchid.getNumberOfBranches() + " branches");
        //System.out.println(orchid.getRegions());

        for ( String region : orchid.getRegions()) {
            System.out.println("Grows in region: " + region);
        }


        // test if a String variable contains a boolean word (true/false)
        String myBool = "false";


        if ("true".equals(myBool) || "false".equals(myBool)) {
            System.out.println("found boolean: "+ myBool);
        } else {
            System.out.println("boolean not found: " + myBool);
        }


        boolean test = Boolean.parseBoolean(myBool);

        System.out.println(test);

    }
}

