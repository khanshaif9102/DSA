package Study.Array;

public class LargestElement {
	public static int getLargest(int[] arr) {
		int l=0;
		for(int i=1;i<arr.length;i++)
			if(arr[i]>arr[l])
				l=i;
		return arr[l];
	}
	public static void main(String[] args) {
		int[] arr= {10,5,20,8};
		System.out.println("Largest Element is:"+getLargest(arr));
	}
}
