package loopingstm;

public class whileloop {
	public static void main(String[] args) {
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		System.out.println("---------");
		int j=1;
		while(j<=10) {
			if(j%3==0)
				System.out.println(j);
			j++;
			
		}
	}

}
