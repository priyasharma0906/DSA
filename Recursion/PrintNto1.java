package Recursion;

import java.util.Scanner;

public class PrintNto1 {
    //Print numbers from 1 to n using recursion
    public static void printNum(int i, int n){
        if(i<1) return;
        System.out.println(i);
        printNum(i-1,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till you want to print");
        int n = sc.nextInt();
        printNum(n, n);
    }
}
