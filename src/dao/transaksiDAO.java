/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Nyoman Chandra
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Transaksi;

/**
 *
 * @author Marcell
 */
public class transaksiDAO {
    
    public static Connection CON;
    public static final String url ="jdbc:ucanaccess://"; //////////
    public static final String path="D:\\TOKOBUKUGG.mdb";
    
    public void makeConnection(){
        System.out.println("Opening Database .....");
        
        try{
            CON=DriverManager.getConnection(url + path);
            System.out.println("Success....\n");
        } catch(Exception e){
            System.out.println("Error opening database .. ");
            System.out.println(e);
        }
    }
    
    public void closeConnection(){
        System.out.println("Closing database . . .");
        
        try{
            CON.close();
            System.out.println("success..\n");
        } catch(Exception e){
            System.out.println("Error closing the database ... ");
            System.out.println(e);
        }
    }
    //Insert Transaksi
    public void insertTransaksi(Transaksi T) {
        String sql = "INSERT INTO Tabel_transaksi(ID_Transaksi, Judul, Harga, Jumlah, Total, Pembeli) values('"+ T.getID_Transaksi()+"', '" +T.getJudul()+"', "+ T.getHarga()+","+ T.getJumlah()+", '"+T.getTotal()+"', '"+T.getPembeli()+"')";
        System.out.println("Adding Buku . . .");

        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added" + result + "Buku\n");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding a Buku . . .");
            System.out.println(e);
        }
    }
    
    //Search Transaksi
    public Transaksi searchTransaksi(String ID_Transaksi){
        String sql="SELECT * FROM Tabel_Transaksi where ID_Transaksi'"+ID_Transaksi+"'";
        System.out.println("Searching Buku . . .");
        
        Transaksi t = null;
        try{
            Statement statement = CON.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            if(rs!=null){
                while(rs.next()){
                    t = new Transaksi(rs.getString("ID_Transaksi"),rs.getString("Judul"),rs.getString("Pembeli"),Double.parseDouble(rs.getString("Harga")),Integer.parseInt(rs.getString("Jumlah")), Double.parseDouble(rs.getString("Total")));
                   
                }
            }
            rs.close();
            statement.close();

        }
        catch(Exception Ex){
            System.out.println("Error reading database information...\n");
            System.out.println(Ex);
        }
         return t;
    }
    
 
    
    
   
    
    //Show Transaksi
    public List<Transaksi> ShowTransaksi() {
        String sql = "SELECT * FROM Tabel_transaksi";
        System.out.println("Daftar Transaksi . . .");

        List<Transaksi> list = new ArrayList<>();

        try{
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if (rs != null) {
                while (rs.next()) {
                   Transaksi   t = new Transaksi(rs.getString("ID_Transaksi"),rs.getString("Judul"),rs.getString("Pembeli"),Double.parseDouble(rs.getString("Harga")),Integer.parseInt(rs.getString("Jumlah")), Double.parseDouble(rs.getString("Total")));
                    list.add(t);
                }
            }
            rs.close();
            statement.close();
        }
        catch (Exception e) {
            System.out.println("Error reading database information...\n");             
            System.out.println(e); 
        }
        
        return list;
    }
    
}
