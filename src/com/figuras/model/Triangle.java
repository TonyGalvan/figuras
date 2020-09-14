package com.figuras.model;

public class Triangle {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        double area_tri;
        area_tri = (base*height)/2;
        return area_tri;
    }

    public void draw() {
        System.out.println("Triangulo");
    }
}
