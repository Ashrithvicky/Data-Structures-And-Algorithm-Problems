package AccentureTCSPrep;

import java.util.Scanner;

public class PalindromeConversion {
	public static String PalinCon(String S) {
		int Count = 0;
		int j = S.length()-1;
		for(int i=0;i<S.length();i++) {
			while(S.charAt(i) != S.charAt(j)) {
				i++;
				Count++;
			}
			j--;
		}
		String N = S.substring(0,Count);
		String X ="";
		for(int y = N.length()-1;y>=0;y--) {
			X += N.charAt(y);
		}
		return X;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine(); //abcdc
		String Str = PalinCon(S);
		System.out.println(Str);
	}
}
