/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Marcell
 */
public class Transaksi {
    
    private String ID_Transaksi;
    private String judul;
    private String pembeli;
    private double harga;
    private int jumlah;
    private double total;

    public Transaksi(String ID_Transaksi, String judul, String pembeli, double harga, int jumlah, double total) {
        this.ID_Transaksi = ID_Transaksi;
        this.judul = judul;
        this.pembeli = pembeli;
        this.harga = harga;
        this.jumlah = jumlah;
        this.total = total;
    }

    public String getID_Transaksi() {
        return ID_Transaksi;
    }

    public String getJudul() {
        return judul;
    }

    public String getPembeli() {
        return pembeli;
    }

    public double getHarga() {
        return harga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getTotal() {
        total=getHarga()*getJumlah();
        return total;
    }

    public void setID_Transaksi(String ID_Transaksi) {
        this.ID_Transaksi = ID_Transaksi;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setPembeli(String pembeli) {
        this.pembeli = pembeli;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public String showData()
    {
        return getID_Transaksi()+" | "+getPembeli()+" | "+getJudul()+" | "+getJumlah()+" | "+getHarga()+" | "+getTotal();
    }
}
