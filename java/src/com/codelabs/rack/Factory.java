package com.codelabs.rack;

class foodFactory extends Factory{

	public Food getFood(String string) {

		return new Food(string);
	}
    
}

class Food extends Factory{
	
	private String foodName ;

	public Food(String fordName) {
		this.foodName = fordName;
	}
	
	public String getName() {
		return this.foodName;

	}

	public void serveFood() {
		
		System.out.println("I'm serving " + this.foodName);
	}
	
}

public class Factory {
	
	public static void main(String[] args) {
		
		foodFactory myFoods = new foodFactory();
		Food food1 = myFoods.getFood("Fastfood");
		Food food2 = myFoods.getFood("Fruits");	
		System.out.println("My name is: " + food1.getName());
		System.out.println("My name is: " + food2.getName());
		System.out.println("Our superclass is: " + food1.getClass().getSimpleName());
		food1.serveFood();
		food2.serveFood();
	}

}
