/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.PegawaiDAO;
import model.Pegawai;

/**
 *
 * @author haikak
 */
public class loginControl {
    private PegawaiDAO DAO= new PegawaiDAO();
    
    public Pegawai Login(String user,String pass)
    {
        DAO.makeConnection();
        Pegawai P=DAO.loginUser(user, pass);
        DAO.closeConnection();
        return P;
    }

}
