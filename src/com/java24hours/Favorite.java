package com.java24hours;

class Favorite{
    public static void main(String[] args){
        String favorite = "piła łańcuchowa";
        String guess = "kij bilardowy";
        System.out.println("Czy ulubioną bronią Fina jest " + guess + "?");
        System.out.println("Odpowiedź: " + favorite.equals(guess));
    }
}