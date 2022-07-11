package com.company;


import java.util.Scanner;

public class Main {
    //
    public static void main(String[] args) {


        int oncekiSayi = 0, simdikiSayi = 1, sonrakiSayi=0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Fibonacci Dizisinin eleman sayýsýný giriniz: ");
        int elemanSayisi = scanner.nextInt();


        int i;
        for (i = 1; i < elemanSayisi; i++) {

            System.out.println(oncekiSayi + " ");
            sonrakiSayi = oncekiSayi + simdikiSayi;
            oncekiSayi = simdikiSayi;
            simdikiSayi = sonrakiSayi;


        }
    }
}





