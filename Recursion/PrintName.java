package Recursion;

import java.util.Scanner;

public class PrintName {
    // Print name n times using rescursion
    public static void func(int a, int b){
        if(a>b) return;
        System.out.println("Priya");
        func(a+1, b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of times you want your name to be printed : ");
        int i = 1;
        int n = sc.nextInt();
        func(i, n);

    }
}
//TC = O(n);
//SC = O(n) => stack space : the number of functions waiting in the stack
