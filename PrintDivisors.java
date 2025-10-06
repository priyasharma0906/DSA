package BasicMath;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class PrintDivisors {
    // You are given an integer n. You need to find all the divisors of n as an array or list in a sorted order.
    // A number which completely divides another number is called it's divisor.
    // Examples: Input: n = 6
    // Output = [1,2,3,6]
    // Explanation: The divisor of 6 are  1,2,3,6
    // Input: n = 8
    // Output: [1,2,4,8]
    // Explanation: The divisor of 8 are 1,2,4,8

    //We are using list here because we don't have predefined number of elements 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        //This whole loop is running for O(sqrt(n))
        //6*6<=36
        //7*7<=36 false
        for(int i=1; i*i<=n; i++){
            if(n%i == 0){list.add(i);
                if(n/i != i){list.add(n/i);}}
        }
        //  This takes Sorting k numbers takes O(k log k) time (using Timsort in Java).
        //     Here, k = d, where d = number of divisors of n.
        //     In general, d grows much more slowly than n.
        //     For example, n = 10^6 has only 240 divisors.
        //     But in the worst case, d is bounded by 2√n (since divisors come in pairs).
        //     So:O(dlogd)≤O(√nlog√n)
        //     And since log √n = (1/2) log n, we usually write it as:
        //     O(√nlogn)
        // Total complexity : O(√n+√nlogn)=O(√nlogn)
        Collections.sort(list);
        System.out.println(list);
    }
}
