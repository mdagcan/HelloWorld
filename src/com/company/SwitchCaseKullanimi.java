package com.company;

public class SwitchCaseKullanimi {
    public static void main(String[] args) {
        int haftaninKacinciGunu = 5;

        if (haftaninKacinciGunu == 1) {
            System.out.println("Pazartesi");
        } else if (haftaninKacinciGunu == 2) {
            System.out.println("Salı");
        } else if (haftaninKacinciGunu == 3) {
            System.out.println("Çarşamba");
        } else if (haftaninKacinciGunu == 4) {
            System.out.println("Perşembe");
        } else if (haftaninKacinciGunu == 5) {
            System.out.println("Cuma");
        } else if (haftaninKacinciGunu == 6) {
            System.out.println("Cumartesi");
        } else if (haftaninKacinciGunu == 7) {
            System.out.println("Pazar");
        }

        // switch case yapısı

        switch (haftaninKacinciGunu) {
            case 1 : System.out.println("Swiitch Pazartesi"); break;
            case 2 : System.out.println("Swiitch Salı"); break;
            case 3 : System.out.println("Swiitch Çarşamba"); break;
            case 4 : System.out.println("Swiitch Perşembe"); break;
            case 5 : System.out.println("Swiitch Cuma"); break;
            case 6 : System.out.println("Swiitch Cumartesi"); break;
            case 7 : System.out.println("Swiitch Pazar"); break;
            //default: System.out.println("Yanlış bir gün değeri girildi");
        }

    }
}
