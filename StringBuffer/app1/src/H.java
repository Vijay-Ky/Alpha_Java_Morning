public class H {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("test");
		System.out.println(sb);
		StringBuffer s1 = sb.deleteCharAt(1);
		System.out.println(s1);
		char c1 = sb.charAt(2);
		System.out.println(c1);
		System.out.println(sb);
	}
}
