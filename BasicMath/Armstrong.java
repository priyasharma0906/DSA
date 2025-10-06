package BasicMath;
import java.lang.Math;
import java.util.Scanner;
public class Armstrong {
    /*Write a program to check whether the number is armstrong or not.
     * An Armstrong number (also called a narcissistic number) is a number that is equal to the sum of its own digits each raised to the power of the number of digits.

Definition:
For an n-digit number, if the sum of its digits each raised to the nth power is equal to the number itself, then it is an Armstrong number.
     */
    public static boolean isArmstrong(int n){
        int dup=n, temp=n;
        int lastDigit=0, arm=0, count=0;
        count = (int)(Math.log10(n)+1);
        while(temp>0){
            lastDigit = temp%10;
            arm = (int)(Math.pow(lastDigit, count)+ arm);
            temp = temp/10;
        }
        if(dup==arm){return true;}
        else{return false;}
    }
    public static void main(String[] args) {
        System.out.print("Enter the number : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isArmstrong(num));
    }
}
