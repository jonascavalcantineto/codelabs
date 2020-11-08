package com.codelabs.rack;

public class TenorMain extends Singer {
	public static String sing() {
		return "fa";
	}
	
	public static void main(String[] args) {
		TenorMain t = new TenorMain();
		Singer s = new Singer();
		System.out.println(t.sing()+" "+s.sing());

	}
}

class Singer {
	public static String sing() {
		return "la";
	}
}