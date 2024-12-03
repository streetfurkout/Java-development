package com.pluralsight.db;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataManager {
    private DataSource dataSource;

    public DataManager(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public void insertShipper(String name, int phone) {

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO Shippers (CompanyName, Phone) VALUES (?, ?)", Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, phone);

            int rows = preparedStatement.executeUpdate();
            System.out.println("rows added: " +rows);

                }catch (Exception ex) {
                ex.printStackTrace();
        }
            }

        }