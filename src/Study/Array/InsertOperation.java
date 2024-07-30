package Study.Array;

public class InsertOperation {
	public static void insert(int arr[],int pos,int x,int cap,int n) {
		int idx=pos-1;
		if(cap==n)
			System.out.println(arr.length);
		for(int i=n-1;i>=0;i--)
			arr[i+1]=arr[i];
		arr[idx]=x;
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static void main(String[] args) {
		int[] a=new int[5];
		a[0]=5;
		a[1]=7;
		a[2]=10;
		a[3]=20;
		insert(a,2,3,a.length,4);
	}
}
