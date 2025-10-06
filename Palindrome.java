package BasicMath;

import java.util.Scanner;

public class Palindrome {
    /*Write a program to determine if the given number is palindrome or not. Print true if it is palindrome false otherwise.
     * Palindrome are the numbers for which reverse is exactly same as the original one. For eg: 121
     */
    public static boolean  isPalindrome(int n){
        int lastDigit, rev = 0;
        int temp=n;
        while (n>0) {
            lastDigit = n%10;
            n = n/10;
            rev = (rev*10)+lastDigit;
        }
        if(temp==rev){return true;}
        else{return false;}
    }
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num =  sc.nextInt();
        System.out.println(isPalindrome(num));
    }
}
