package DSA_PROBLEMS;

public class StringReversal {
	public static void StrReverse(String S) {
		String[] Arr = S.split("\\s+");
		System.out.println(Arr[0]);
		String[] Final = new String[Arr.length];
		int j = 0;
		for(int i=Arr.length-1;i>=0;i--) {
			Final[j] = Arr[i];
			j = j+1;
		}
		String s = String.join(" ", Final);
		System.out.println(s.strip());
	}
	public static void main(String[] args) {
		String S = "Vig asdkfhjds sdfkljda adfdsa";
		StrReverse(S);
	}
}
