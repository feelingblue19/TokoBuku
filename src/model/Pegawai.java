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
public abstract class Pegawai {
    
    private String id_Pegawai;
    private String nama;
    private String username;
    private String password;
    private double gaji;
    private String tugas;

    public Pegawai(){}
    public Pegawai(String id_Pegawai, String nama, String username, String password, double gaji, String tugas) {
        this.id_Pegawai = id_Pegawai;
        this.nama = nama;
        this.username = username;
        this.password = password;
        this.gaji = gaji;
        this.tugas = tugas;
        
    }

    public String getTugas() {
        return tugas;
    }

    public void setTugas(String tugas) {
        this.tugas = tugas;
    }

    public String getID_Pegawai() {
        return id_Pegawai;
    }

    public String getNama() {
        return nama;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public double getGaji() {
        return gaji;
    }

    public void setID_Pegawai(String ID_Pegawai) {
        this.id_Pegawai = ID_Pegawai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }
    
    public abstract String showData();
   
}
