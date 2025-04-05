package DSA_PROBLEMS;

public class KadaneAlgorithm {
	public static void main(String[] args) {
		int[] Arr = {5, 4, 1, 7, 8};
		int value = KadaneAlgoCheck(Arr);
		System.out.println(value);
	}
	
	public static int KadaneAlgoCheck(int[] arr) {
		int CurrentSum = 0;
		int MaxSum = Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			CurrentSum += arr[i];
			MaxSum = Math.max(MaxSum, CurrentSum);
			if(CurrentSum < 0) {
				CurrentSum = 0;
			}
		}
		return MaxSum;
	}
}

