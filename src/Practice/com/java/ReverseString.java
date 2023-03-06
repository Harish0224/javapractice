package Practice.com.java;

import java.util.Scanner;

public class ReverseString {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the String: ");
		String str=sc.nextLine();
		String res[]=str.split(" ");
		String s="";
		for(int i=res.length-1;i>=0;i--) {
			s+=res[i]+" ";
		}
			System.out.print("Reversed words: " +s.substring(0,s.length()-1));
		}
	
	}
