package DSA_PROBLEMS;
import java.util.ArrayList;

public class MinimumStack {
	ArrayList<Integer> Stack;
	
	public MinimumStack() {
		Stack = new ArrayList<>();
	}
	
	public void Push(int Value) {
		Stack.add(Value);
		CheckMinStack();
	}
	
	public void Display() {
		for(int i=0;i<Stack.size();i++) {
			System.out.println(Stack.get(i));
		}
	}
	
	public void Pop() {
		Stack.remove(0);
	}
	
	public void GetMin() {
		System.out.println(Stack.get(0));
	}
	public void CheckMinStack() {
		for(int i=Stack.size()-1;i>=0;i--) {
			if(i>=1) {
				if(Stack.get(i) < Stack.get(i-1)) {
					int Temp = Stack.get(i);
					Stack.set(i,Stack.get(i-1));
					Stack.set(i-1, Temp);
				}
			}
		}
	}
}
