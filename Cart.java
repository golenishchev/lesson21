package com.example.lesson21;

import java.util.ArrayList;
import java.util.List;

public class Cart<Product> {
    public Cart(List<Product> productList) {
        this.productList = productList;
    }
    List<Product> productList = new ArrayList<>();

    public void addToCart(Product item) {
        productList.add(item);
    }

    public void clearCart() {
        this.productList.clear();
    }

    public void outputProductSpecifications() {
        for (Product specs:productList) {
            System.out.println(specs + "\n");
        }
    }
}
