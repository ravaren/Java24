package com.java24hours;

class NewRoot{
    public static void main(String [] args){
        
        System.out.println("Pierwiastek kwadratowy z 625 wynosi " + Math.sqrt(625));
        System.out.println("Pierwiastek kwadratowy z argumentu: " + Math.sqrt( Integer.parseInt(args[0]) ) );
    }
}