package com.hayati.tastan;

/**
 * Created by Dr. Hayati TAŞTAN on 2.10.2022
 */
public class Main {
    public static void main(String[] args) {

        //Arkadaş sayıları bulma
        //ARKADAŞ SAYI: İki farklı sayının kendileri hariç pozitif tam bölenlerinin toplamları,
        // diğer sayıya eşit ise, bu iki sayıya ARKADAŞ SAYILAR denir.
        // Örnek:
        // a = 220--> 1'den 220'ye kadar (220 hariç) tüm bölenlerin toplamı, total_a  olsun
        // b = 284 --> 1'den 284'e kadar (284 hariç) tüm bölenlerin toplamı, total_b  olsun
        // total_a = b VE total_b = a ise, a ve b sayıları ARKADAŞDIR, aksi halde ARKADAŞ DEĞİLDİR.

        int a = 220;
        int b = 284;
        int total_a = 0;
        int total_b = 0;
        for (int i = 1; i<a;i++){
            if(a%i==0) {
                total_a = total_a + i;
            }
        }

        for (int i = 1; i<b;i++){
            if(b%i==0) {
                total_b = total_b + i;
            }
        }

        if (a==total_b && b==total_a ){
            System.out.println(a + " ve " + b + " SAYILARI ARKADAŞDIR." );
        }else{
            System.out.println(a + " ve " + b + " SAYILARI ARKADAŞ DEĞİLDİR." );
        }

    }
}
