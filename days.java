package hj;

import java.util.Scanner;

public class days {

	public static void main(String[] args) {
		System.out.println("enter day (1-7)");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int day = a;
		switch(day) {
		case 1:
			System.out.println("monday");
			break;
		case 2:
			System.out.println("tuesday");
			break;	
		case 3:
			System.out.println("wednesday");
			break;	
		case 4:
			System.out.println("thurusday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;	
		case 7:
			System.out.println("sunday");
			break;	
		default:
			System.out.println("invalid");
			
		}
		

	}

}
