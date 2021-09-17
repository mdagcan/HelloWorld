package com.company;

import java.util.Scanner;

public class BolumSonuOdevleri {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        //  1
/*
        System.out.println("ORTALAMA ALAN PROGRAM");
        System.out.print("Lütfen ilk sayıyı girin :");
        int sayi1 = tara.nextInt();
        System.out.print("Lütfen ikinci sayıyı girin :");
        int sayi2 = tara.nextInt();
        System.out.print("Lütfen son sayıyı girin :");
        int sayi3 = tara.nextInt();

        double ortalama = (sayi1 + sayi2 + sayi3) / 3;
        System.out.println("girilen sayıların ortalaması : " + ortalama);
*/
        String deneme = "ne haber";

        if (deneme.equalsIgnoreCase("NE HABER")) {
            System.out.println("oldu galiba");
        }else {
            System.out.println("olmamış...");
        }


        long baslangic =  System.nanoTime();

        long toplam = 0;
        for (int sayi = 0; sayi < 100000; sayi++) {
            for (int sayi2 = 0; sayi2 < 10000; sayi2++){
                for (int sayi3 = 0; sayi3 < 10000; sayi3++) {
                    toplam += sayi;
                }
            }

        }

        long sonlanma = System.nanoTime();
        long gecenZaman = (sonlanma - baslangic) / 1000000000;
        System.out.println(gecenZaman);


    }
}
