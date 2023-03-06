package Practice.com.java;

import java.util.Scanner;

public class Even {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value:");
		int num=sc.nextInt();
		System.out.print("Even number from 1 to "+num+" is:");
		for(int i=1;i<=num;i++) {
			if(i%2==0) {
				System.out.print(i+" ");
				
			}
		}
		
		

	}

}
