package com.pluralsight.NorthwindTradersApi6Application.dao.impl;

import com.pluralsight.NorthwindTradersApi6Application.dao.interfaces.ICategoryDao;
import com.pluralsight.NorthwindTradersApi6Application.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
@Component
public class JdbcCategoryDao implements ICategoryDao {
    private final DataSource dataSource;
    @Autowired
    public JdbcCategoryDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Category> getAll() {
        List<Category> categories = new ArrayList<>();
        String sql = "Select * From Categories";
        try {Connection connection = dataSource.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet resultSet = statement.executeQuery();
            while(resultSet.next()){
                int categoryId = resultSet.getInt("CategoryID");
                String categoryName = resultSet.getString("CategoryName");
                Category category = new Category(categoryId, categoryName);
                categories.add(category);

            }


        }catch (SQLException e) {
            e.printStackTrace();
        }

        return categories;
    }

    @Override
    public Category getById(int id) {
        return null;
    }

    @Override
    public Category insert(Category category) {
        return null;
    }

    @Override
    public void update(int id, Category category) {

    }

    @Override
    public void delete(int id) {

    }
}
