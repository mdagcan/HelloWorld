package com.company;

import java.util.Scanner;

public class Odev16 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("İki tane sayı girin;");
        System.out.print("Sayı 1 = ");
        int sayi1 = tara.nextInt();
        System.out.print("Sayı 2 = ");
        int sayi2 = tara.nextInt();
        int ebobSayisi = 0;
        int kucukSayi = Math.min(sayi1, sayi2);
        int buyukSayi = Math.max(sayi1, sayi2);

        for (int i = 1 ; i < kucukSayi + 1 ; i++ ) {
            if (buyukSayi % i == 0 && kucukSayi % i == 0) {
                ebobSayisi = i;
            }
        }
        System.out.println(sayi1 + " ve " + sayi2 + " sayısının EBOB'u : " + ebobSayisi);



    }
}
