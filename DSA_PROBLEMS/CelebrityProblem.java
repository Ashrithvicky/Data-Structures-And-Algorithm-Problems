package DSA_PROBLEMS;
import java.util.ArrayList;

public class CelebrityProblem {
	public void CelebrityCheck(int[][] Matrix) {
		ArrayList<Integer> List = new ArrayList<>();
		int celebrity = 0;
		/*boolean celebrity = true;*/
		for(int i=0;i<Matrix.length;i++) {
			int celebritys = 0;
			for(int j=0;j<Matrix[i].length;j++) {
				if(Matrix[i][j] == 0) {
					celebrity += Matrix[i][j];
				}
			}
			if(celebrity)
		}
		for(int i: List) {
			System.out.println(i);
		}
	}
}
