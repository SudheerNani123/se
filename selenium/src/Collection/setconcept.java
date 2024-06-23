package Collection;

import java.util.HashSet;


public class setconcept {
	public static void main(String[] args) {
		 HashSet<String> set = new HashSet<String>();
		 
		 set.add("sudheer");
		 set.add("nani");
		 set.add("testing");
		 set.add("sudheer");
		 set.add("sudhir");
		 set.add("sudheer");
		 set.add("abc");
		 set.add("123");
		 
		 System.out.println("the count of set ="+set.size());
		 System.err.println("-------------------------------------");
		 
		 for (String n: set) {
			 System.out.println(n);
		 }
		 System.out.println("-----------------------------------------");
		 
		 System.out.println("the list of set is = "+set);
	}

}
