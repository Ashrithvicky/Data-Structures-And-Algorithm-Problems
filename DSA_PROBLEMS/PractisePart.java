package DSA_PROBLEMS;
import java.util.ArrayList;


//Heap 
public class PractisePart<T extends Comparable<T>> {
	ArrayList<T> HeapList;
	ArrayList<T> FinalList;
	
	public PractisePart() {
		HeapList = new ArrayList<>();
		FinalList = new ArrayList<>();
	}
	
	// Insert Delete Search Elements...
	
	public void InsertElement(T Value) {
		HeapList.add(Value);
		upHeap(HeapList.size() - 1);
	}
	
	public void upHeap(int Index) {
		int parent = parent(Index);
		if(Index == 0) {
			return;
		}
		if(HeapList.get(Index).compareTo(HeapList.get(parent)) > 0) {
			Swap(Index,parent);
			upHeap(parent);
		}
	}
	
	public void Swap(int Child, int Parent) {
		T Temp = HeapList.get(Child);
		HeapList.set(Child, HeapList.get(Parent)) ;
		HeapList.set(Parent, Temp);
	}
	
	private int parent(int Index) {
		return (Index-1)/2;  
	}
	
	private int left(int Index) {
		return (Index*2) + 1;
	}
	
	private int right(int Index) {
		return (Index*2) + 2;
	}
	
	public T Delete() throws Exception{
		if(HeapList.isEmpty()) {
			throw new Exception("Heap is Empty");
		}
		T First = HeapList.get(0);
		T Last = HeapList.remove(HeapList.size() - 1);
		if(!HeapList.isEmpty()) {
			HeapList.set(0, Last);
			downHeap(0);
		}
		return First;
	}
	
	public void downHeap(int Index) {
		int Max = Index;
		int left = left(Index);
		int right = right(Index);
		if(left < HeapList.size() && HeapList.get(Max).compareTo(HeapList.get(left)) < 0){
			Max = left;
		}
		if(right < HeapList.size() && HeapList.get(Max).compareTo(HeapList.get(right)) < 0){
			Max = right;
		}
		if(Max != Index) {
			Swap(Max,Index);
			downHeap(Index);
		}
	}
	
	public void Display() {
		for(T Val: FinalList) {
			System.out.println(Val);
		}
	}
	public void DisplayHeapList() {		
		while(!HeapList.isEmpty()) {
			FinalList.add(HeapList.Delete());
			System.out.println("Element:" +FinalList);
		}
	}
	
	public void DisplayElements() {
	    ArrayList<T> result = new ArrayList<>();
	    while (!HeapList.isEmpty()) {
	        try {
	            result.add(this.Delete()); // Collect the max element after each deletion
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
	    
	    // Print the result in descending order
	    for (T val : result) {
	        System.out.println(val);
	    }
	}

	
	public void DisplayMax() {
		System.out.println(HeapList.get(0));
	}	
	
	public void DisplayMaxKthElement(int Index) {
		System.out.println("Index:" + Index);
		System.out.println(FinalList.get(Index-1));
	}
}
