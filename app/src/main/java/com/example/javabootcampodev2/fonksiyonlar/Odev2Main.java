package com.example.javabootcampodev2.fonksiyonlar;

public class Odev2Main {
    public static void main(String[] args) {

        System.out.println("-----------------------------SONUÇ1:---------------------------------");
        Odev2 odev2 = new Odev2();
        double mil = odev2.kilometreMileCevirme(90);
        System.out.println( 90 + " kilometre, " + mil + " mil'e eşittir.");
        // ÇIKTI1: 90 kilometre, 55.89 mil'e eşittir.


        System.out.println("-----------------------------SONUÇ2:---------------------------------");
        odev2.alanHesapla(4,5);
        System.out.println();
        //ÇIKTI2: Alan: 20


        System.out.println("-----------------------------SONUÇ3:---------------------------------");
        long sonuc= odev2.faktoriyelHesabi(5);
        System.out.println(5 + "sayısının faktöriyeli:"+ sonuc);
        //ÇIKTI3: 5 sayısının faktöriyeli:120


        System.out.println("-----------------------------SONUÇ4:---------------------------------");
        String kelime= "Merhaba Dünya";
        odev2.eHarfiSay(kelime);
        //ÇIKTI4: Kelimenin içinde1adet 'e' harfi bulunuyor.


        System.out.println("-----------------------------SONUÇ5:---------------------------------");
        double icAci= odev2.icAciHesabi(5);
        if (icAci!=-1){
            System.out.println(5 + "kenarlı bir çokgenin her bir iç açısı" + icAci +  "derecedir.");
        }else{
            System.out.println("en az 3 kenarlı olmalı");
        }
        //ÇIKTI5: 5 kenarlı bir çokgenin her bir iç açısı 108.0 derecedir.


        System.out.println("-----------------------------SONUÇ6:---------------------------------");
        double maas = odev2.hesaplaMaas(20);
        System.out.println("Toplam Maaş: " + maas + " ₺");
        //ÇIKTI: Toplam Maaş: 6400.0 ₺


        System.out.println("-----------------------------SONUÇ7:---------------------------------");
        double ucret= odev2.otoparkUcretiHesabi(90);
        System.out.println("otopark ücreti"  + ucret + "₺");
        // ÇIKTI: otopark ücreti 50.0₺
    }
}
