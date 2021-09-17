package com.company;

import java.util.Scanner;

public class Odev5 {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);
        System.out.print("İki basamaklı bir sayı girin : ");
        int kullaniciSayisi = tara.nextInt();

        int sayi = (int) (Math.random() * 90);
        sayi = sayi + 10;

        int kullaniciSayiBirlerBasamak = kullaniciSayisi - (kullaniciSayisi / 10) * 10;
        int kullaniciSayiOnlarBasamak = (kullaniciSayisi - kullaniciSayiBirlerBasamak) / 10;
        int sayiBirlerBasamak = sayi - (sayi / 10) * 10;
        int sayiOnlarBasamak = (sayi - sayiBirlerBasamak) / 10;

        if (kullaniciSayisi == sayi) {
            System.out.println("Tebrikler 10000 TL kazandınız");
        } else if (kullaniciSayiBirlerBasamak == sayiOnlarBasamak && kullaniciSayiOnlarBasamak == sayiBirlerBasamak) {
            System.out.println("Tebrikler 5000 TL kazandınız");
        } else if (kullaniciSayiBirlerBasamak == sayiBirlerBasamak || kullaniciSayiOnlarBasamak == sayiOnlarBasamak) {
            System.out.println("Tebrikler 1000 TL kazandınız");
        } else {
            System.out.println("Maalesef para kazanamadınız. Tekrar Deneyin.");
        }

/*
        System.out.println("Kullanıcı sayısı birler basamağı :" + kullaniciSayiBirlerBasamak);
        System.out.println("Kullanıcı sayısı onlar basamağı :" + kullaniciSayiOnlarBasamak);
        System.out.println("sayı :" + sayi);
        System.out.println("birler basamağı :" + sayiBirlerBasamak);
        System.out.println("onlar basamağı :" + sayiOnlarBasamak);
*/
    }
}
