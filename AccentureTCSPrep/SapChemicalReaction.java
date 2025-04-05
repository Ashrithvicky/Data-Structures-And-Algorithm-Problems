package AccentureTCSPrep;
import java.util.*;

public class SapChemicalReaction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] Arr = {2,-4,3,18,8,10};		
		int Max = 0;
		int Divisor = 0;
		
		for(int j=0;j<Arr.length;j++) {
			for(int i=0;i<Arr.length;i++) {
				if(j!=i) {
					int m = Arr[j] * Arr[i];
					if(m > Max) {
						Max = m;
						Divisor = Arr[j];
					}
				}
			}
		}
		int divident = Max / Divisor;
		System.out.println(Divisor + divident);
	}
}

//int n = sc.nextInt();
/*int[] Arr = new int[n];
for(int i=0;i<n;i++) {
	Arr[i] = sc.nextInt();
}*/

