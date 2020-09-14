package com.figuras.model;

public class Rectangle {
    private int base;
    private int height;
    public Rectangle(int base, int height) {
        this.height = height;
        this.base = base;

    }

    public double getArea(){
        double area_rec;
        area_rec=(base*height);
        return area_rec;
    }

    public void draw(){
        System.out.println("Circulo");
    }
}
