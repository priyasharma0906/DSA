package Recursion;

import java.util.Scanner;

public class PrintNto1 {
    //Print numbers from n to 1 using recursion
    public static void printNum(int i, int n){
        if(i>n) return;
        printNum(i+1, n);
        System.out.println(i);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter  the number");
        int i = 1;
        int n = sc.nextInt();
        printNum(i,n);
    }

}
