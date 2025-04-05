package DSA_PROBLEMS;
import java.util.ArrayList;
import java.util.*;

public class MaximumSlidingWindow {
	public static void main(String[] args) {
		ArrayList<Integer> List = new ArrayList<>();
		Scanner sc  =  new Scanner(System.in);
		int[] Arr = {1,3,-1,-3,5,3,6,7};
		int Count = sc.nextInt();
		MaxSlide(Arr, Count, List);
		for(int L: List) {
			System.out.println(L + " ");
		}
	}
	
	public static void MaxSlide(int[] Arr, int Count, ArrayList<Integer> List) {
		for(int i=0;i<Arr.length;i++) {
			for(int j=i;j<=i+Count;j++) {
				if(Arr[j] > Arr[j+1] && Arr[j] > Arr[j+2]) {
					List.add(Arr[j]);
				}
				else if(Arr[j+1] > Arr[j] && Arr[j+1] > Arr[j+2]) {
					List.add(Arr[j+1]);
				}
				else {
					List.add(Arr[j+2]);
				}
			}
		}
	}
}
