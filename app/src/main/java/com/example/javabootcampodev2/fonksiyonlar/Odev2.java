package com.example.javabootcampodev2.fonksiyonlar;

public class Odev2 {

    /*
    SORU1. Parametre olarak girilen kilometreyi mile dönüştürdükten sonra geri
    döndüren bir metod yazınız. Mile = Km x 0.621
     */
    public double  kilometreMileCevirme(double kilometre){
        double mil= kilometre*0.621;
        return mil;
    }

    /*
    SORU2. Kenarları parametre olarak girilen ve dikdörtgenin alanını
    hesaplayan bir metod yazınız.
     */
    public void alanHesapla(int a,int b){
        int alan=a*b;
        System.out.println("Alan:"+alan);
    }

    /*
    SORU3.Parametre olarak girilen sayının faktoriyel değerini hesaplayıp geri
    döndüren metodu yazınız.
     */
    public long faktoriyelHesabi(int a){
        if (a==0){
            return 1;
        }
        return a*faktoriyelHesabi(a-1);
    }

    /*
    SORU4: Parametre olarak girilen kelime içinde kaç adet e harfi olduğunu
    gösteren bir metod yazınız
     */
    public void eHarfiSay(String kelime){
        int sayac=0;
        for ( int i=0; i< kelime.length();i++){
            if (kelime.charAt(i)=='e'|| kelime.charAt(i)=='E'){
                sayac++;
            }
        }
        System.out.println(" Kelimenin içinde" + sayac + "adet 'e' harfi bulunuyor.");
    }

    /*
    SORU5: Parametre olarak girilen kenar sayısına göre her bir iç açıyı hesaplayıp sonucu
     geri gönderen metod yazınız.
        • İç açılar toplamı = ( (Kenar sayısı - 2) x 180 ) / Kenar sayısı
     */
    public double icAciHesabi(int kenar){
        if(kenar<3){
            return -1;
        }
        return (kenar-2)*180/kenar;
    }

    /*
    SORU6 Parametre olarak girilen gün sayısına göre maaş hesabı yapan ve elde edilen değeri döndüren metod
    yazınız.
    • 1 günde 8 saat çalışılabilir.
    • Çalışma saat ücreti : 40 ₺
    • Mesai saat ücreti : 80 ₺
    • 150 saat üzeri mesai sayılır.
     */
    public double hesaplaMaas(int gunSayisi) {
        int calismaSaati = gunSayisi * 8;
        double calismaUcreti = calismaSaati * 40; // Çalışma saat ücreti: 40 ₺

        // Mesai hesabı
        int mesaiSaati = calismaSaati - (gunSayisi * 8); // Normal çalışma saatleri dışındaki saatler
        if (mesaiSaati > 150) {
            mesaiSaati = 150; // 150 saatten fazla mesai kabul edilmiyor
        }
        double mesaiUcreti = mesaiSaati * 80; // Mesai saat ücreti: 80 ₺
        return calismaUcreti + mesaiUcreti;
    }

    /*
    SORU7 Parametre olarak girilen otopark süresine göre otopark ücreti hesaplayarak geri döndüren metodu
    yazınız.
        • 1 saat = 50 ₺
        • 1 saat aşımından sonra her 1 saat , 10 ₺’dir.
    */
    public double otoparkUcretiHesabi(int sure){
        int birSaatlikUcreti=50;
        double toplamUcret=(sure/60)*birSaatlikUcreti;
        int fazlaSaat=sure%60;
        if (fazlaSaat>0){
            toplamUcret = toplamUcret + (fazlaSaat / 60) * 10;
        }
        return toplamUcret;
    }
}
