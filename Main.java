package com.example.lesson21;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cart<Computer> myCart = new Cart<>(new ArrayList<Computer>());
        myCart.addToCart(new Desktop("USB-Keyboard", "AMD64"));
        myCart.addToCart(new Laptop("Built-In Keyboard", "x86-64"));
        myCart.addToCart(new Tablet("On-Screen Keyboard", "ARM64"));
        myCart.outputProductSpecifications();
        myCart.clearCart();
    }
}
