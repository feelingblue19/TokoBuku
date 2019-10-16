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
public class Administrator extends Pegawai {
    
    private String divisi;

    public Administrator(){}
    public Administrator(String id_Pegawai, String nama, String username, String password, double gaji, String divisi, String tugas) {
        super(id_Pegawai, nama, username, password, gaji, tugas);
        this.divisi = divisi;
    }

    public String getDivisi() {
        return divisi;
    }

    public void setDivisi(String divisi) {
        this.divisi = divisi;
    }
    
    @Override
    public String showData()
    {
        return getID_Pegawai()+" | "+getNama()+" | "+getUsername()+" | "+getPassword()+" | "+getGaji()+" | "+getDivisi();
    }  
    
}
