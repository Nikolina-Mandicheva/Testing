package com.company.Lection8OOP;

import javax.swing.*;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonMain {
    final String name, sex, religion, languageNative, nationality;
    final String EGN;
    int age;
    String dateOfBirth;
    String job, country;
    String filledEGN;
    String yearOfBirth;

    public PersonMain(String name, String religion, String languageNative, String nationality, String job, String country) {
        this.name = name;
        this.sex = addSex();
        this.religion = religion;
        this.languageNative = languageNative;
        this.nationality = nationality;
        this.EGN = addEGN();
        this.dateOfBirth = getDOB();
        this.age = getAge();
        this.job = job;
        this.country = country;
    }

    //creating java doc which explains what the below method does, shortcut to start is is /**+enter

    /**
     * This method checks if the entered user's input egn is 10digits
     *
     * @return String
     */
    String addEGN() {
        Scanner myInput = new Scanner(System.in);
        System.out.println("Add EGN id number which is 10 digits: ");
        String egnInput = myInput.nextLine();
        if (egnInput.chars().count() != 10) {
            /*egnInput.length()*/
            throw new InputMismatchException("EGN must be exactly 10 digits! You've entered " + egnInput.chars().count() + "digits");
        }
        filledEGN = egnInput;
        return egnInput;

    }

    public String getDOB() {
        //divide into 3 different variables which get the substring for yy/mm/dd , then concatinate these into the returned variable for dob
        //String dob=filledEGN.substring(0,6);
        String dateOfBirth;
        yearOfBirth = filledEGN.substring(0, 2);
        String monthOfBirth = filledEGN.substring(2, 4);
        String dayOfBirth = filledEGN.substring(4, 6);
        //System.out.println("dob is " + dateOfBirth);
        return dateOfBirth = dayOfBirth + "." + monthOfBirth + "." + yearOfBirth;

    }

    public int getAge() {
        //Date currentYear=new Date();
        int age;
        //String a=(filledEGN.substring(2,3));

        if (Integer.parseInt(filledEGN.substring(2, 3)) == 4) {

            String year = 20 + yearOfBirth;
            age = 2022 - Integer.parseInt(year);
            //age= Integer.parseInt(String.valueOf(currentYear))-Integer.parseInt(year);
        } else {

            String year = 19 + yearOfBirth;
            age = 2022 - Integer.parseInt(year);
        }
        return age;

    }

    //TODO wrong sex implementation to be developed

    /**
     * This method provides options for gender entry. If not one from the given list, gender is set to N/A
     *
     * @return String
     */
    public String addSex() {
        System.out.println("Please provide your gender as follows: 'female' or 'male'");
        Scanner myInput = new Scanner(System.in);
        String gender = myInput.nextLine();
        switch (gender) {
            case "female":

            case "male":
                return gender;
            default:
                System.out.println("Your entry is not handled correctly by the System. Your gender is set to N/A");
                gender = "N/A";
        }
        return gender;
    }

    public String sayHello() {

        String greeting = " ";

        switch (languageNative) {
            case "Bulgarian":
                greeting = "Здравей !";
                break;
            case "Italian":
                greeting = "Ciao !";
                break;

            default:
                greeting = "Hello !";
        }

        return greeting;
    }

    public String celebrateEaster() {
        String celebrateEaster = "";

        switch (religion) {
            case "Orthodox":
            case "Catholic":
                celebrateEaster = "Yes";
                break;
            case "Islam":
                celebrateEaster = "No";
                break;

            default:
                celebrateEaster = "N/A";

        }
        return celebrateEaster;
    }

    public String isAdult() {
        String isAdult;
        switch (country) {
            case "Bulgaria":
            case "Italy":
                if (getAge() >= 18) {
                    isAdult = "Yes";
                } else {
                    isAdult = "No";
                }
                break;

            case "USA": {
                if (getAge() >= 21) {
                    isAdult = "Yes";
                } else {
                    isAdult = "No";
                }
                break;
            }

            default:
                isAdult = "N/A. Your Country is not on our database";

        }
        return isAdult;
    }

    boolean canTakeALoan() {

        boolean loanAllowed = false;
        if ((job == " ") || (job == "No job")) {
            loanAllowed=false;
        } else {
            Scanner myInout= new Scanner(System.in);
            System.out.println( "Enter a monthly Salary: ");
            float monthlySalary=myInout.nextFloat();
            if ((monthlySalary >= 1000.00) && (getAge() >= 18)) {
                loanAllowed = true;
            }

        }

        return loanAllowed;
    }

    public static void main(String[] args) {
//        PersonMain person1 = new PersonMain("Nikolina", "Orthodox", "BG", "Bulgarian", " ", "Bulgaria");
//         PersonMain person2 = new PersonMain("Nikki",  "Islam", "Bulgarian", "Bulgarian", "QA", "Italy");
//         System.out.println(person1.sayHello());
//        System.out.println("Does the Person Celebrate Easter? " + person2.celebrateEaster());
//         System.out.println("Is this person adult? " + person2.isAdult());
//       System.out.println("Is allowed taking a loan? " + person1.canTakeALoan());
//
//
//        ClassAmerican americanPerson=new ClassAmerican("Nikol", "Orthodox", "Driver");
//        System.out.println(americanPerson.sayHello());
//        System.out.println("Are you considered as adult? " + americanPerson.isAdult());
//        System.out.println("Do you celebrate Easter? " + americanPerson.celebrateEaster());
//        americanPerson.celebrateMemorialDay();
//
//        ClassChildIsASubclass child1=new ClassChildIsASubclass("Darcy", "Catholic", "Italian", "Italian", "Italy");
//        System.out.println(child1.getAge());
//        System.out.println(child1.addSex());
//        System.out.println("Is allowed taking a loan? " +child1.canTakeALoan());

        ClassItalianChild italianPerson1 = new ClassItalianChild("Leonardo", "Catholic", "Pizza Master Chef");
        System.out.println(italianPerson1.sayHello());

    }
}
