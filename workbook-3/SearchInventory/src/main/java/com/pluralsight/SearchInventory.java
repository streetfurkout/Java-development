package com.pluralsight;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class SearchInventory {
    private List<Product> inventory;

    public SearchInventory() {
        inventory = new ArrayList<>();
        getInventory(); // Load initial inventory
    }

    public void getInventory() {
        // Initial hard-coded inventory (can be replaced with file reading)
        inventory.add(new Product(4567, "2x4 (grade B)", 9.99));
        inventory.add(new Product(1234, "Hammer", 19.49));
        inventory.add(new Product(2345, "Box of nails", 9.29));
        inventory.add(new Product(3456, "Screwdriver", 12.99));
        inventory.add(new Product(6789, "Drill", 59.99));
    }
}


