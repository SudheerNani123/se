package Exception;

public class trycatch {
	

	public static void main(String[] args) {
		int i=10;
		int j=0;
		try {
			int x=i/j;
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("the error is ended:");
		}
		
		System.out.println("========");
		
		int a1[] = {4,6,7,8};
		try {
			System.out.println(a1[6]);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("the error is ended:");
		}
		
		String s= "nani";
		try {
			char c = s.charAt(5);
			System.out.println(c);
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
		
	}
}