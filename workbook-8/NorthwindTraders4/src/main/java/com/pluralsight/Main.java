package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        if(args.length != 2) {
            System.out.println("We need 2 arguments!!");
            System.exit(1);
        }
        String username = args[0];
        String password = args [1];

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1) Display all products");
            System.out.println("2) Display all customers");
            System.out.println("3) Display all categories");
            System.out.println("0) Exit");
            System.out.print("Select an option: ");

            int usersChoice = scanner.nextInt();

            switch (usersChoice) {
                case 1 :
                    displayAllProducts(username, password);
                    break;
                case 2 :
                    displayAllCustomers(username, password);
                    break;
                case 3:
                    displayAllCategories(username, password);
                    break;
                case 0 :
                    System.out.println("BYE!!");
                    return;
                default :
                    System.out.println("Please try again (invalid option)");
                    break;
            }
        }
    }

    public static void displayAllProducts(String username, String password) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            try(Connection connection = DriverManager.getConnection("jdbc:msql://localhost:3306/northwind",
                    username,
                    password);
                PreparedStatement statement = connection.prepareStatement(
                        "SELECT CategoryID, CategoryName FROM"
                )

        }
    }
}
