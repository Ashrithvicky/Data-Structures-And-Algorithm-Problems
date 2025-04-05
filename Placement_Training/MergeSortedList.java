package Placement_Training;



LinkedList LL = new LinkedList();

public class MergeSortedList {
	public void MergeList(Node N1,Node N2) {
		if(N1.Data<N2.Data) {
			N2.Next = N1;
			N1 = N1.Next;
		}
		else if(N2.Data<N1.Data) {
			N1.Next = N2;
			N2 = N2.Next;
		}
		
	}
	
}
