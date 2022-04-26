package com.company.Lection8OOP;

class Circle extends Shape {

    @Override
    Double getArea(double r) {
        return (Math.PI * Math.pow(r, 2));
    }

    @Override
    Double getPerimeter(double r) {
        return (2 * Math.PI * r);
    }
}