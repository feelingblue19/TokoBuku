/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.PegawaiDAO;
import model.Administrator;
import java.util.List;
import model.Pegawai;

/**
 *
 * @author ANDRE
 */
public class administratorControl {
    
    private PegawaiDAO admDAO=new PegawaiDAO();
    
    public void InsertDataAdministrator(Administrator A)
    {
        admDAO.makeConnection();
        admDAO.insertAdministrator(A);
        admDAO.closeConnection();
    }
     
    public List<Administrator> showDataAdministrator()
    {
        admDAO.makeConnection();
        List<Administrator> userData=admDAO.ShowAdministrator();
        admDAO.closeConnection();
        return userData;
    }
    
    public Administrator searchAdministrator(String id_Pegawai)
    {
        Administrator admn=null;
        admDAO.makeConnection();
        admn=admDAO.searchAdministrator(id_Pegawai);
        admDAO.closeConnection();
        return admn;
    }
    
    public void editAdministrator(Administrator A, String id_Pegawai)
    {
        admDAO.makeConnection();
        admDAO.editAdministrator(A, id_Pegawai);
        admDAO.closeConnection();
    }
    
    public void deleteAdministrator(String id_Pegawai)
    {
        admDAO.makeConnection();
        admDAO.deleteAdministrator(id_Pegawai);
        admDAO.closeConnection();
    }
}
