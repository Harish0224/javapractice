package Practice.com.java;

public class digits {

	public static void main(String[] args) {
		
		String str="sjdt8349tn8f348tr34t";
		String digits=str.replaceAll("[^0-9]", "");
		System.out.println(digits);

	}

}
