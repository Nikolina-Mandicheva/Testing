package com.company.Lection8OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public  class EmployeeClass {
     final int id;
     final String  firstName , lastName;
    private double salaryPerMonth;

    public EmployeeClass(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    String getName(){
        return (firstName+ " "+ lastName );
    };

    double getAnnualSalary(double salaryPerMonth){
       return (12 * salaryPerMonth);
    }

    public double getSalaryPerMonth(double salaryPerMonth) {
        return salaryPerMonth * 12;
    }

    //generated setter, but edited
    double raiseSalary(double salaryPerMonth) throws InputMismatchException {
        System.out.println("Enter the raise in %: ");
        Scanner myIncrease=new Scanner(System.in);
        float p=myIncrease.nextFloat();
        if (p<=0){
            System.out.println("No raise for this month/year");
        }
        else {
            this.salaryPerMonth =salaryPerMonth + (salaryPerMonth * p);
        }
        return this.salaryPerMonth;
    }

//    @Override //from generator , did not handle it
//    public String toString() {
//        return "EmployeeClass{" + "getName()" +
//                "salaryPerMonth=" + salaryPerMonth +
//                '}';
//    }

//    public String toStringCustom(String firstName, String lastName, int id, double salaryPerMonth){
//        String s=Double.toString(salaryPerMonth);
//        String identification= Integer.toString(id);
//        return ("This employee is: " + firstName + " "+ lastName + "with id: " + identification +". The employee salary is: "+ s);
//    }

    public String toString(){
        return " bbb  (\"This employee is: \" + firstName + \" \"+ lastName + \"with id: \" + identification +\". The employee salary is: \"+ 4556);";
    }

    public static void main(String[] args) {
        EmployeeClass myEmployee=new EmployeeClass(5023, "David", "Smith");

        //System.out.println(myEmployee.getName());

        //System.out.println("The Employee annual salary is: " + myEmployee.getAnnualSalary(450));

        //System.out.println("test with generated getter for annual salary: " + myEmployee.getSalaryPerMonth(300.0) );

        //System.out.println("Your salary got raised to: " + myEmployee.raiseSalary(300));

        //System.out.println(myEmployee.toStringCustom(David, Johnson, 500230, 300));
    }


}
