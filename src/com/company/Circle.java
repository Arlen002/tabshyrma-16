package com.company;

import java.util.Scanner;

public class Circle {
    private static final double PI = 3.14;

    static void area( ){
        Scanner sc = new Scanner(System.in);
        System.out.println("Сан жазыныз: ");
        double radius = sc.nextInt();
        double aynt = PI * (radius * radius);
        System.out.println("Айлананын аянты: "+aynt);
    }
    static void circumference(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Сан жазыныз: ");
        double radius = sc.nextInt();
        double around = PI * 2 * radius;
        System.out.println("Айлананын узундугу: "+around);

    }
}
