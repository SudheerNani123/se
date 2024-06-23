package string;

public class stringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "hello world";
		System.out.println("that s1 value is ="+s1);
		String r = "";
		
		String s2 = "SUDHEER";
		System.out.println("that s2 value is ="+s2);
		String rr = "";
		
		System.out.println(s1.charAt(4));
		
		System.out.println(s1.length());
		
		System.out.println(s1.substring(5));
		
		System.out.println(s1.substring(3,9));
		
		System.out.println(s1.contains("world"));
		
		System.out.println(s2.indexOf('r'));
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.isEmpty());
		
		System.out.println(s1.replace('h', 'd'));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
		System.out.println(s2.indexOf('e'));
		
		System.out.println(s1.toUpperCase());
		
		System.out.println(s2.toLowerCase());
		
		for(int i=s1.length()-1;i>=0;i--) {
			r=r+s1.charAt(i);
		}
		System.out.println(r);
		System.out.println("-----------");
		for(int i=s2.length()-1;i>=0;i--) {
			rr=rr+s2.charAt(i);
		}
		System.out.println(rr);
	}

}
