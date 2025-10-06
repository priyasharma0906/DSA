package BasicMath;
import java.lang.Math;
import java.util.Scanner;
public class CountDigit {

    // You are given an integer n. You need to return the number of digits in the number.
    // The number will have no leading zeroes, except when the number is 0 itself.
    // Examples:
    // Input: n = 4
    // Output: 1
    // Explanation: There is only 1 digit in 4.
    // Input: n = 14
    // Output: 2
    // Explanation: There are 2 digits in 14.
        // public static int count(int n){
        //         int cnt = 0;
        //         while (n>0) {
        //             cnt+=1;
        //             n/=10;
        //         }
        //         return cnt;
        //     }
           //Another method
    public static int count(int n){
        //So for example we have 7789 as out number so log base 10 of 7789 on the calculator is somewhere around 3.89 and then we 
        //add 1 to it then we get 4.89 and it will be truncated to 4 an interger.
        int cnt = (int)(Math.log10(n)+1);
        return cnt;
    }
    public static void main(String[] args) {
        System.out.print("Enter an integer : ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(count(num));
    }
}
/*-------Count digits---------
TC-> O(log base 10 (n))
i.e. the number of times the loop is running and the loop is running the number of times n is being divided by 10, therefore the complexity is O(log10(n)+1) which is near about O(log10(n))
Now,
	Whenever there is division and the number is divided by 10 then the complexity will be log10(n) or if the number is divided by 2 then the complexity will  be log2(n). If the division is happening by 5 then the complexity will be log5(n)
Now for time complexity if the number of iterations is depeding on the number being divided then the time complexity will be logarithmic always.	

Reverse a number

WAP to generate the reverse of a given number N.Print the corresponding reverse number.
Note:If the number has trailing zeros. Then its reverse will not include them.
For example: Reverse of 10400 will be 401 instead of 00401.

int rev = 0;
public static int reverseNum(int n){
	lastDigit = n%10;
	rev = (rev*10)+lastDigit;
	n=n/10;
} */