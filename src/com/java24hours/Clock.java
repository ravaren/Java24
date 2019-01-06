package com.java24hours;

import java.time.*;
import java.time.temporal.*;

class Clock {
    public static void main(String [] args){
        //Pobierz aktualną datę i godzinę
        LocalDateTime now = LocalDateTime.now();
        int hour = now.get(ChronoField.HOUR_OF_DAY);
        int minute = now.get(ChronoField.MINUTE_OF_HOUR);
        int month = now.get(ChronoField.MONTH_OF_YEAR);
        int day = now.get(ChronoField.DAY_OF_MONTH);
        int year = now.get(ChronoField.YEAR);
        
        //Wyswietl pozdrowienie
        System.out.println( (hour<18) ? "Dzień dobry. \n" : "Dobry wieczór. \n");
        
        //Rozpocznij komunikat czasowy przez wyświetlanie minut
        if (minute != 0) {
            if (minute==1){
                System.out.print("Jest " + minute + " minuta");
            } else if (minute > 10 && minute <20){
                System.out.print("Jest " + minute + " minut");          
            } else if (minute % 10 < 2) {
                System.out.print("Jest " + minute + " minut");
            } else if (minute % 10 < 5) {
                System.out.print("Są " + minute + " minuty");
            }else {
                System.out.print("Jest " + minute + " minut");
            }
                System.out.print(" po godzinie");
        } else{
            System.out.print("Jest godzina");
        }
        
        //Wyświetl godzinę
        System.out.print(" " + hour + ", ");
        
        //wyświetl dzień miesiąca
        System.out.print("dnia " + day + " ");
        
        switch (month) {
            case 1:
                System.out.print("stycznia");
                break;
            case 2:
                System.out.print("lutego");
                break;
            case 3:
                System.out.print("marca");
                break;
            case 4:
                System.out.print("kwietnia");
                break;    
            case 5:
                System.out.print("maja");
                break;
            case 6:
                System.out.print("czerwca");
                break;
            case 7:
                System.out.print("lipca");
                break;
            case 8:
                System.out.print("sierpnia");
                break;
            case 9:
                System.out.print("września");
                break;
            case 10:
                System.out.print("października");
                break;
            case 11:
                System.out.print("listopada");
                break;
            case 12:
                System.out.print("grudnia");
        }
        
        //Wyświetl rok
        System.out.println(" " + year + " roku.");
    }
}