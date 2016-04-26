package com.example.lesson21;

import java.util.ArrayList;
import java.util.List;

public class Cart<T> {
    public Cart(List<T> productList) {
        this.productList = productList;
    }
    List<T> productList = new ArrayList<>();

    public void addToCart(T item) {
        productList.add(item);
    }

    public void clearCart() {
        this.productList.clear();
    }

    public void outputProductSpecifications() {
        for (T specs:productList) {
            System.out.println(specs + "\n");
        }
    }
}
