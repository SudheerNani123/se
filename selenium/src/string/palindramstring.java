package string;

public class palindramstring {
	public static void main(String[] args) {
		String s = "madam";
		String p ="";
		for (int i = s.length()-1;i>=0;i--) {
			p=p+s.charAt(i);
		}
		if(s.equals(p)) {
			System.out.println("string is palindram");
			
		}
		else {
			System.out.println("not a palindram");
		}
	}

}
