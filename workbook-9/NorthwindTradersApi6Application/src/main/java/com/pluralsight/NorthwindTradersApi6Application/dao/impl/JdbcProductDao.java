package com.pluralsight.NorthwindTradersApi6Application.dao.impl;

import com.pluralsight.NorthwindTradersApi6Application.dao.interfaces.IProductDao;
import com.pluralsight.NorthwindTradersApi6Application.models.Category;
import com.pluralsight.NorthwindTradersApi6Application.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public abstract class JdbcProductDao implements IProductDao {
    private final DataSource dataSource;

    @Autowired
    public JdbcProductDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        String sql = "SELECT * FROM Products";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                int productID = resultSet.getInt("ProductID");
                String productName = resultSet.getString("ProductName");
                int categoryID = resultSet.getInt("CategoryID");
                double unitPrice = resultSet.getDouble("UnitPrice");
                Product product = new Product(productID,productName,categoryID,unitPrice);
                products.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return products;
    }




    @Override
    public Product getById(int id) {
        return null;
    }

    @Override
    public Product getInsert(Category category) {
        return null;
    }

    @Override
    public void update(int id, Category category) {

    }

    @Override
    public Product getInsert(Product product) {
        return null;
    }

    @Override
    public void update(int id, Product product) {

    }

    @Override
    public void delete(int id) {

    }
}
