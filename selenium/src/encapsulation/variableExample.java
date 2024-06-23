package encapsulation;

public class variableExample {
	double commanfee = 500;
	
	public void first() {
		
		double fee = 1500;
		double totalfee = commanfee+fee;
		
		System.out.println("the first year commanfee ="+commanfee);
		System.out.println("the first year fee ="+fee);
		System.out.println("the first year total ="+totalfee);
		variable a = new variable();

		
		
	}
	public void second() {
		
		double fee = 2000;
		double partical = 200;
		double totalfee = commanfee+fee+partical;
		System.out.println("the second year commanfee ="+commanfee);
		System.out.println("the second year fee ="+fee);
		System.out.println("the second year partical ="+partical);
		System.out.println("the second year total ="+totalfee);
	}

}
