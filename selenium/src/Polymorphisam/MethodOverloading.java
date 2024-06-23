package Polymorphisam;

class additional {
	
	
	
	
	public void add() {
		System.out.println("no value");
	}
	
	
	
	public void add(int l,int k,int m) {
		System.out.println("the additional value="+(l+k+m));
		
}
	
	public void add(int i,int j) {
		System.out.println("the additional value="+(i+j));
		
	}
}


public class MethodOverloading {

public static void main(String[] args) {
	additional ad = new additional();
	ad.add();
	ad.add(20, 200, 10);
	ad.add(25, 30);
	
}

}
