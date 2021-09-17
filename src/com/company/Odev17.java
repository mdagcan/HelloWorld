package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Odev17 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);

        System.out.print("Bir kelime girin :");
        String kullaniciKelime = tara.nextLine();

        int kelimeUzunluk = kullaniciKelime.length();
        String kulKelimeKucuk = kullaniciKelime.toLowerCase(Locale.ROOT);
        int sayac = 0;

        for (int i = 0 ; i < (kelimeUzunluk -1) ; i++) {
            if (kulKelimeKucuk.charAt(i) == kulKelimeKucuk.charAt(kelimeUzunluk - (i+1))) {
                sayac++;
            }
        }
        if (sayac+1 == kelimeUzunluk) {
            System.out.println("yazdığınız kelime PALINDROME'dur");
        } else {
            System.out.println("yazdığınız palindrome değil");
        }

    }
}
