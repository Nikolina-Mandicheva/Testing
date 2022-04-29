package com.company.Lection8OOP;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonMain {
    final String name, sex, religion, languageNative, nationality;
    final String EGN;
    String age, dateOfBirth;
    String job, country;
    String filledEGN;

    public PersonMain(String name, String sex, String religion, String languageNative, String nationality,  String age, String dateOfBirth, String job, String country) {
        this.name = name;
        this.sex = sex;
        this.religion = religion;
        this.languageNative = languageNative;
        this.nationality = nationality;
        this.EGN = addEGN();
        this.age = age;
        this.dateOfBirth = getDOB();
        this.job = job;
        this.country = country;
    }

    //creating java doc which explains what the below method does, shortcut to start is is /**+enter
    /**
     * This method checks if the entered user's input egn is 10digits
     * @return String
     */
    String addEGN(){
        Scanner myInput=new Scanner(System.in);
        System.out.println("Add EGN id number which is 10 digits: ");
        String egnInput= myInput.nextLine();
        if (   egnInput.chars().count()!=10     ){
            /*egnInput.length()*/
            throw new InputMismatchException("EGN must be exactly 10 digits! you've entered " + egnInput.chars().count() + "digits");
        }
        filledEGN=egnInput;
        return egnInput;

    }

    public String getDOB(){
        //divide into 3 different variables which get the substring for yy/mm/dd , then concatinate these into the returned variable for dob
        String dob=filledEGN.substring(0,6);
        System.out.println("dob is " + dob);
        String yearOfBirth=filledEGN.substring(0,2);
        return dob;
    }

    //TODO wrong sex implementation to be developed

    public static void main(String[] args) {
        PersonMain person1=new PersonMain ("Nikolina", "female", "Christian", "BG", "Bulgarian", "30", "12.08.197", "QA", "Bulgaria");
    }
}
