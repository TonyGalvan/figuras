package com.figuras.model;

public class Circle {
    private int radio;

    public Circle(int radio) {
        this.radio = radio;
    }

    public double getArea(){
        double area_circle;
        area_circle = Math.PI*(Math.pow(radio, 2));
        return area_circle;
    }

    public void draw(){
        System.out.println("Circulo");
    }

}
