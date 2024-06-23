package encapsulation;

public class variableTest {
	public static void main(String[] args) {
		variable v = new variable();
		
		System.out.println(v.j);
		System.out.println(v.i);
		
		System.out.println("---------------");
		
		v.al();
		System.out.println("---------------");
		
		v.a2();
		System.out.println("---------------");
		variableExample ve = new variableExample();
		
		System.out.println("the commanfee of clg =");
		System.out.println("---------------");
		ve.first();
		System.out.println("---------------");
		ve.second();
	}

}
