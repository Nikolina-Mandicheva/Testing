package com.company.dataStructuresLection5;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList <String> myList= new LinkedList <>();

        /* myList.add("one");
        myList.add("two");
        myList.add("three");
        myList.add("five");
        myList.add("one");
        myList.add("banana");*/

        //How to enter values from input
        Scanner myEntry=new Scanner(System.in);
        System.out.println("How many elements the Linked List will have? ");
        int num= myEntry.nextInt();
        int i;

        for (i=0;i<num;i++){
            System.out.println("Add list element: ");
            String element= myEntry.next();
            myList.add(element);
        }

        System.out.println(myList);

        Collections.reverse(myList);
        for (String j:myList) {
            System.out.println(j);
        }
        //how to rotate the positions to user the loop?
       /* for (int k=0; k<num/2; k++){
           String x=myList.get(k);
           String y=myList.getLast();
           myList.set(0,y);
           myList.set((num-1-к),x);
        }
         System.out.println(myList); */



    }
}
