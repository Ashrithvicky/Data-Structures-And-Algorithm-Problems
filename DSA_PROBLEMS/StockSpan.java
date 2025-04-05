package DSA_PROBLEMS;

public class StockSpan {
	public void Stokspan(int[] Arr,int[] Final_arr) {
		for(int i=0;i<Arr.length;i++) {
			if(i==0) {
				Final_arr[i] = 1;
			}
			else {
				int count = 0;
				if(Arr[i]<Arr[i-1]) {
					count += 1;
					Final_arr[i] = count;
				}
				else {
					int j = i-1; //j=1; for value 5
					int counts = 0;  
					while(j>=0) {
						if(!(Arr[i] < Arr[j])) {
							counts += 1;
						}
						else if(Arr[i] < Arr[j]){
							counts += 1;
							Final_arr[i] = counts;
							break;
						}
						j = j-1;
						Final_arr[i] = counts+1;
					}
				}

			}
		}
		for(int i=0;i<Final_arr.length;i++) {
			System.out.println(Final_arr[i]);
		}
	}
	
	public void Display(int[] Final_arr) {
		for(int i=0;i<Final_arr.length;i++) {
			System.out.println(Final_arr[i]);
		}
		
	}
}
