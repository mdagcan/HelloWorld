package com.company;

import java.util.Scanner;

public class Odev10 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.print("Lütfen Faktöriyel hesabı yapılacak sayıyı girin : ");
        int fakSayi = tara.nextInt();
        double sonuc = 1;
        for (int i = 1 ; i < (fakSayi + 1) ; i++) {
            sonuc = sonuc * i;
        }
        System.out.println(fakSayi + "'nın faktöriyeli : " + sonuc);
    }
}
