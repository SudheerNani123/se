package Collection;

import java.util.ArrayList;
import java.util.List;

public class Listconcept {
	public static void main(String[] args) {
List<String>list= new ArrayList<String>();
		
		list.add("Apple");
		list.add("Banana");
		list.add("Orange");
		list.add("Mango");
		list.add("Guava");
		System.out.println(list);
		System.out.println("-------------");
		
		System.out.println(list.get(3));
		System.out.println("-----------");
		
		System.out.println(list.size());
		System.out.println("-------");
		
		
		list.add("abc");
		list.add("xyz");
//		System.out.println("---------");
		System.out.println(list.size());
		System.out.println("----------");
		System.out.println(list.indexOf("Mango"));
		System.out.println("---------");
		list.add(5, "guavagreen");
		System.out.println(list.get(4));
		System.out.println("---------");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("-----------");
		for(String n:list)
		{
			System.out.println(n);
		}
		System.out.println("#####################");

		Boolean contt = list.contains("Orange");
		System.out.println(contt);
		
		System.out.println("*******");
		System.out.println(list.contains("Orange"));
		System.out.println("*******");
		
		System.out.println(list.isEmpty());
		
		System.out.println("********");
		
		list.clear();
		
		System.out.println(list);
		System.out.println(list.isEmpty());
		
	}
}
