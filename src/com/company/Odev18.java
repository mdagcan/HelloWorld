// Soru 15 Eksik

package com.company;

import java.util.Scanner;

public class Odev18 {
    public static void main(String[] args) {
        System.out.println("YAZDIĞIN SAYIYA KADAR ASAL SAYILARI YAZAN PROGRAM");
        System.out.print("Bir sayı girin : ");
        Scanner tara = new Scanner(System.in);
        int kullaniciSayisi = tara.nextInt();

        String diziBir = " ";
        for (int i = 2 ; i <= kullaniciSayisi ; i++) {
            for (int j = 2 ; j < i ; j++) {
                if (i % j != 0) {

                }
            }
        }
    }
}
