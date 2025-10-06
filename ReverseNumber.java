package BasicMath;

import java.util.Scanner;

public class ReverseNumber {
    /*Write a program to generate the reverse of a given number N. Print the corresponding reverse number. Note: 
    If a number has trailing zeros, then its reverse will not include them. For eg, reverse of 10400 will be 401 instead of 40100. */
    public static int  revNum(int n){
        int lastDigit, rev = 0;
        while (n>0) {
            lastDigit = n%10;
            n = n/10;
            rev = (rev*10)+lastDigit;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        System.out.println(revNum(num));
    }
}
