package AccentureTCSPrep;

public class SapEthanQuestion {
	public static void main(String[] args) {
		/*int n = sc.nextInt();
		int Arr = new int[n];
		int p = sc.nextInt();
		int q = sc.nextInt();*/
		int[] Arr = {6,4,1};
		int p = 4;
		int q = 1;
		int Value = 0;
		
		int[] checkArr = {0,0,0};
		
		if(Arr.equals(checkArr)) {
			Value = 0;
		}
		int i=0;
		while(!Arr.equals(checkArr)) {
			if(Arr[i] > p && Arr[i]!=0) {
				Value += 1;
				Arr[i] = Arr[i] - p;
				for(int j=i;j<Arr.length;j++) {
					if(Arr[j]>1) {
						Arr[j] = Arr[j] - q;
					}
				}
			}
			else if(Arr[i]<p) {
				Arr[i] = 0;
				Value += 1;
				Arr[i] = Arr[i] - p;
				int j=0;
				while(j<Arr.length && i!=j) {
					if(i!=j) {
						if(Arr[j]>1) {
							Arr[j] = Arr[j] - q;
						}
					}
					else {
						j++;
					}
					j++;
				}
			}
			else {
				i++;
			}
		}
		System.out.println(Value);
	}
}
