package com.company;

public class Main {
    public static void main(String[] args) {

        int [] array  = {1,2,3,4,5,6,7,8};
        for (int i = 0; i < array.length; i++) {

        }
//	   Bread bread = new Bread("болко","2022",100,"20 ",true);
//     bread.setDiscount();
//     System.out.println(bread);
//        System.out.println(" ");
        Milk milk = new Milk("айлский","2022",100);

        Milk.Tworeg.Syr  sur = new Milk.Tworeg.Syr();
        Milk.Battern battern = new Milk.Battern();
        Milk.Tworeg tworeg = new Milk.Tworeg();

        System.out.println(milk);
        System.out.println(battern.retsept());
        System.out.println(tworeg.retsept());
        System.out.println(sur.metod());

    }
}
