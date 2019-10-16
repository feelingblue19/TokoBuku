/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Buku;
import view.FormListBuku;

/**
 *
 * @author Marcell
 */
public class bukuDAO {
    
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
    //Insert Buku
    public void insertBuku(Buku B) {
        String sql = "INSERT INTO Tabel_buku(ID_buku, Pengarang, Jumlah, harga, Penerbit, Judul) values('"+ B.getID_Buku()+"', '" +B.getPengarang()+ "', "+ B.getJumlah()+","+ B.getHarga()+", '"+B.getPenerbit()+"', '"+B.getJudul()+"')";
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
    
    //Search Buku
    public Buku searchBuku(String ID_Buku){
         String sql="SELECT * FROM Tabel_buku where ID_buku='"+ID_Buku+"'";
        System.out.println("Searching Buku . . .");
         
        Buku b=null;
        try
        {
             Statement statement=CON.createStatement();
             ResultSet rs=statement.executeQuery(sql);
             if(rs!=null)
             {
                 while(rs.next())
                 {
                     b = new Buku(rs.getString("ID_buku"),rs.getString("Pengarang"),rs.getString("Judul"),
                             Integer.parseInt(rs.getString("Jumlah")), Double.parseDouble(rs.getString("harga")),
                             rs.getString("Penerbit")); 
                 }
             }
             rs.close();
             statement.close();
        }
        catch(Exception Ex)
        {
            System.out.println("Error reading database information...\n");
            System.out.println(Ex);
        }
        
        return b;
    }
    
    //Edit Buku
    public void editBuku(Buku buku,String ID_Buku){
        String sql="UPDATE Tabel_buku SET ID_buku = '"+buku.getID_Buku()+"', Pengarang = '" +buku.getPengarang()+ "', Jumlah = "+ buku.getJumlah()+", harga = " +buku.getHarga()+", Penerbit= '"+buku.getPenerbit()+"', Judul = '"+buku.getJudul()+"' where ID_buku='" +ID_Buku+"'";
        System.out.println("Editing Buku . . .");
        
        try{
            Statement statement = CON.createStatement();
            int result=statement.executeUpdate(sql);
            System.out.println("Edit "+result+" Buku\n"+ID_Buku);
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Error edit a Buku...\n");
            System.out.println(Ex);
        }
    }
    
    
    //Delete Buku
    public void deleteBuku(String ID_Buku ){
        String sql="DELETE FROM Tabel_buku WHERE ID_buku= '" +ID_Buku+"'";
        System.out.println("Delete Buku ");
        try{
            Statement statement=CON.createStatement();
            int result=statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Buku\n");
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Error deleting a Buku...\n");
            System.out.println(Ex);
        }
    }
    
    //Show Buku
    public List<Buku> ShowBuku() {
        String sql = "SELECT * FROM Tabel_buku";
        System.out.println("Daftar Buku . . .");

        List<Buku> list = new ArrayList<>();

        try{
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if (rs != null) {
                while (rs.next()) {
                    Buku b = new Buku(rs.getString("ID_buku"),rs.getString("Pengarang"),rs.getString("Judul"),Integer.parseInt(rs.getString("Jumlah")), Double.parseDouble(rs.getString("harga")),rs.getString("Penerbit"));
                    list.add(b);
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
