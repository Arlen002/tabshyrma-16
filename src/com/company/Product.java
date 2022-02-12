package com.company;

import java.util.Scanner;

public class Product {
    private String type;
    private String model;
    private int quantity;
    private int price;
    private int discount;
    private int amount;

    public Product(String type, String model, int quantity) {
        this.type = type;
        this.model = model;
        this.quantity = quantity;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getDiscount() {
        return discount;
    }
    public void setDiscount() {
        Scanner sc = new Scanner(System.in);
        System.out.println("пароль жаз: ");
        String a  = "hello";
        if (a.equals(sc.nextLine())) {
            System.out.println("Enter price: ");
            price = sc.nextInt();
            System.out.println("Enter dscount ");
            discount = sc.nextInt();
            int i = 100 - discount;
            amount = (i * price) / 100;
            System.out.println("скидкадан кийигки баасы: " + amount);
        }else {
            System.out.println("парольду туура жазыныз?");
        }
    }
    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    @Override
    public String toString(){
        return "Туру "+getType()+", жылы "+getModel()+", саны "+getQuantity()
                +" 1:баасы "+getPrice()+", скидка "+getDiscount()+", акыркы баасы: "+getAmount();
    }
}
