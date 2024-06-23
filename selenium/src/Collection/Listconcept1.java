package Collection;

import java.util.ArrayList;
import java.util.List;

public class Listconcept1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		 List<String> list = new ArrayList<String>();
		
		 // for adding a data
		
		 list.add("sudheer");
		 list.add("nani");
		 list.add("hi");
		 list.add("hello");
		 list.add("neogen");
		 list.add("softtec");
		 System.out.println(list);
		 System.out.println("----------");
		
		 System.out.println(list.get(2));
		 System.out.println("----------");
		
		 System.out.println(list.size());
		 System.out.println("----------");
		
		 list.add("abc");
		 list.add("xyz");
		
		 System.out.println(list.size());
		 System.out.println("----------");
		
		 System.out.println(list.indexOf("neogen"));
		 System.out.println("----------");
		
		 list.add(4,"automation");
		 System.out.println(list.get(4));
		 System.out.println("----------");
		
		 // to get total data
		 for (int i=0;i<list.size();i++) {
			 System.out.println(list.get(i));
		 }
		 System.out.println("---------");
		
		 // using for each loop
		 for(String n: list) {
			 System.out.println(n);
		 }
		 System.out.println("----------");
		
		 // to know the data is available or not
		 Boolean cont = list.contains("sudheer");
		 System.out.println(cont);
		 System.out.println("----------");
		
		 list.remove(2);
		 System.out.println(list);
		 System.out.println("----------");
		
		 System.out.println(list.contains("sudheer"));
		 System.out.println("@@@@@@@@@");
		
		 // is string is empty or not
		 System.out.println(list.isEmpty());
		 System.out.println("!!!!!!!!!!!");
		
		 list.clear();
		 System.out.println(list);
		 System.out.println(list.isEmpty());
	}
 

}
