package Study.Array;

public class SearchOperation {
	public static int search(int a[],int x) {
		for(int i=0;i<a.length;i++)
			if(a[i]==x)
				return i;
		return -1;
	}
	public static void main(String[] args) {
		int[] a= {20,5,7,25};
		System.out.println(search(a,7));
	}
}
