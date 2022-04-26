package com.company.constructorsLection7;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FixThisCodeException {

    public static FileWriter getFileWriter(String filePath) throws IOException {
        FileWriter fileWriter=new FileWriter(filePath,true);
        return fileWriter;
    }

    public static void printToFile(FileWriter fileWriter, String text, int repeat) throws IOException{
        for (int i=0;i<repeat;i++){
         fileWriter.write(text+"\n");
        }
        fileWriter.flush();
        fileWriter.close();
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter file path: ");
        String filePath=scanner.nextLine();
        System.out.println("Enter int for how many times ");
        int howManyTimesToPrintTheTextToFile= scanner.nextInt();
        System.out.println("Text to add:");
        String textToAdd= scanner.next();
        printToFile(getFileWriter(filePath), textToAdd, howManyTimesToPrintTheTextToFile);
    }
}
