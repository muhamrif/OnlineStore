package com.pluralsight;

import java.lang.reflect.Constructor;

public class Product {

    private String name;
    private double price;
    private String department;
    private String id;

//_________________________//
//    Constructor
//________________________//


    public Product(String name, double price, String department, String id) {
        this.name = name;
        this.price = price;
        this.department = department;
        this.id = id;
    }


//_________________________//
//    Getters & Setters
//________________________//


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



//_________________________//
//    Additional Methods
//________________________//


    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", department='" + department + '\'' +
                ", id='" + id + '\'' +
                '}';
    }


}
