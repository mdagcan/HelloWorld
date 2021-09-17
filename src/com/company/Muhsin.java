package com.company;

import java.util.Objects;
import java.util.Scanner;

public class Muhsin {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.print("OYUNCU 1 klavyeden 1 ile 250 arasında sayı girin :");
        int oyuncuBirSayisi = tara.nextInt();
        for (int i = 0 ; i < 100 ; i++) {
            System.out.println("OYUN BAŞLADI...");
        }

        System.out.println("OYUNCU 1 sayısını yazdı, sıra sende OYUNCU 2");
        System.out.print("Şimdi tahminini yaz ve Enter'a bas : ");

        int sayac = 1;

        while (1 < 2) {
            int oyuncuIkiSayisi = tara.nextInt();

            if (oyuncuBirSayisi == oyuncuIkiSayisi) {
                System.out.println("Tebrikler OYUNCU 2 oyunu " + sayac + " hamlede buldun.");
                System.out.println("Şimdi sıra diğer oyuncuda..");
                break;
            } else if (oyuncuBirSayisi != oyuncuIkiSayisi) {
                System.out.println("Tahminin yanlış. OYUNCU 1 eğer senin tuttuğun sayıdan küçük ise '1' e, büyük ise '2' ye bas");
                int cevap = tara.nextInt();

                if (cevap == 1) {
                    System.out.println("Yazdığın sayı küçük arttırman lazım");
                } else if (cevap == 2) {
                    System.out.println("Yazdığın sayı büyük azaltman lazım");
                } else {
                    System.out.println("Yanlış değer girdin tekrar dene");
                }

            }
        }
    }
}
