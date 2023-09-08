
package com.example.jsontest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class JsonTest {
    public static void main(String[] args) throws Exception {

        Properties properties = new Properties();
        String configFilename = "config/app.properties";
        String json_filepath = null;

        try {
            FileInputStream configFile = new FileInputStream(configFilename);
            properties.load(configFile);
            json_filepath = properties.getProperty("json_file");
            configFile.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //String json = "{\"name\":\"John\",\"age\":30,\"address\":{\"street\":\"123 Main St\",\"city\":\"New York\"},\"hobbies\":[\"Reading\",\"Gaming\"]}";
        //String filePath = "src/main/resources/sample_file_pretty.json";

        ObjectMapper objectMapper = new ObjectMapper();
      
        try {
            System.out.println("Loading JSON data file: " + json_filepath);
            JsonNode rootNode = null;
            try {
                rootNode = objectMapper.readTree(new File(json_filepath));
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Accessing top-level fields
            String name = rootNode.get("name").asText();
            int age = rootNode.get("age").asInt();

            System.out.println("Name: " + name);
            System.out.println("Age: " + age);

            // Accessing nested objects
            JsonNode addressNode = rootNode.get("address");
            String street = addressNode.get("street").asText();
            String city = addressNode.get("city").asText();

            System.out.println("Street: " + street);
            System.out.println("City: " + city);

            // Accessing elements in an array
            JsonNode hobbiesNode = rootNode.get("hobbies");

            if (hobbiesNode.isArray()) {
                System.out.println("Element is an array!");
            } else {
                System.out.println("Element is not an array!");
            }

            for (JsonNode hobby : hobbiesNode) {
                System.out.println("Hobby: " + hobby.asText());
            }

            JsonNode workerProfiles = rootNode.get("workerProfiles");

            if (workerProfiles.isArray()) {
                System.out.println("Element is an array!");

                for (JsonNode workerProfile : workerProfiles) {
                    System.out.println("Employee ID : " + workerProfile.get("empID").asText());
                    System.out.println("Employee Name: " + workerProfile.get("empName").asText());
                }

            } else {
                System.out.println("Element is not an array!");
            }


      } catch (Exception e) {
        e.printStackTrace();
      }

    }
}

