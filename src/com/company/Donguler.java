package com.company;

public class Donguler {
    public static void main(String[] args) {

        int benimYasim = 38, onunYasi = 39;

        if (benimYasim >= onunYasi) {
            if (benimYasim == onunYasi) {
                System.out.println("Yaşlarımız eşit..");
            } else {
                System.out.println("Benim yaşım daha büyük");
            }
        } else {
            System.out.println("Onun yaşı daha büyük");
        }
        System.out.println("---------------------------------------------------------------------------------");
        // önemli

        int a = 10, b = 34, c = 0;

        if (a > b) {
            c = a - b;
        } else {
            c = a + b;
        }
        System.out.println("c nin değeri : " + c);

        c = (a > b) ? (a -b) : (a + b);
        System.out.println("c deger : " + c);

        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0 ; i < 10000 ; i++) {

            System.out.println("Mustafa Dağcan Şentürk");
            System.out.println("Java öğreniyor..");
            System.out.println(i*i);
        }

        System.out.println("--------------------------------------------------------------------------------");


        double sayi = 0;
        for (int i = 0 ; i < 10 ; i++) {
            for (int j = 0 ; j < 10 ; j++) {
                for (int k = 0 ; k < 10 ; k++) {
                    System.out.println( i * j * k );
                }
            }
        }

        System.out.println("--------------------------------------------------------------------------------");

        int sayi2 = 10;
        while (sayi2 <= 20) {
            System.out.println("merhaba sayı " + sayi2);
            sayi2++;
        }

        System.out.println("--------------------------------------------------------------------------------");

        int s1 = 0;
        do {
            System.out.println("HELLO!!!" + s1);
            s1++;
        } while (s1 < 5);

        System.out.println("--------------------------------------------------------------------------------");

        for (int i = 0 ; i <= 10 ; i++) {
            System.out.println("i değeri : " + i);
            if (i == 4) {
                System.out.println(i + " değerine geldiği için BREAK komutu ile döngüden çıktı");
                break;
            }
        }

        System.out.println("--------------------------------------------------------------------------------");

        // ETİKETLEME

        distakiFor:
        for (int aa = 0 ; aa < 10 ; aa++) {
            ictekiFor:
            for (int bb = 0 ; bb < 5 ; bb++) {
                System.out.println("aa : " + aa + "      bb : " + bb);
                if (aa == 2 && bb == 3) {
                    break distakiFor;
                }
            }
        }

        System.out.println("--------------------------------------------------------------------------------");

        for (int aa = 0 ; aa < 5 ; aa++) {
            if (aa == 2) {
                continue;
            }
            System.out.println("aa değeri : " + aa);
        }


    }
}
