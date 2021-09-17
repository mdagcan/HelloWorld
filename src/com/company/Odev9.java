package com.company;

public class Odev9 {
    public static void main(String[] args) {

        String dizi = " ";
        String geciciBellek = " ";
        int sayac = 1;
        for (int i = 1 ; i < 50 ; i++) {
            geciciBellek = String.valueOf(i);
            dizi = dizi + geciciBellek + ",";
            sayac++;
        }
        dizi = dizi + String.valueOf(sayac);
        System.out.println(dizi);
    }
}
