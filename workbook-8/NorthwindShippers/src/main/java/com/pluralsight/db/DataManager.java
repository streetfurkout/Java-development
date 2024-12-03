package com.pluralsight.db;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.*;

public class DataManager {

    private DataSource datasource;

    public DataManager(DataSource dataSource) {
        this.datasource = dataSource;
    }

    public void insertShipper(String name, int phone) throws SQLException {

        try (Connection connection = datasource.getConnection();
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
