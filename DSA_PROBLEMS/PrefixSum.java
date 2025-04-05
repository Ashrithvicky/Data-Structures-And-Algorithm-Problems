package DSA_PROBLEMS;

public class PrefixSum {
	public static void main(String[] args) {
		int[] arr = {};
		int value = PrefixSumCal(arr);
		System.out.println(value);
	}
	
	public static int PrefixSumCal(int[] arr) {
		int[] Arr = new Arr[arr.length];
		int value = 0;
		for(int i=0;i<arr.length;i++) {
			value += arr[i];
			Arr[i] = value;
		}
		return -1;
	}
}
