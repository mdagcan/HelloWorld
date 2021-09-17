package com.company;

public class Odev1 {
    public static void main(String[] args) {

        String stringSayi = "150";
        String stringSayi22 ;

        int intSayi1 = Integer.parseInt(stringSayi);
        //int intSayi2 = Integer.getInteger(stringSayi);
        int intSayi3 = Integer.parseUnsignedInt(stringSayi);
        int intSayi4 = Integer.valueOf(stringSayi);

        System.out.println("Integer.parseInt : " + intSayi1);
        //System.out.println("Integer.getInteger : " + intSayi2);
        System.out.println("Integer.parseUnsignedInt : " + intSayi3);
        System.out.println("Integer.valueOf : " + intSayi4);

        stringSayi22 = String.valueOf(intSayi1);
        System.out.println("int2string sonucu : " + stringSayi22);

        int sayi1 = 5 / 3 ;
        float sayi2 = 5f / 3f ;
        double sayi3 = 5d / 3d ;

        System.out.println("int olursa : " + sayi1);
        System.out.println("float olursa : " + sayi2);
        System.out.println("double olursa : " + sayi3);

        System.out.println("-----------------------------------------------");

        System.out.println(1 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
        System.out.println(1 - 0.9);

        System.out.println("-------------------------------------------------");

        int number1 = 1;
        int number2 = 2;
        double avarage = (number1 + number2) / 2 ;
        System.out.println(avarage);
        double avarage2 = (number1 + number2) / 2.0 ;
        System.out.println(avarage2);

        System.out.println("--------------------------------------------------");

        int sayiA1 = 215; int sayiA2 = 40;

        System.out.println("toplam : " + (sayiA1 + sayiA2) + " çıkarma : "
                + (sayiA1 - sayiA2) + " bölme : " + (sayiA1 / sayiA2)
                + " çarpma : " + (sayiA1 * sayiA2) + " mod : " + (sayiA1 % sayiA2));

        System.out.println(sayiA1 + " + " + sayiA2 + " = " + (sayiA1 + sayiA2));
        System.out.println(sayiA1 + " - " + sayiA2 + " = " + (sayiA1 - sayiA2));
        System.out.println(sayiA1 + " * " + sayiA2 + " = " + (sayiA1 * sayiA2));
        System.out.println(sayiA1 + " / " + sayiA2 + " = " + ((double)sayiA1 / (double) sayiA2));
        System.out.println(sayiA1 + " % " + sayiA2 + " = " + (sayiA1 % sayiA2));



    }



}
