package Study.Array;

public class DeleteOperation {
	public static void delete(int[] arr, int n) {
		int idx = 0;
		int[] dum;
		int i;
		for (i = 0; i < arr.length; i++) {
			if (arr[i] == n) {
				break;
			}
		}
		if (i == arr.length) {
			System.out.println(i);
		} else {
			for (int j = i; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
		}
		for (int k = 0; k < arr.length; k++) {
			System.out.println(arr[k]);
		}
	}

	public static void main(String[] args) {
		int[] a = new int[8];
		a[0] = 3;
		a[1] = 8;
		a[2] = 12;
		a[3] = 5;
		a[4] = 6;
		delete(a, 12);
	}
}
