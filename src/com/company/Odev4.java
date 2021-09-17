package com.company;

import java.util.Scanner;

public class Odev4 {
    public static void main(String[] args) throws InterruptedException {

        Scanner tara = new Scanner(System.in);
        System.out.print("Kilonuzu girin : ");
        double kullaniciKilo = tara.nextDouble();
        System.out.print("Boyunuzu cm olarak girin : ");
        double kullaniciBoyu = tara.nextDouble();
        System.out.println("Kilonuz : " + kullaniciKilo + " KG. Boyunuz : " + kullaniciBoyu + " cm.");
        System.out.println("Hesaplama Yapılıyor ....");

        Thread.sleep(1000);

        double vucutKitleEndeksi = (kullaniciKilo / Math.pow(( kullaniciBoyu / 100 ) , 2));

        System.out.println("SONUÇ :");
        if (vucutKitleEndeksi < 15) {
            System.out.println("Çok ciddi derecede düşük kilolu");
        } else if (vucutKitleEndeksi >= 15 && vucutKitleEndeksi < 16) {
            System.out.println("Ciddi derecede düşük kilolu");
        } else if (vucutKitleEndeksi >= 16 && vucutKitleEndeksi < 18.5) {
            System.out.println("Düşük kilolu");
        } else if (vucutKitleEndeksi >= 18.5 && vucutKitleEndeksi < 25) {
            System.out.println("Normal (sağlıklı) kilolu");
        } else if (vucutKitleEndeksi >= 25 && vucutKitleEndeksi < 30) {
            System.out.println("Fazla kilolu");
        } else if (vucutKitleEndeksi >= 30 && vucutKitleEndeksi < 35) {
            System.out.println("1. dereceden (hafif) obez");
        } else if (vucutKitleEndeksi >= 35 && vucutKitleEndeksi < 40) {
            System.out.println("2. dereceden (ciddi) obez");
        } else if (vucutKitleEndeksi >= 40) {
            System.out.println("3. dereceden (çok ciddi) obez");
        }






    }
}
