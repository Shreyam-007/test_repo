package Recursion;

import java.util.Scanner;

public class Factorial {
    static long fact(long n){
        if (n<=1){
            return 1;
        }else {
           return n*fact(n-1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        fact(n);
        System.out.println(fact(n));
    }
}
