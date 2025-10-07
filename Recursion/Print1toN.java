package Recursion;

import java.util.Scanner;

public class Print1toN {
    //Print numbers from n to 1 using recursion
    public static void printNum(int i, int n){
        if(i>n) return;
        System.out.println(i);
        printNum(i+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the number");
        int i = 1;
        int n = sc.nextInt();
        printNum(i,n);
    }

}