/*
Question : Given an ArrayList of size N and an integer X. The task is to return all the indices of the integer X in
           the array.
___________________________________________________________________________________________________________________
I/O ARR[] = [1,2,3,2,2,5],X = 2,N = 6
O/P = 1 3 4
___________________________________
I/O ARR[] = [8,8,8],X = 8,N = 3
O/P = 0 1 2
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int initialization,ArraySize,FindingElement,LoopCount,index = 0;
        System.out.println("Enter the length of array :");
        ArraySize = sc.nextInt();
        LoopCount = ArraySize;
        ArrayList<Integer> OriginalArray = new ArrayList<>();

        System.out.println("Enter the element you want to find in given arraylist :");
        FindingElement = sc.nextInt();
        System.out.println("Enter the element of ArrayList :");
        for (initialization = 0; initialization < ArraySize; initialization++){
            OriginalArray.add(sc.nextInt());
        }
        System.out.println("Printing the result without using recursion :");
        for (initialization = 0; initialization < OriginalArray.size(); initialization++){
            if (FindingElement == OriginalArray.get(initialization)){
                System.out.println(OriginalArray.get(initialization));
                LoopCount--;
            }
        }
        System.out.println();
        if (LoopCount == ArraySize){
            System.out.println("Number is not present in arraylist :");
         }
        System.out.println();
        System.out.println("Printing the number with help of recursion :");

    }
}