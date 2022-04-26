package com.company.Lection8OOP;

public class Square extends Shape {
    @Override
    Double getArea(double r) {
        //System.out.println("square area is: " + (r * r)+"sm2");
        return (r * r);
    }

    @Override
    Double getPerimeter(double r) {
        return (4 * r);
    }
}
