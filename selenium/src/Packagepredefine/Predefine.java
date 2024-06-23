package Packagepredefine;

import java.util.Scanner;

public class Predefine {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("The old salary is =");
		int old = scan.nextInt();
		
		System.out.println("The hike is =");
		int hike = scan.nextInt();
		
		int present = old+hike;
		System.out.println("The total salary ="+present);
	}

}
