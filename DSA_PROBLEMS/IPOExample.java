package DSA_PROBLEMS;
import java.util.ArrayList;

public class IPOExample {
	public int findMaximisedCapital(int k, int w,int[] profits, int[] capital) {
		ArrayList<Integer> Arr = new ArrayList<>();
		for(int i=0;i<capital.length;i++) {
			if(w==capital[i]) {
				Arr.add(i);
				w += profits[i];
				System.out.println("W:"+w);
				break;
			}
		}
		int j=1;
		int count = -1;
		while(j<k) {
			int max = 0;
			for(int i=0;i<profits.length;i++) {
				if(!Arr.contains(i)) {
					if(profits[i]>max) {
						max = profits[i];
						System.out.println("Max:"+max);
						count = i;
					}
				}
			}
			// If no valid project is found, break the loop
            if (count == -1) {
                System.out.println("No eligible projects available. Exiting...");
                break;
            }

            // Add the selected project to Arr and update capital
            Arr.add(count);
            w += max; // Update capital with the profit from the selected project
            System.out.println("Selected project: " + count + ", Max: " + max + ", W: " + w);
			j=j+1;
		}
		return w;
	}
}
