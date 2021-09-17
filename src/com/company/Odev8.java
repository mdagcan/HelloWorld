package com.company;

public class Odev8 {
    public static void main(String[] args) throws InterruptedException {
        int toplam = 0;
        for (int i = 0 ; i <= 100 ; i++) {
            toplam = toplam + i;
            System.out.println(toplam + " + " + i + " = " + (toplam + i));
            Thread.sleep(100);
        }
        System.out.println("1 den 100'e kadar olan sayıların toplamı : " + toplam);

    }
}
