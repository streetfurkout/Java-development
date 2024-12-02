package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
            )) {
                try (PreparedStatement preparedStatement = connection.prepareStatement(
                        """
                                 SELECT first_name, last_name
                                 FROM customer
                                 WHERE last_name LIKE ?
                                 ORDER BY first_name;
                                 """
                )) {
                    preparedStatement.setString(1, lastNameToSearch);

                    try(ResultSet results = preparedStatement.executeQuery()){
                        while (results.next()) {
                            String firstName = results.getString("first_name");
                            String lastName = results.getString("last_name");
                        }
                    }
                }

            }

        }catch (Exception ex){
            System.out.println("An error occured");
            ex.printStackTrace();();
        }

    }
}
