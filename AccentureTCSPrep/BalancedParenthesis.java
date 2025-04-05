package AccentureTCSPrep;

import java.util.Scanner;

public class BalancedParenthesis {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine(); //(((())()(()
		int Value = BalancedParen(S);
		System.out.println(Value);
	}
	
	public static int BalancedParen(String S) {
		int Count = 0;
		for(int i=0;i<S.length();i++) {
			if(i>0 && S.charAt(i) == ')' && S.charAt(i-1) == '(') {
				Count += 2;
			}
		}
		return Count;
	}
}
