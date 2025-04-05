package DSA_PROBLEMS;


//{"Flowers","flow","flight"}

public class StringBerry {
	public void checkString(String[] Arr) {
		String s1 = Arr[0];
		String s2 = Arr[1];
		String s3 = Arr[2];
		String result = "";
		int length = Math.min(s1.length(), s2.length());
		int overallLength  = Math.min(s3.length(), length);
		
		for(int i=0;i<overallLength;i++) {
			if(s1.charAt(i) == s2.charAt(i) && s2.charAt(i) == s3.charAt(i)) {
				result += s1.charAt(i);
			}
		}
		
		System.out.println(result);
	}
}
