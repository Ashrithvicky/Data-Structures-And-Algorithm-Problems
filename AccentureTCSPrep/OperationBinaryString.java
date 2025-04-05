package AccentureTCSPrep;
import java.util.*;

public class OperationBinaryString {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine(); // 1C0C1C1A0B1
		int Sum = 0;
		int Value = OperationBinary(S, Sum);
		System.out.println(Value);
	}
	
	public static int OperationBinary(String Str, int Sum) {
		Sum = Integer.parseInt(Str.substring(0,1));
		for(int i=0;i<Str.length()-1;i++) {
			if(Str.charAt(i) == 'A') {
				Sum = Sum & Integer.parseInt(Str.substring(i+1,i+2)); 
			}
			else if(Str.charAt(i) == 'B') {
				Sum = Sum | Integer.parseInt(Str.substring(i+1,i+2)); 
			}
			else if(Str.charAt(i) == 'C') {
				Sum = Sum ^ Integer.parseInt(Str.substring(i+1,i+2));
			}
		}
		return Sum;
	}
}
