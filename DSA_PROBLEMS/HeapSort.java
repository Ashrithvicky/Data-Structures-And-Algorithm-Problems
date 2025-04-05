package DSA_PROBLEMS;
import java.util.ArrayList;

public class HeapSort{
	
	static ArrayList<Integer> Heap = new ArrayList<>();
	
	static class Tree{
		int Data;
		Tree Left;
		Tree Right;
		Tree(int value){
			Data = value;
			Right = Left = null;
		}
	}
	public ArrayList<Integer> convertIntoTreeMin(String[] Arr,int i) {
		if(i>=Arr.length || Arr[i] == null) {
			return Heap;
		}
		Heap.add(Integer.parseInt(Arr[i]));
		int currentIndex = Heap.size() - 1;
		int parentIndex = getParent(currentIndex);
		while (currentIndex > 0 && Heap.get(currentIndex) < Heap.get(parentIndex)) {
			// Swap child and parent if child is smaller
			int temp = Heap.get(currentIndex);
			Heap.set(currentIndex, Heap.get(parentIndex));
			Heap.set(parentIndex, temp);

			// Move up the tree
			currentIndex = parentIndex;
			parentIndex = getParent(currentIndex);
		}
		convertIntoTreeMin(Arr,i*2+1);
		convertIntoTreeMin(Arr,i*2+2);
		
		return Heap;
	}
	
	public void DisplayHeap(){
		for(int i:Heap) {
			System.out.println(i);
		}
	}
	public static int getParent(int index) {
		if(index == 2 || index == 1) {
			return 0;
		}
		else {
			return (index-1)/2;
		}
	}
	
	public static void main(String[] args) {
		HeapSort HS = new HeapSort();
		String[] Arr = {"1","2","3","4","5","6","7"};
		HS.convertIntoTreeMin(Arr,0);
		HS.DisplayHeap();
	}
}
