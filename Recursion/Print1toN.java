package Recursion;

import java.util.Scanner;

public class Print1toN {
    //Print numbers from 1 to n using recursion
    public static void printNum(int i, int n){
        if(i<1) return;
        printNum(i-1,n);
        System.out.println(i);
        
    }
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want to print");
        int n = sc.nextInt();
        printNum(n, n);
    }
}
