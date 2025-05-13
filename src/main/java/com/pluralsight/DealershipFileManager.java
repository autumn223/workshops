package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DealershipFileManager {

    public Dealership getDealership() {
        // Hardcoded dealership info (since we're ignoring the first line)
        Dealership dealership = new Dealership("Dealership", "123 Main St", "555-1234");

        try {
            FileReader fileReader = new FileReader("src/main/resources/inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            // Skip the first line (dealership info)
            line = bufferedReader.readLine(); // Read and discard

            // Read and process vehicle lines
            while ((line = bufferedReader.readLine()) != null) {
                String[] vehicleData = line.split("\\|");

                int vin = Integer.parseInt(vehicleData[0]);
                int year = Integer.parseInt(vehicleData[1]);
                String make = vehicleData[2];
                String model = vehicleData[3];
                String type = vehicleData[4];
                String color = vehicleData[5];
                int odometer = Integer.parseInt(vehicleData[6]);
                double price = Double.parseDouble(vehicleData[7]);

                Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);
                dealership.addVehicle(vehicle);
            }

            bufferedReader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }

        return dealership;
    }

    public void saveDealership(Dealership dealership) {
        // Optional: To be implemented
    }
}
