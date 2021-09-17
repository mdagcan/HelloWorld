package com.company;

public class MathSinifKullanimi {
    public static void main(String[] args) {
        System.out.println("pi sayısı : " + Math.PI);
        System.out.println("euler sayısı : " + Math.E);

        System.out.println("-5 in mutlak değeri : " + Math.abs(-5));
        System.out.println("4.3 nın yukarı yuvarlanmış hali : " + Math.ceil(4.3));
        System.out.println("4.3 nın yuvarlanmış hali : " + Math.round(4.3));
        System.out.println("4.6 nın aşağı yuvarlanmış hali : " + Math.floor(4.6));
        System.out.println("2 üzeri 3 : " + Math.pow(2 , 3));
        int son = 1;
        for (int i = 1; i<11 ; i++) {
            son=son*i;
            if (i == 10) {
                System.out.println("10 faktöriyel = " + son);
            }
        }
        System.out.println("10 faktöriyel dışar : " + son );
        System.out.println("10 un karekökü : " + Math.sqrt(10));
        System.out.println("pi nin 20. üssü : " + Math.pow(Math.PI, 20));
        System.out.println("büyük olan : " + Math.max(3,7));
        System.out.println("küçük olan : " + Math.min(9,6));

        // Math.random()  0.0 ile 0.9999999999 arası rasgele sayı üretir;

        System.out.println("Rasgele sayı 1 : " + Math.round(100 * Math.random()));
        System.out.println("Rasgele sayı 2 : " + Math.round(100 * Math.random()));
        System.out.println("Rasgele sayı 3 : " + Math.round(100 * Math.random()));
        System.out.println("Rasgele sayı 4 : " + Math.round(100 * Math.random()));
        System.out.println("Rasgele sayı 5 : " + Math.round(100 * Math.random()));
        System.out.println("Rasgele sayı 6 : " + Math.round(100 * Math.random()));
        System.out.println("Rasgele sayı 7 : " + Math.round(100 * Math.random()));

        int sayi10 = (int) (Math.random() * 11);  // 10 a kadar sayı üretir 0 da dahil
        System.out.println(sayi10);
        int sayi11 = (int) (Math.random() * 10 + 1);  // 10 a kadar sayı üretir 0 hariç
        System.out.println(sayi11);

        int sayi50 = (int) (Math.random() * 51);
        System.out.println(sayi50);
        int sayi100 = (int) (Math.random() * 101);
        System.out.println(sayi100);
        int sayi150 = (int) (Math.random() * 151);
        System.out.println(sayi150);
        int sayi1000 = (int) (Math.random() * 1001);
        System.out.println(sayi1000);




    }
}
