package com.company;

public class Odev3 {
    public static void main(String[] args) {
        int sureSaniye = 18746587;
        int dakika = 0;
        int saniye = 0;
        dakika = sureSaniye / 60;
        saniye = sureSaniye % 60;
        System.out.println(sureSaniye + " kadar saniye " + dakika + " dakika ve " + saniye + " saniyeden oluşur.");

        double derece = 0 , fahren = 0;

        fahren = 100;

        derece = (fahren - 32.0) * (5.0 / 9.0);
        System.out.println(fahren + " derece fahrenheit " + derece + " derece celcius eder.");

        int yil = 2024;
        if ((yil % 400 == 0) || (yil % 4 == 0 && yil % 100 !=0)) {
            System.out.println(yil + " yılı artık yıldır.");
        }else {
            System.out.println(yil + " yılı artık yıl değildir.");
        }

    }
}
