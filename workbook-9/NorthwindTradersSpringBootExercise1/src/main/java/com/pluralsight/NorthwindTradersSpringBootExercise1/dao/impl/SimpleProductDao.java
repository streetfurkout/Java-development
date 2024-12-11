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

    @Override
    public Product insert(Product product) {
        int maxId = 0;
        for (Product t : products) {
            if(t.getProductId()>maxId){
                maxId =t.getProductId();
            }
        }
        product.setProductId(maxId+1);
        products.add(product);
        return product;
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(int productId) {
        for (Product product : products) {
            if(product.getProductId()==productId){
                return product;
            }
        }
        return null;
    }

    @Override
    public void update(int productId, Product product) {
        int index = getProductIndex(productId);
        if (index != -1) {
            products.set(index, product);
        }
    }

    @Override
    public void delete(int productId) {

    }
}
