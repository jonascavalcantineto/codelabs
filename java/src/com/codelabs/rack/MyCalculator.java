package com.codelabs.rack;

import java.util.Scanner;


public class MyCalculator {
	
	public static void main(String[] args) throws Exception {
		 int n;
		 int p;
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextInt()) {
			n = sc.nextInt();
			p = sc.nextInt();
			if (n>0 && p>0) {
				int intResult = (int) Math.pow(n, p);
				System.out.println(intResult);
			}
			else {
				//System.out.println("java.lang.Exception:");
				Exception e = new Exception("n and p should be non-negative\nn and p should be non-negative\n");
				//System.out.println(new Throwable("java.lang.Exception: n and p should be non-negative\n"));
				throw e;
			}
		}
		

	}

}
