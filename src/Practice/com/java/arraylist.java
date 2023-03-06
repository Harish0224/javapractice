package Practice.com.java;

import java.util.ArrayList;

public class arraylist {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("kumar");
		list.add("Harish");
		//System.out.println(list.get(1));
		//System.out.println(list.size());
		for(String a:list) {
			System.out.println(a);
			
		}
	}

}
