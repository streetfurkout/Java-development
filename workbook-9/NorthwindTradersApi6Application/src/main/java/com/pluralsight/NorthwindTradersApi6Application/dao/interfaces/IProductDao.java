package com.pluralsight.NorthwindTradersApi6Application.dao.interfaces;

import com.pluralsight.NorthwindTradersApi6Application.models.Category;
import com.pluralsight.NorthwindTradersApi6Application.models.Product;

import java.util.List;

public interface IProductDao {
    List<Category> getAll();
    Product getById(int id);
    Product getInsert(Category category);
    void update (int id, Category category);
    void delete (int id);
}
