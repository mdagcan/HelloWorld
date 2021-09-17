package com.company;

public class KodBloklari {
    public static void main(String[] args) {

        int seviyeBirBlokBir = 11;{

            int seviyeIkiBlokBir = 21;{

                int seviyeUcBlokBir = 31;{
                    System.out.println(seviyeBirBlokBir);
                    System.out.println(seviyeIkiBlokBir);
                    System.out.println(seviyeUcBlokBir);
                }
            }
        }
        int seviyeBirBlokIki = 12;{
            System.out.println(seviyeBirBlokIki);
            System.out.println(seviyeBirBlokBir);
            // seviye 2 ve 3 ler bu blokta görünmüyor sebebi önceki blokta yaşadı ve öldü
        }







    }
}
