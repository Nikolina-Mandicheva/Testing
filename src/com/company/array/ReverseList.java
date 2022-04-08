package com.company.array;

public class ReverseList {
    public static void main(String[] args) {
        int[] list1={10,20,30,40,50};
        int[] newArray=new int[list1.length];
        int i,j= newArray.length;


        for (i=list1.length-1;i>=0;i--){
                  // for(j= 0;j< newArray.length;j++){
          //newArray[j]=  list1[i];
               // j++;

               System.out.print(list1[i]);
               newArray[i]=list1[i];
            }
        }
    }

