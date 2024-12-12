package com.pluralsight.NorthwindTradersApi6Application.dao.impl;

import com.pluralsight.NorthwindTradersApi6Application.dao.interfaces.IProductDao;
import com.pluralsight.NorthwindTradersApi6Application.models.Category;
import com.pluralsight.NorthwindTradersApi6Application.models.Product;

import java.util.List;

public class JdbcProductDao implements IProductDao {
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
