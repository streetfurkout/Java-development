package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Check for command line arguments for username and password
        if (args.length != 2) {
            System.out.println("Application needs two arguments to run: " +
                    "java com.pluralsight.Main <username> <password>");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1) Display all products");
            System.out.println("2) Display all customers");
            System.out.println("3) Display all categories");
            System.out.println("0) Exit");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    displayAllProducts(username, password);
                    break;
                case 2:
                    displayAllCustomers(username, password);
                    break;
                case 3:
                    displayAllCategories(username, password);
                    break;
                case 0:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    private static void displayAllCategories(String username, String password) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password);
                 PreparedStatement statement = connection.prepareStatement(
                         "SELECT CategoryID, CategoryName FROM Categories ORDER BY CategoryID");
                 ResultSet resultSet = statement.executeQuery()) {

                System.out.println("Categories:");
                while (resultSet.next()) {
                    int categoryId = resultSet.getInt("CategoryID");
                    String categoryName = resultSet.getString("CategoryName");
                    System.out.println(categoryId + ": " + categoryName);
                }



    private static void displayAllProducts(String username, String password) {
        String query = "SELECT ProductID, ProductName, UnitPrice, UnitsInStock FROM products";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Use try-with-resources for automatic resource management
            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", username, password);
                 PreparedStatement statement = connection.prepareStatement(query);
                 ResultSet results = statement.executeQuery()) {

                while (results.next()) {
                    int productId = results.getInt("ProductID");
                    String productName = results.getString("ProductName");
                    double unitPrice = results.getDouble("UnitPrice");
                    int unitsInStock = results.getInt("UnitsInStock");

                    System.out.println("Product ID: " + productId);
                    System.out.println("Product Name: " + productName);
                    System.out.println("Unit Price: " + unitPrice);
                    System.out.println("Units In Stock: " + unitsInStock);
                    System.out.println("-----------------------------------------");
                }
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }