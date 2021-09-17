package com.company;

public class Odev2 {
    public static void main(String[] args) {

        // sayi++ önce sayıyı işleme dahil eder sonra sayı değerini 1 artırır
        // ++sayi önce sayıyı 1 artırır sonra işleme dahil eder

        int sayi1 = 10;
        int sayi2 = ++sayi1;
        int sayi3 = sayi1--;

        System.out.println("sayi1 : " + sayi1);
        System.out.println("sayi2 : " + sayi2);
        System.out.println("sayi3 : " + sayi3);

        System.out.println("sonuc : " + ((sayi1) + (--sayi2) + (sayi3++)));


        System.out.println("------------------------");

        double ondalikliSayi = 6.50;
        double sonuc = 0;

        sonuc++;
        ondalikliSayi *= sonuc;
        System.out.println("Sonuç : " + ondalikliSayi);




    }
}
