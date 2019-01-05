package com.java24hours;

class PlanetWeight{
    public static void main(String [] args){
        System.out.print("Twoja waga na Ziemi wynosi ");
        double weight = 80;
        System.out.println(weight);
        
        System.out.print("Twoja waga na Merkurym wynosi ");
        double mercury = weight * .378;
        System.out.println(mercury);
        
        System.out.print("Twoja waga na Ksiezycu wynosi ");
        double moon = weight * .166;
        System.out.println(moon);
        
        System.out.print("Twoja waga na Jowiszu wynosi ");
        double jupiter = weight * 2.364;
        System.out.println(jupiter);
        
        System.out.print("Twoja waga na Wenus wynosi ");
        double venus = weight * .907;
        System.out.println(venus);
        
        System.out.print("Twoja waga na Uranie wynosi ");
        double uranus = weight * .889;
        System.out.println(uranus);
        
        //ze strony 80
        System.out.println();
        int x = 3;
        int y = 2;
        System.out.println("Bonus! Suma kwadratów liczb " + x + " i " + y + ", wynosi " + (x*x+y*y));
        
    }
}