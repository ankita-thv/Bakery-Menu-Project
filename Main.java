package com.internshala.javaapp;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {

        List<Cake> cakeList = new ArrayList();
        List<Pastry> pastryList = new ArrayList();

        Cake c1= new Cake();
        c1.setCake1("Chocolate Brownie");
        c1.setPrice1(250.0f);
        c1.setCake2("Chocolate Maple");
        c1.setPrice2(300.0f);

        Pastry p1 = new Pastry();
        p1.setCake1("Black Forest");
        p1.setPrice1(35.0f);
        p1.setCake2("Choco Truffle");
        p1.setPrice2(40.0f);

        cakeList.add(c1);
        pastryList.add(p1);
        c1.display();
        p1.display();


    }
}