import java.util.Scanner;
public class GCD {
    public static void gcd(int n, int m){
        while(n>0 && m>0)
        {
            if(n>m) n=n%m;
            else m=m%n;
        }
        if(n==0) System.out.println("GCD is "+m);
        else System.out.println("GCD is "+n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        gcd(Math.abs(a),Math.abs(b));
        
    }
}
//TC = log base phi(min(n,m));
//Check the explanation in PrimeNumbers program