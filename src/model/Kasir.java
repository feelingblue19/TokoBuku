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
public class Kasir extends Pegawai {
    
    private int jamKerja;
    
    public Kasir(){}
    public Kasir(String id_Pegawai, String nama, String username, String password, double gaji, int jamKerja, String tugas) {
        super(id_Pegawai, nama, username, password, gaji, tugas);
        this.jamKerja = jamKerja;
    }

    public int getJamKerja() {
        return jamKerja;
    }

    public void setJamKerja(int jamKerja) {
        this.jamKerja = jamKerja;
    }
    
    @Override
    public String showData()
    {
        return getID_Pegawai()+" | "+getNama()+" | "+getUsername()+" | "+getPassword()+" | "+getGaji()+" | "+getJamKerja();
    }
    
    
}
