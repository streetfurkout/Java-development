package com.pluralsight;

import com.pluralsight.Models.Product;
import com.pluralsight.dataSource.DataManager;
import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        if(args.length != 2 ){
            System.out.println("We need username and password!");
            System.exit(1);
        }
        String username = args[0];
        String password = args[1];

       BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername("root");
        dataSource.setPassword("P@ssw0rd");

        DataManager dataManager = new DataManager(dataSource);

        List<Product> productList = dataManager.getAllProducts();
    }
}