package Study.Array;

public class SecondLargest {
	public static int secondLargest(int[] arr) {
		int l=0,res=-1;
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>arr[l]) {
				res=l;
				l=i;
			} else if(arr[i]!=arr[l]) {
				if(res==-1||arr[i]>arr[res])
					res=i;
			}
		}
		return arr[res];
	}
	public static void main(String[] args) {
		int[] arr= {5,20,12,20,8};
		System.out.println(secondLargest(arr));
	}
}
