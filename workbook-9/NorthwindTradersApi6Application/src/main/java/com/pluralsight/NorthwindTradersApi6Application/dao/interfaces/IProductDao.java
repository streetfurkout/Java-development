package com.pluralsight.NorthwindTradersApi6Application.dao.interfaces;

import com.pluralsight.NorthwindTradersApi6Application.models.Category;
import com.pluralsight.NorthwindTradersApi6Application.models.Product;

import java.util.List;

public interface IProductDao {
    List<Category> getAll(List<Product> products);

    List<Product> getAll();

    Product getById(int id);
    Product getInsert(Category category);
    void update (int id, Category category);

    Product getInsert(Product product);

    void update(int id, Product product);

    void delete (int id);
}
