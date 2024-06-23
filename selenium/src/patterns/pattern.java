package patterns;

public class pattern {
	public static void main(String[] args) {
		
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=5;b++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=a;b++) {
				System.out.print("$ ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=5;b++) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		for(int a=1;a<=5;a++) {
			for(int b=1;b<=5;b++) {
				System.out.print(a+" ");
			}
			System.out.println();
		}
		System.out.println("----------------");
		for(int a=1;a<=5;a++) 
		{
			for(int b=1;b<=5;b++)
			{
				if (a==1||a==5||b==1||b==5) {
				System.out.print("# ");
			}
				else {
			System.out.print("  ");
		}
			}
			System.out.println();
	}
		System.out.println("----------------");
		for(int a=1;a<=5;a++) 
		{
			for(int b=1;b<=5;b++)
			{
				if (a==1||a==5||b==1||b==5) {
				System.out.print("* ");
			}
				else {
			System.out.print("  ");
		}
			}
			System.out.println();
	}
		System.out.println("----------------");
}
}