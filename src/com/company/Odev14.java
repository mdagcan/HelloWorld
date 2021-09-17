package com.company;

import java.util.Scanner;

public class Odev14 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("***SAYI TAHMİN OYUNU***");
        System.out.println("***1-100 Arasında Rakamlar Girerek Oyun Oynanaır.***");
        System.out.println("Not: Çıkış yapmak için Q ya basın.");

        int sayiTut = (int) (Math.random()*100) + 1;
        int denemeSayisi = 1;
        while (1 < 2) {
            System.out.print("Lütfen sayı tahmininizi girin : ");
            int tahminSayi = tara.nextInt();
            if (tahminSayi == sayiTut) {
                System.out.println("Tebrikler " + denemeSayisi + " seferde sayıyı tahmin ettiniz.");
                break;
            } else if (tahminSayi < sayiTut) {
                System.out.println("Arttır..");
            } else if (tahminSayi > sayiTut) {
                System.out.println("Azalt..");
            } else if (tahminSayi > 100 || tahminSayi < 1) {
                System.out.println("Lütfen istenen aralıkta sayı giriniz.");
            } else {
                System.out.println("Geçerli bir sayı giriniz");
            }
            denemeSayisi++;
            if (String.valueOf(denemeSayisi) == "Q") {
                break;
            }
        }

    }
}
