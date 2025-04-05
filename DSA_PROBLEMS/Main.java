package DSA_PROBLEMS;
import java.util.*;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) throws Exception{
		/*LinkedList L = new LinkedList();
		L.InsertBeginning(45);
		L.InsertAtPosition(23,1);
		L.Display();*/
		
		/*Heap<Integer> heap = new Heap<>();
		heap.InsertElement(3);
		heap.InsertElement(2);
		heap.InsertElement(3);
		heap.InsertElement(1);
		heap.InsertElement(2);
		heap.InsertElement(4);
		heap.InsertElement(5);
		heap.InsertElement(5);
		heap.InsertElement(6);
		//heap.DisplayElements();
		//System.out.println("K: ");
		//heap.HeapElement(4);
		ArrayList<Integer> List = heap.heapSort();
		System.out.println(List);
		//heap.Display();*/
		
		//int Arr[] = {12,23,80,44,110,250};
		//int Arr[] = {20,31,45,11,78,99};
		//int Arr[] = {100,54,170,29,65,18,23,43,55,76};  8 iterations 7 iterations(k=4)
		/*int Arr[] = {10,4,5,90,120,80};  /* 6 elements na 4 iterations
		int Final_Arr[] = new int[6];
		StockSpan S = new StockSpan();
		S.Stokspan(Arr, Final_Arr);
		//S.Display(Final_Arr);*/
		
		
		/*Scanner sc = new Scanner(System.in);
		Tree T = new Tree();
		T.insertNode(sc);
		T.Display();*/
		
		//Scanner sc = new Scanner(System.in);
		/*BinaryTree BT = new BinaryTree();
		BT.insertNode(sc);
		BT.Display();*/
		
		/*DoublyLinkedList<Integer> DLL = new DoublyLinkedList<>();
		DLL.InsertNodeAtBeginning(10);
		DLL.InsertNodeAtBeginning(20);
		DLL.InsertNodeAtPosition(12, 2);
		DLL.Display();
		*/
		
		/*int matrix[][]=new int[4][4];
		System.out.println("Enter Elements of Matrix:");
		for(int i=0;i<4;i++)
			for(int j=0;j<4;j++)
				matrix[i][j]=sc.nextInt();
		CelebrityProblem CP = new CelebrityProblem();
		CP.CelebrityCheck(matrix);*/
		/*LinkedListSort LLS = new LinkedListSort();
		System.out.println("Enter Elements count:");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			System.out.println("Enter Elements:");
			int Data = sc.nextInt();
			LLS.AddData(Data);
		}
		LLS.SortingBubble();
		LLS.Display();*/
		/*int Arr[] = {1,1,1,2,2,3};
		System.out.println(Arr.length);
		RemoveDuplicates RM = new RemoveDuplicates();
		RM.removeDuplicates(Arr);
*/
		/*RemoveDuplicates rd = new RemoveDuplicates();
		int[] nums = {1, 1, 1, 2, 2, 3};
		rd.removeDuplicates(nums);*/
		
		/*MinimumStack MS = new MinimumStack();
		MS.Push(-2);
		MS.Push(0);
		MS.Push(-3);
		MS.GetMin();
		MS.Pop();
		MS.GetMin();
		MS.Display();*/
		
		/*RandomisedSet RS = new RandomisedSet();
		RS.Insert(1);
		RS.Remove(2);
		RS.Insert(2);
		RS.getRandom();
		RS.Remove(1);
		RS.Insert(2);
		RS.getRandom()*/
		
		/*CandyArray2 CA = new CandyArray2();
		int[] Arr = {1,2,2};
		CA.CandyArrayCal(Arr);*/
		
		/*StringReversal SR = new StringReversal();
		//String S = "the sky is blue";
		String s = "a good   example";
		//String s = "  hello world  ";
		SR.StrReverse(s);*/
		
		
		/*IPOExample IPO = new IPOExample();
		int k=3;
		int w=0;
		int[] profits = {1,2,3};
		int[] capital = {0,1,2};
		int value = IPO.findMaximisedCapital(k, w, profits, capital);
		System.out.println(value);*/
		
		
		/*String[] Arr = {"flowers","flow","flight"};
		StringBerry SB = new StringBerry();
		SB.checkString(Arr);*/
		
		/*BoundryTraversal BT = new BoundryTraversal();
		String[] Arr = {"1","2","7","3","null","4","N","7","null","8","9","null"};
		BT.convertTree(Arr);*/
		
		/*PrimeNimber PN = new PrimeNimber();
		PN.IsPrime(17);
		Boolean value = PN.IsPrime(17);
		System.out.println(value);*/
		
		/*CheckPalindrome CP = new CheckPalindrome();
		Boolean value = CP.checkPlain("bacab");
		System.out.println(value);*/
		
		ChemicalProb1 CP = new ChemicalProb1();
		int[] Arr = {5,3,7,2,4,9,1};
		int value = CP.findPair(Arr, 5);
		System.out.println(value);
		
	}
}
