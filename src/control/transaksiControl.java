/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author Nyoman Chandra
 */
import dao.transaksiDAO;
import java.util.List;
import model.Transaksi;

/**
 *
 * @author Marcell
 */
public class transaksiControl {
    
    private transaksiDAO trxDAO=new transaksiDAO();
    
    public void InsertDataTransaksi(Transaksi t)
    {
       trxDAO.makeConnection();
        trxDAO.insertTransaksi(t);
        trxDAO.closeConnection();
    }
     
    public List<Transaksi> showDataTransaksi()
    {
        trxDAO.makeConnection();
        List<Transaksi> userData=trxDAO.ShowTransaksi();
        
        trxDAO.closeConnection();   
        
        return userData;
    }
    
    public Transaksi searchTransaksi(String ID_Transaksi)
    {
       Transaksi t=null;
        trxDAO.makeConnection();
       trxDAO.searchTransaksi(ID_Transaksi);
        trxDAO.closeConnection();
        return t;
    }
    
    
    
}
