package DSA_PROBLEMS;
import java.util.*;


public class CheckPalindrome {
	public Boolean checkPlain(String Str) {
		/*int i = 0;
		int j = Str.length() - 1;
		while(i<=j) {
			if(Str.charAt(i) != Str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
		StringBuilder Strs = new StringBuilder(Str);
		String reversed = Strs.reverse().toString();
		if(Strs.equals(reversed)) {
			return true;
		}
		else {
			return false;
		}*/
		
		String reversed = new StringBuilder(Str).reverse().toString();
		return Str.equals(reversed);
	}
}
