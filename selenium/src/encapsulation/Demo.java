package encapsulation;

public class Demo {
	
	public void show() {
		System.out.println("i am the show method");
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println("the show value is:"+c);
	}
	public void display() {
		System.out.println("i am the display method");
	}
	public int id() {
		int i=8;
		return i;
		}
	public int examfee() {
		return 100;
	}
	public void callvalue(int i) {
		System.out.println("the call value is ="+i);
	}
}
