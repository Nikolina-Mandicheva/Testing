package com.company.dataStructuresLection5;

import java.util.ArrayList;
import java.util.Collections;

public class Lists {
    public static void main(String[] args) {
        ArrayList <String> newList=new ArrayList<>();
        //adding elements in the ArrayList
        newList.add("flower");
        newList.add("sunflower");
        newList.add("listing");
        newList.add("rose");
        newList.add("23435");
        System.out.println(newList);
        //change element
        newList.set(0,"ArrayItem");
        System.out.println(newList.get(0));
        //remove element from the ArrayList
        newList.remove(3);
        //Loop through ArrayList
        for (String i: newList ) {
            System.out.println(i);
        }

        //Sorting thru ArrayList
        Collections.sort(newList);
        for (String i: newList ) {
            System.out.println(i);
        }

          }
}
