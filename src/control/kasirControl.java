/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;
import dao.PegawaiDAO;
import model.Kasir;
import java.util.List;
import model.Pegawai;

/**
 *
 * @author ANDRE
 */
public class kasirControl {
    
   private PegawaiDAO ksrDAO=new PegawaiDAO();
    
    public void InsertDataKasir(Kasir K)
    {
        ksrDAO.makeConnection();
        ksrDAO.insertKasir(K);
        ksrDAO.closeConnection();
    }
     
    public List<Kasir> showDataKasir()
    {
        ksrDAO.makeConnection();
        List<Kasir> userData=ksrDAO.ShowKasir();
        ksrDAO.closeConnection();
        return userData;
    }
    
    public Kasir searchKasir(String id_Pegawai)
    {
        Kasir kasir=null;
        ksrDAO.makeConnection();
        kasir=ksrDAO.searchKasir(id_Pegawai);
        ksrDAO.closeConnection();
        return kasir;
    }
    
    public void editKasir(Kasir K, String id_Pegawai)
    {
        ksrDAO.makeConnection();
        ksrDAO.editKasir(K, id_Pegawai);
        ksrDAO.closeConnection();
    }
    
    public void deleteKasir(String id_Pegawai)
    {
        ksrDAO.makeConnection();
        ksrDAO.deleteKasir(id_Pegawai);
        ksrDAO.closeConnection();
    }
}