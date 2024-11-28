package hj;
import java.util.Scanner;
public class extract_count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		System.out.println("enter digit");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		
		while(n>0) {
			int lastdigit = n% 10;
			System.out.println(lastdigit + " ");
			count = count+1;
			n = n/10;		
		}
		System.out.println("\nTotal number of digits: " + count);
	}

}
