package com.company;

import java.awt.desktop.QuitEvent;
import java.util.Scanner;

public class Odev12 {
    public static void main(String[] args) {
        Scanner tara = new Scanner(System.in);
        System.out.println("***ÖĞRENCİ NOT PROGRAMI***");
        System.out.println("Not: Çıkış yapmak için Q ya basın.");
        while ( 1 > 0) {
            System.out.print("Öğrencinin aldığı notu giriniz : ");
            Double notDegeri = tara.nextDouble();

            if (notDegeri < 45) {
                System.out.println("Öğrenci aldığı " + notDegeri + " notu ile DD notu almıştır");
            } else if (notDegeri >=45 && notDegeri < 55) {
                System.out.println("Öğrenci aldığı " + notDegeri + " notu ile CD notu almıştır");
            } else if (notDegeri >= 55 && notDegeri < 65) {
                System.out.println("Öğrenci aldığı " + notDegeri + " notu ile CB notu almıştır");
            } else if (notDegeri >= 65 && notDegeri < 75) {
                System.out.println("Öğrenci aldığı " + notDegeri + " notu ile BB notu almıştır");
            } else if (notDegeri >= 75 && notDegeri < 85) {
                System.out.println("Öğrenci aldığı " + notDegeri + " notu ile BA notu almıştır");
            } else if (notDegeri >= 85 && notDegeri <= 100) {
                System.out.println("Öğrenci aldığı " + notDegeri + " notu ile AA notu almıştır");
            } else if (String.valueOf(notDegeri) == "Q") {
                break;
            } else {
                System.out.println("Lütfen geçerli bir not girin.");
            }


        }
    }
}
