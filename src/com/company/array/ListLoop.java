package com.company.array;

public class ListLoop {
    public static void main(String[] args) {
        int [] list1 = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int [] list2={};
        int i;

        for (i=0; i< list1.length; i++){
            int residue=list1[i]%5;
                      if (residue==0){
                int number=list1[i];
                if(number>150){
                    break;}
                else{
                    System.out.println("Number divisible by 5 is: "+list1[i]+"; ");
                }
            }
        }
    }
}
