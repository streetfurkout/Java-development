package com.pluralsight.NorthwindTradersApi6Application.dao.impl;

import com.pluralsight.NorthwindTradersApi6Application.dao.interfaces.ICategoryDao;
import com.pluralsight.NorthwindTradersApi6Application.models.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
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
        return null;
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
