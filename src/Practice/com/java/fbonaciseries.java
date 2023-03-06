package Practice.com.java;

import java.util.Scanner;

public class fbonaciseries {

	public static void main(String[] args) {
		int numTerms;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms in the series: ");
        numTerms = sc.nextInt();
        sc.close();

        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm;

        System.out.print("Fibonacci Series up to " + numTerms + " terms: ");
        for (int i = 1; i <= numTerms; i++) {
            if (i == 1) {
                System.out.print(firstTerm + " ");
                continue;
            }
            if (i == 2) {
                System.out.print(secondTerm + " ");
                continue;
            }
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            System.out.print(nextTerm + " ");
        }
    }


}
