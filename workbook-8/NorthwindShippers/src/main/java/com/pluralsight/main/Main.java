package com.pluralsight.main;

import com.pluralsight.db.DataManager;
import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            if (args.length != 2) {
            System.out.println("Please enter a valid username and password");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];

        BasicDataSource northwindDataSource = new BasicDataSource();
        northwindDataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        northwindDataSource.setUsername(username);
        northwindDataSource.setPassword(password);


        DataSource dataSource = northwindDataSource;

        Scanner scanner = new Scanner(System.in);

    }

}
