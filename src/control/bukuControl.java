/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import dao.bukuDAO;
import java.util.List;
import java.util.Vector;
import model.Buku;

/**
 *
 * @author Marcell
 */
public class bukuControl {
    
    private bukuDAO bkDAO=new bukuDAO();
    
    public void InsertDataBuku(Buku B)
    {
        bkDAO.makeConnection();
        bkDAO.insertBuku(B);
        bkDAO.closeConnection();
    }
     
    public List<Buku> showDataBuku()
    {
        bkDAO.makeConnection();
        List<Buku> userData=bkDAO.ShowBuku();
        
        
        bkDAO.closeConnection();             
        return userData;
    }
    
    public Buku searchBuku(String ID_Buku)
    {
        Buku buku=null;
        bkDAO.makeConnection();
        buku=bkDAO.searchBuku(ID_Buku);
        bkDAO.closeConnection();
        return buku;
    }
    
    public void editBuku(Buku B, String ID_Buku)
    {
        bkDAO.makeConnection();
        bkDAO.editBuku(B, ID_Buku);
        bkDAO.closeConnection();
    }
    
    public void deleteBuku(String ID_Buku)
    {
        bkDAO.makeConnection();
        bkDAO.deleteBuku(ID_Buku);
        bkDAO.closeConnection();
    }
    
}
