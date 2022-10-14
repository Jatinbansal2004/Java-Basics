import java.util.*;

public class Javabasics { 
    public static int product(int a, int b) {
            int multiply = a*b;
            return multiply;
        }
    public static int factorial(int n) {
        int f = 1;
        for(int i = 1; i <= n; i++) {
            f = f * i;
        }

        return f;
    }
    public static int biocoff(int n ,int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int biocoffie = (fact_n / (fact_r*fact_nmr));
        return biocoffie;
    }
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        for(int i = 2; i <=Math.sqrt(n); i++) {
            if(n%i == 0) {
                return false;
            }
        }
        return true;
     }

    public static void primeInRange(int n) {
       for(int i=2; i<=n; i++) {
        if(isPrime(i)) {
            System.out.print(i + ",");
        }
       }

    }
    public static void binTodec(int n) {
        int myNum = n;
        int power = 0;
        int dec = 0;
        for (power = 0; n>0; power++) {
            int lastdigit = n%10;
            n = n/10;
            dec = dec + (lastdigit * (int)Math.pow(2, power));

        }
        System.out.println("Decimal of " + myNum + " = " + dec);
    }
    public static void decTobin(int decimal) {
        int myNum = decimal;
        int power = 0;
        int rem;
        int binary = 0;
        for(power = 0; decimal > 0; power++) {
            rem = decimal % 2;
            decimal /= 2;
            binary = binary + (rem*(int)(Math.pow(10,power)));

        }
        System.out.println("Binary of " + myNum + " = " + binary);
    }
    public static int average(int a, int b, int c) {
        int av = (a+b+c)/3;
        return av;
    }
    public static boolean isEven(int n) {
        if (n%2 == 0) {
            return true;
        }else{
            return false;
        }
    }
    public static void palindrome(int n) {
        int myNum = n;
        int rev = 0;
        int lastdigit;
        while(n > 0) {
            lastdigit = n%10;
            rev = (rev*10) + lastdigit;
            n = n/10;
        }
        if (myNum == rev) {
            System.out.println("palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }

    public static void sumDigits(int n) {
        int sum = 0;
        int lastdigit;
        while(n > 0) {
            lastdigit = n%10;
            sum += lastdigit;
            n /= 10;
        }
        System.out.println("Sum of the digits in a integer : " + sum);
    }

    public static void main(String[] args) {
        
        
        

    }

}
