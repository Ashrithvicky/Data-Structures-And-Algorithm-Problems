package DSA_PROBLEMS;

public class CandyArray2 {
	
	public void CandyArrayCal(int[] ratings) {
		int[] Candy = new int[ratings.length];
		int Count = 1;
		int Sum = 0;
		for(int i=0;i<ratings.length;i++) {
			if(i==0) {
				if(ratings[i] > ratings[i+1]) {
					Candy[i] = Count + 1;
				}
				else {
					Candy[i] = Count;
				}
			}
			
			else if(ratings[i] > ratings[i-1]){
				Candy[i] = Candy[i-1] + 1;				
			}
			
			else {
				Candy[i] = Count;
			}
			
			Sum = Sum + Candy[i];
		}
		System.out.println(Sum);
	}
}
