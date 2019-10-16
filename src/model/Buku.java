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
public class Buku {
    
    private String ID_Buku;
    private String pengarang;
    private String judul;
    private int jumlah;
    private double harga;
    private String penerbit;

    public Buku(String ID_Buku, String pengarang, String judul, int jumlah, double harga, String penerbit) {
        this.ID_Buku = ID_Buku;
        this.pengarang = pengarang;
        this.judul = judul;
        this.jumlah = jumlah;
        this.harga = harga;
        this.penerbit = penerbit;
    }

    public String getID_Buku() {
        return ID_Buku;
    }

    public String getPengarang() {
        return pengarang;
    }

    public String getJudul() {
        return judul;
    }

    public int getJumlah() {
        return jumlah;
    }

    public double getHarga() {
        return harga;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public void setID_Buku(String ID_Buku) {
        this.ID_Buku = ID_Buku;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setPenerbit(String penerbit) {
        this.penerbit = penerbit;
    }
    
    public String showData()
    {
        return getID_Buku()+" | "+getPengarang()+" | "+getJudul()+" | "+getJudul()+" | "+getHarga()+" | "+getPenerbit();
    }
}
