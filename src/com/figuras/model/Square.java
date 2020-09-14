package com.figuras.model;

public class Square {
    private int side;

    public Square(int side) {
        this.side = side;
    }

    public double getArea() {
        double area_sq;
        area_sq=(side*side);
        return area_sq;
    }

    public void draw() {
        System.out.println("Cuadrado");
    }
}
