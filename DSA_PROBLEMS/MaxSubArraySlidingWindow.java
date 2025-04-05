package DSA_PROBLEMS;
import java.util.ArrayList;


public class MaxSubArraySlidingWindow {
	public static int SubMaxArray(int[] arr, int k) {
		int MaxValue = 0;
		int Value = 0;
		for(int i=0;i<k;i++) {
			Value += arr[i];
		}
		MaxValue = Value;
		for(int i=k;i<arr.length;i++) {
			Value += arr[i] - arr[i-k];
			MaxValue = Math.max(Value, MaxValue);
		}
		return MaxValue;
	}
	
	public static void main(String[] args) {
		int[] Arr = {4, 2, 1, 7, 8, 1, 2, 8, 1, 0};
		int k = 3;
		int value = SubMaxArray(Arr,k);
		System.out.println(value);
	}
}
