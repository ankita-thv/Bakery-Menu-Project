package com.internshala.javaapp;

public class Pastry extends Cake{
	 String pastry1,pastry2;

	@Override
	public void display(){
		System.out.println("\nSpecial Pastries");
		System.out.println("-------------------------------------------------");
		System.out.println(cake1 + ": ₹"+ price1 + " per piece");
		System.out.println(cake2 + ": ₹"+ price2 + " per piece");

	}

}
