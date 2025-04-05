package DSA_PROBLEMS;
import java.util.ArrayList;


public class RandomisedSet {
	
	ArrayList<Integer> List;
	
	public RandomisedSet() {
		List = new ArrayList<>();
	}
	
	public void Insert(int Value) {
		if(!List.contains(Value)) {
			List.add(Value);
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	public void Remove(int Value) {
		if(List.contains(Value)) {
			for(int i=0;i<List.size();i++) {
				if(List.get(i) == Value) {
					List.remove(i);
				}
			}
			System.out.println(true);
		}
		else {
			System.out.println(false);
		}
	}
	
	public void getRandom() {
		int min = 0;
		int randomNum = (int) (Math.random() * (List.size() - min + 1)) + min;
		if(List.size()>=1) {
			System.out.println(List.get(randomNum));
		}
		else {
			return;
		}
		
	}
}
