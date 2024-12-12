package com.pluralsight.NorthwindTradersApi6Application.dao.impl;

import com.pluralsight.NorthwindTradersApi6Application.dao.interfaces.IProductDao;
import com.pluralsight.NorthwindTradersApi6Application.models.Category;
import com.pluralsight.NorthwindTradersApi6Application.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.util.List;
@Component
public class JdbcProductDao implements IProductDao {
    private final DataSource dataSource;
    @Autowired
    public JdbcProductDao(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public List<Category> getAll() {
        return null;
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
    public void delete(int id) {

    }
}
