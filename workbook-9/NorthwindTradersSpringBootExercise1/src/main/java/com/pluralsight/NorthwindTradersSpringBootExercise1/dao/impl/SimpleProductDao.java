package com.pluralsight.NorthwindTradersSpringBootExercise1.dao.impl;

import com.pluralsight.NorthwindTradersSpringBootExercise1.dao.interfaces.IProductDao;
import com.pluralsight.NorthwindTradersSpringBootExercise1.models.Product;
import com.pluralsight.NorthwindTradersSpringBootExercise1.services.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SimpleProductDao implements IProductDao {
    private List<Product> products;

    public SimpleProductDao() {
        this.products = new ArrayList<>();

        products.add(new Product(1, "Cheddar", 1, 1.50));
        products.add(new Product(2, "Steak", 4, 10));
        products.add(new Product(3, "Steak", 5, 10));
    }
}
