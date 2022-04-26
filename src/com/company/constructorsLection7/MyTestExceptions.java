package com.company.constructorsLection7;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyTestExceptions {
    public static void main(String[] args) throws FileNotFoundException, ArithmeticException, IOException {
        throw new IOException();
        //System.out.println(2/0);
       // File file= new File("E://file.txt");
      // FileReader fr=new FileReader(file);
    }
}
