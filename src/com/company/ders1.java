package com.company;


public class ders1 {

    public static void main(String[] args) {
        System.out.println("deneme");

        System.out.println("Byte değeri min : " + Byte.MIN_VALUE + " Byte değeri max : " + Byte.MAX_VALUE + " Byte uzunluğu : " + Byte.SIZE);
        System.out.println("Int değeri min : " + Integer.MIN_VALUE + " Int değeri max : " + Integer.MAX_VALUE + " Int uzunluğu : " + Integer.SIZE);
        System.out.println("Double değeri min : " + Double.MIN_VALUE + " Double değeri max : " + Double.MAX_VALUE + " Double uzunluğu : " + Double.SIZE);
        System.out.println("Float değeri min : " + Float.MIN_VALUE + " Float değeri max : " + Float.MAX_VALUE + " Float uzunluğu : " + Float.SIZE);

        char choosenOne = 'R';
        System.out.println("seçtiğin karakter : " + choosenOne );
        int integerDeger = 'A';
        System.out.println("A nın unicode integer değeri : " + integerDeger);

        double sayiD = 29.56;
        int sayiI = 10;

        sayiI = (int) sayiD;

        System.out.println(sayiI);
    }
}
