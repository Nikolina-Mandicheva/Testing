package com.company.constructorsLection7;

public class Car {
    String name;
    String colour;
    int horsePower, releaseYear;
    boolean secondHand;

    public Car(String name, String colour, int horsePower, int releaseYear, boolean secondHand) {
        this.name = name;
        this.colour = colour;
        this.horsePower = horsePower;
        this.releaseYear = releaseYear;
        this.secondHand = secondHand;
    }

    Car(String name, String colour, boolean secondHand) {
        releaseYear = -1;
        horsePower = -1;
        this.name = name;
        this.colour = colour;
        this.secondHand = secondHand;
    }

    Car(String name, String colour, int horsePower, int releaseYear) {
        this.name = name;
        this.colour = colour;
        this.horsePower = horsePower;
        this.releaseYear = releaseYear;

    }



    Car(int releaseYear) {
        this("Suzuki", "white", 120,releaseYear);
        //This always first - constructor calla another constructor - some code here

    }



    Car(String name, int horsePower, int releaseYear, boolean secondHand) {
        colour = "n/a";
        this.name = name;
        this.horsePower = horsePower;
        this.releaseYear = releaseYear;
        this.secondHand = secondHand;

    }

    Car() {
        this.name = "N/A";
        this.colour = "N/A";
        this.horsePower = -1;
        this.releaseYear = -1;
        this.secondHand = false;
    }

    public static void main(String[] args) {
        Car myTestCar= new Car(2015);

        Car myCarObj = new Car("name", 101, 200, true);
        Car myCarObjBlank = new Car();
        Car myCarObj1 = new Car(2010);
        System.out.println(myCarObj1.name);
        System.out.println(myCarObj.horsePower);
        System.out.println(myCarObjBlank.name);
    }
}



