
package com.example.jsontest;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        String json = "{\"name\":\"John\",\"age\":30,\"address\":{\"street\":\"123 Main St\",\"city\":\"New York\"},\"hobbies\":[\"Reading\",\"Gaming\"]}";

        ObjectMapper objectMapper = new ObjectMapper();
      
        try {
            JsonNode rootNode = objectMapper.readTree(json);


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
            for (JsonNode hobby : hobbiesNode) {
                System.out.println("Hobby: " + hobby.asText());
            }

      } catch (Exception e) {
        e.printStackTrace();
      }

    }
}

