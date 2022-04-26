package com.company.Lection8OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public  class EmployeeClass {
    final static int id=500230;
    final static String  firstName = "David", lastName="Johnson";
    private double salaryPerMonth;

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

    public static void main(String[] args) {
        EmployeeClass myEmployee=new EmployeeClass();
        System.out.println(myEmployee.getName());

        System.out.println("The Employee annual salary is: " + myEmployee.getAnnualSalary(450));

        System.out.println("test with generated getter for annual salary: " + myEmployee.getSalaryPerMonth(300.0) );

        System.out.println("Your salary got raised to: " + myEmployee.raiseSalary(300));

        //System.out.println(myEmployee.toString(David, Johnson, 500230, 300));
    }


}
