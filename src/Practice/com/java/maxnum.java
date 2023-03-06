package Practice.com.java;

public class maxnum {

	public static void main(String[] args) {
		int[] arr= {43,588,98,100};
		int max=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		System.out.println(max);
	}

}
