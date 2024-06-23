package loopingstm;

public class dowhile {
	public static void main(String[] args) {
		int balance =300;
		int enter = 600;
		do {
			System.out.println("enter the value is = "+enter);
		} while (enter<=balance);
		if(enter <= balance) {
			System.out.println("take amount");
		}
		else {
			System.out.println("insufficent balace");
		}
	}

}
