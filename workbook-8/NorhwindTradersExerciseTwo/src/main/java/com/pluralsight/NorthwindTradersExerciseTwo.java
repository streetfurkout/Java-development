package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.Scanner;

public class NorthwindTradersExerciseTwo {
    public static <PreparedStatement> void main(String[] args) {
        try {
            if(args.length != 2) {
                System.out.println("Please enter the username and password!");
                System.exit(1);
            }
            String username = args[0];
            String password = args[1];

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the followings!");
            int productId = scanner.nextInt();
            String productName = scanner.nextLine();
            double unitPrice = scanner.nextDouble();
            int unitsInStock = scanner.nextInt();

            Class.forName("com.mysql.cj.jdbc.Driver");
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password
            );

            String query = """
                    SELECT productID, productName, unitPrice, unitsInStock
                                        FROM products;
                    """;
            PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(query);
            Object statament;
            ResultSet results = statament.executeQuery

        } catch (Exception ex) {
            System.out.println("An error has occurred!");
            ex.printStackTrace();
    }
}
}
