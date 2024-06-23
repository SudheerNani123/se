package Array;

public class multidimarray {
	public static void main(String[] args) {
		int a[][]= {{10,2},{20,30},{30,40}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<2;j++) {
				System.out.print("  "+a[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("vvvv assending order vvvvv");
		
		int c[]= {4,5,3,-2,1};
		for (int i=0; i<c.length; i++) {
			for(int j=i; j< c.length; j++) {
				int b;
				if(c[i]>c[j]) {
					b = c[i];
					c[i] = c[j];
					c[j] = b;
					
				}
			}
			System.out.println(c[i]);
		}
	}
}