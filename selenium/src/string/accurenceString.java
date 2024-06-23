package string;

public class accurenceString {
	public static void main(String[] args) {
		String s= "aaaaaaasssssssaaaahhhhh";
		int count=0;
		
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i)=='a') {
			count++;
		}
	}
System.out.println("The no g count is="+count);
}
}