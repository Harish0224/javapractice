package Practice.com.java;

import java.util.Scanner;

public class Duplicatevalue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string: ");
		String str=sc.nextLine();
		char[] arr=str.toCharArray();
		System.out.print("Duplicate values are:");
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(arr[i]==arr[j]) {
					System.out.print(arr[j]+" ");
					break;
				}
			}
		}

	}

}
