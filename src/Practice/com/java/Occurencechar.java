package Practice.com.java;

public class Occurencechar {

	public static void main(String[] args) {
		String str = "kusumakumari";
       char ch = 's';
       int cnt = 0;
     
    for ( int i = 0; i < str.length(); i++) {
        if (str.charAt(i) == ch)
            cnt++;
    }
    System.out.println("Occurrences of "+ch+" is: " +cnt);
}

	

}
