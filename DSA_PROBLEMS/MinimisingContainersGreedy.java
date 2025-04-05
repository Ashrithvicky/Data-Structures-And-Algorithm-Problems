package DSA_PROBLEMS;
import java.util.*;

public class MinimisingContainersGreedy {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int N = sc.nextInt();
		int[] Arr = new int[N];
		for(int i=0;i<N;i++) {
			Arr[i] = sc.nextInt();
		}
		int Containers = sc.nextInt();
		int value = MinContainers(Arr, Containers);
		System.out.println(value);
	}
	
	public static int MinContainers(int[] Arr, int Containers) {
		int count = 0;
		int CurrentWeight = 0;
		Arrays.sort(Arr);
		for(int i=0;i<Arr.length;i++) {
			if(CurrentWeight + Arr[i] <= Containers) {
				CurrentWeight += Arr[i];
			}
			else {
				count++;
				CurrentWeight = Arr[i];
			}
		}
		if(CurrentWeight > 0) {
			count++;
		}
		
		return count;
	}
}
