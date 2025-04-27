/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tes;

/**
 *
 * @author Acer
 */
public class ObjekGeometris {
    private String warna = "putih";
    private boolean terisi;

    public ObjekGeometris() {
    }

    public ObjekGeometris(String warna, boolean terisi) {
        this.warna = warna;
        this.terisi = terisi;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public boolean isTerisi() {
        return terisi;
    }

    public void setTerisi(boolean terisi) {
        this.terisi = terisi;
    }

    @Override
    public String toString() {
        return "Warna: " + warna + " Terisi: " + terisi;
    }
}