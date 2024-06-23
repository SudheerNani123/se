package Inheritence;

class A{ // super class or parent class
	public void a1() { 
		System.out.println("i am a1");
	}
}

class B extends A{ // subclass or child class
	public void b1() {
		System.out.println("i am b1");
	}
}
public class Singlelevelinheritence { // mainclass or super most class
	

	public static void main(String[] args) {
		A a = new A();
		a.a1();
		
		System.out.println("--------");
		B b = new B();
		b.a1();
		b.b1();
		
	}
}
