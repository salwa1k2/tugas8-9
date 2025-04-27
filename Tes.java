/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tes;

/**
 *
 * @author Acer
 */
import java.util.Scanner;

public class Tes {

      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan sisi pertama: ");
        double sisi1 = input.nextDouble();
        System.out.print("Masukkan sisi kedua: ");
        double sisi2 = input.nextDouble();
        System.out.print("Masukkan sisi ketiga: ");
        double sisi3 = input.nextDouble();

        System.out.print("Masukkan warna: ");
        String warna = input.next();

        System.out.print("Apakah terisi (true/false): ");
        boolean terisi = input.nextBoolean();

        segitigaa segitiga = new segitigaa(sisi1, sisi2, sisi3);
        segitiga.setWarna(warna);
        segitiga.setTerisi(terisi);

        System.out.println(segitiga.toString());
        System.out.println("Luas: " + segitiga.getArea());
        System.out.println("Keliling: " + segitiga.getPerimeter());
        System.out.println("Warna: " + segitiga.getWarna());
        System.out.println("Terisi: " + segitiga.isTerisi());

    }
}