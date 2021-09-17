package com.company;

import java.util.Scanner;

public class Odev20 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("üçgen oluşturmak için üç adet uzunluk girin...");
        System.out.print("Birinci uzunluk : ");
        int uzunlukBir = tara.nextInt();
        System.out.print("İkinci uzunluk : ");
        int uzunlukIki = tara.nextInt();
        System.out.print("Üçüncü uzunluk : ");
        int uzunlukUc = tara.nextInt();

        if (uzunlukBir == uzunlukIki && uzunlukBir == uzunlukUc) {
            System.out.println("Eşkenar üçgen");
        } else if (uzunlukBir == uzunlukIki || uzunlukBir == uzunlukUc) {
            System.out.println("İkizkenar Üçgen");
        } else if (uzunlukIki == uzunlukUc || uzunlukIki == uzunlukBir) {
            System.out.println("İkizkenar Üçgen");
        } else {
            System.out.println("Çokgener üçgen");
        }

    }
}
