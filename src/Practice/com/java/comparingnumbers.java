package Practice.com.java;

import java.util.Scanner;

public class comparingnumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the first number:");
		int i=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.print("Enter the second number:");
		int j=sc.nextInt();
		
		if(i==j) {
			System.out.println("Both number"+i+" and "+j+" are equal");
		}
		else if(i>j) {
			System.out.println(i+" is greater than "+j);
		}
		else {
			System.out.println(j+" is greater than "+i);
		}
		

	}

}
