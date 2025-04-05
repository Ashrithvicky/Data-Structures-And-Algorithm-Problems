package DSA_PROBLEMS;

import java.util.Arrays;

public class ErrorRateProb {
	public static int ErrorCheck(int[] Arr, int p, int q) {
		Boolean Error = true;
		int i = 0;
		int iterateCount = 0;
		while(Error && i<Arr.length) {
			if (Arrays.stream(Arr).allMatch(x -> x == 0)) {
			    Error = false;
			    return iterateCount;
			}

			
			//Arrays.sort(Arr);
			for(int m=0;m<Arr.length;m++) {
				if(Arr[m]<p) {
					continue;
				}
				else if(Arr[m]>p) {
					int value = Arr[m] - p;
					Arr[m] = Math.max(Arr[m], value);
					subElements(m, Arr, q);
				}
			}
			
			iterateCount++;
		}
		return iterateCount;
	}
	
	public static void subElements(int m, int[] Arr, int Q) {
		for(int i=0;i<Arr.length;i++) {
			if(i == m) {
				continue;
			}
			if(Arr[i] > 0) {
				int value = Arr[i] - Q;
				Arr[i] = Math.max(value, Arr[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		int[] Arr = {6,4,1};
		int p = 4;
		int q = 1;
		int value = ErrorCheck(Arr, p, q);
		System.out.println(value);
	}
}
