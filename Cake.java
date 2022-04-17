package com.internshala.javaapp;

public class Cake {

	 String cake1,cake2;
	 float price1,price2;
	public String getCake1(){
		return cake1;
	}
	public void setCake1(String cake1){

		this.cake1= cake1;
	}
	public String getCake2() {
		return cake2;
	}

	public void setCake2(String cake2) {
		this.cake2 = cake2;
	}

	public float getPrice1() {
		return price1;
	}

	public void setPrice1(float price1) {
		this.price1 = price1;
	}

	public float getPrice2() {
		return price2;
	}

	public void setPrice2(float price2) {
		this.price2 = price2;
	}
	public void display()
	{
		System.out.println("          Today's Special Menu ");
		System.out.println("-------------------------------------------------");
		System.out.println("Special Cakes");
		System.out.println("-------------------------------------------------");
		System.out.println(cake1+": ₹"+price1+" per pound");
		System.out.println(cake2+": ₹"+price2+" per pound");
	}

}
