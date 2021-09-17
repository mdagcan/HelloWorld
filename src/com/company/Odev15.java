// EKSİK 12 nolu soru
package com.company;

import java.util.Scanner;

public class Odev15 {
    public static void main(String[] args) {
        System.out.println("'0' a basana kadar girip enter a basılan sayıları tutan '0' a basınca bunları çarpan program");

        Scanner tara = new Scanner(System.in);

        int kullaniciSayisi = 0;
        int sayac = 1;
        while ( kullaniciSayisi == 0) {
            System.out.print("bir sayı girin :");
            kullaniciSayisi = tara.nextInt();
            sayac = sayac * kullaniciSayisi;

        }
        System.out.println(sayac);

    }
}
