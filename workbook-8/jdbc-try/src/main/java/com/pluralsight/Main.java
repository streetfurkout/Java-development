package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try(){
            if(args.length != 2) {
                System.out.println("Your username and password inputs are wrong");
                System.exit(1);
            }
            String username = args[0];
            String password = args[1];

            Scanner scanner = new Scanner(System.in);
            System.out.println("What is the last name of the customer");
            String lastNameToSearch = scanner.nextLine();

            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila",
                    username,
                    password
            );
                 PreparedStatement preparedStatement = connection.prepareStatement(
                         """SELECT first_name, last_name
                                 FROM customer
                                 """
                 )
            ){

            }

        }catch (Exception ex){
            System.out.println("An error occured");
            ex.printStackTrace();();
        }

    }
}
