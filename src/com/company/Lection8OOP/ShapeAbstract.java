package com.company.Lection8OOP;

// creating Abstract class with keyword "abstract"
abstract class ShapeAbstract {

    //creating abstract method - it does not have a body
    abstract void numberOfSides();

    //regular method
    void whatAmI() {
        System.out.println("I'm a shape.");
    }

}

//Subclass (inherit from Shape)
class Triangle extends ShapeAbstract{
      @Override
    void numberOfSides() {
        //the body of the abstract method is provided here
        System.out.println("I have three sides!");
    }
}

class MyShapeTest{
    public static void main(String[] args) {
        Triangle myObjShape=new Triangle(); // Create an object from subclass Triangle
        myObjShape.numberOfSides();
        myObjShape.whatAmI();
    }
}
