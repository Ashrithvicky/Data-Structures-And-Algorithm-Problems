package DSA_PROBLEMS;
import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
	private ArrayList<T> List;
	
	public Heap() {
		List = new ArrayList<>();		
	}
	
	public void Swap(int first,int second) {
		T Temp = List.get(first);
		List.set(first, List.get(second));
		List.set(second, Temp);
	}
	
	private int parent(int index) {
		return (index - 1)/2;
	}
	
	private int left(int index) {
		return index*2+1;
	}
	
	private int right(int index) {
		return index*2+2;
	}
	
	public void InsertElement(T Value) {
		List.add(Value);
		upHeap(List.size()-1);
		System.out.println("List Size: " + List.size());
	}
	
	public void upHeap(int index) {
		if(index==0) {
			return ;
		}
		int p = parent(index);
		if(List.get(index).compareTo(List.get(p))<0) {
			Swap(index,p);
			upHeap(p);
		}
	}
	
	public T remove() throws Exception{
		if(List.isEmpty()) {
			throw new Exception("Heap Empty");
		}
		T Temp = List.get(0);
		T Last = List.remove(List.size()-1);
		if(!List.isEmpty()) {
			List.set(0, Last);
			DownHeap(0);
		}
		return Temp;
	}
	
	public void Display() {
		for(int i=0;i<List.size();i++) {
			System.out.println(List.remove(i));
		}
	}
	
	public void DisplayElements() {
		for(int i=0;i<List.size();i++) {
			System.out.println(List.get(i) + "   ");
		}
	}
	
	public void DownHeap(int index) {
		int min = index;
		int left = left(index);
		int right = right(index);
		if(left<List.size() && List.get(min).compareTo(List.get(left))>0) {
			min = left;
		}
		if(right<List.size() && List.get(min).compareTo(List.get(right))>0) {
			min = right;
		}
		if(min!=index) {
			Swap(min,index);
			DownHeap(index);
		}
	}
	
	public void HeapElement(int Index) {
		System.out.println(List.get(List.size() - Index));
	}
	
	public ArrayList<T> heapSort() throws Exception{
		ArrayList<T> Data = new ArrayList<>();
		while(!List.isEmpty()) {
			Data.add(this.remove());
		}
		return Data;
	}
}
