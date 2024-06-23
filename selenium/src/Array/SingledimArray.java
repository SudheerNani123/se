package Array;

public class SingledimArray {
	public static void main(String[] args) {
int a[] = new int[5];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		
		System.out.println(a[3]);
		
		System.out.println("---------");
		
		for(int i=1; i<a.length-1; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("---------");
		
		int b[] = {10,20,30,40,50};
		
		System.out.println("The total length of the array = "+b.length);
		
	}
}

