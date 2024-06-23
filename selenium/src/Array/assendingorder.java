package Array;

public class assendingorder {
	
public static void main(String[] args) {
	

	int a[] = {4,3,2,1};
	for(int i=0;i<a.length;i++) {
		for(int j=i;j<a.length;j++) {
			int b;
			if(a[i]>a[j])
			{
				b=a[i];
				a[i]=a[j];
				a[j]=b;
			}
	}
	System.out.println(a[i]);
	

}
	}
	}
