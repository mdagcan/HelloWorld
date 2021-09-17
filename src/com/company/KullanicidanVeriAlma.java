package com.company;

import java.util.Scanner;

public class KullanicidanVeriAlma {
    public static void main(String[] args) {

        Scanner tara = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz : ");
        int kullanicininGirdigiSayi = tara.nextInt();
        System.out.println("Girdiğiniz sayı : " + kullanicininGirdigiSayi);

        System.out.print("Lütfen ondalıklı sayı giriniz : ");
        double kullanicininGirdigiDoubleSayi = tara.nextDouble();
        System.out.println("Girdiğiniz sayı : " + kullanicininGirdigiDoubleSayi);

        System.out.print("Lütfen bir isim giriniz :");
        String kullanicininGirdigiKarakter = tara.next();
        System.out.println("Girilen karakter : " + kullanicininGirdigiKarakter);

        tara.nextLine(); // tara.next sonrası tara.nextLine kullanırsan hata veriyor bunun için bu hata giderme operatörü

        System.out.print("Lütfen bir isim giriniz :");
        String kullanicininGirdigiKarakter2 = tara.nextLine();
        System.out.println("Girilen karakter : " + kullanicininGirdigiKarakter2);

        System.out.print("Lütfen bir isim giriniz :");
        char kullanicininGirdigiKarakter3 = tara.next().charAt(0);
        System.out.println("Girilen karakter : " + kullanicininGirdigiKarakter3);



    }
}
