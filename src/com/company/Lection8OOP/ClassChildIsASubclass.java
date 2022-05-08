package com.company.Lection8OOP;

import java.util.Scanner;

public class ClassChildIsASubclass extends PersonMain {
    public ClassChildIsASubclass(String name, String religion, String languageNative, String nationality, String country) {
        super(name, religion, languageNative, nationality, "No job", country);
        addSex();
    }

    @Override
    public String addSex() {
        String gender="Female";
        return gender;
    }

    boolean canTakeALoan() {
        boolean loanAllowed=false;

        if (getAge() < 18) {

            System.out.println("Not soon - get 18 and a job ;) ");

        }
        else {
            super.canTakeALoan();
        }
      return loanAllowed;
    }
}
