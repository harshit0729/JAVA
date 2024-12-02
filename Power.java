package hj;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        int result = 1;
        System.out.println("Enter number");
    	Scanner sc = new Scanner(System.in);
    	int base = sc.nextInt();
    	int exponent = sc.nextInt();
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println(base + "^" + exponent + " = " + result);
    }
}
