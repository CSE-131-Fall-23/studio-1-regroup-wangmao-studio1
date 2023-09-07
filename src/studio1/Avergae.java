package studio1;

import java.util.Scanner;

public class Avergae {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first of two integers to be averaged?");
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		double isAveraged= (n1+n2)/2;
		System.out.println(isAveraged=((n1+n2)/2));
	}

}
