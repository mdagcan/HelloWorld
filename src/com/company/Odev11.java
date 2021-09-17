package com.company;

import java.util.Scanner;

public class Odev11 {
    public static void main(String[] args) {
        System.out.println("***FONKSİYON HESABI***");
        Scanner tara = new Scanner(System.in);
        System.out.println("Fonksiyonda kullanmak için iki tane değer gir;");
        System.out.print("X değeri : ");
        double xDegeri = tara.nextInt();
        System.out.print("Y değeri : ");
        double yDegeri = tara.nextInt();
        double sonuc = 0;
        if (xDegeri > 0 && yDegeri < 0) {
            sonuc = 4 * xDegeri + 2 * yDegeri + 4;
        } else if (xDegeri > 0 && yDegeri == 0) {
            sonuc = 2 * xDegeri - yDegeri + 3;
        } else if (xDegeri <= 0 && yDegeri > 0) {
            sonuc = 3 * xDegeri + 4 * yDegeri + 3;
        } else {
            System.out.println("Fonksiyonun geçerli bir değeri yok.");
        }
        System.out.println("f(x,y) = " + sonuc);
    }
}
