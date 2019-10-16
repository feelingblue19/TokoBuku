/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author ANDRE
 */
import model.Pegawai;
import model.Kasir;
import model.Administrator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PegawaiDAO {
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
    
    //Insert Administrator
    public void insertAdministrator(Administrator A) {
        String sql = "INSERT INTO Tabel_pegawai(ID_Pegawai, Nama, Username, Password, Gaji, Divisi, Tugas) values('"+ A.getID_Pegawai()+ "', '" +A.getNama()+ "', '"+ A.getUsername()+"', '" + A.getPassword()+"', "+A.getGaji()+", '"+A.getDivisi()+"', '"+A.getTugas()+"')";
        System.out.println("Adding Administrator . . .");

        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added" + result + "Administrator\n");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding a Administrator . . .");
            System.out.println(e);
        }
    }
    //Insert Kasir
    public void insertKasir(Kasir K) {
        String sql = "INSERT INTO Tabel_pegawai(ID_Pegawai, Nama, Username, Password, Gaji, JamKerja, Tugas) values('"+K.getID_Pegawai()+"', '" +K.getNama()+ "', '"+K.getUsername()+"', '"+K.getPassword()+"', "+K.getGaji()+", "+K.getJamKerja()+", '"+K.getTugas()+"')";
        System.out.println("Adding Kasir . . .");

        try {
            Statement statement = CON.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added" + result + "Kasir\n");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding a Kasir . . .");
            System.out.println(e);
        }
    }
    
    //Search Administrator
    public Administrator searchAdministrator(String id_Pegawai){
        String sql="SELECT * FROM Tabel_pegawai where ID_Pegawai='"+id_Pegawai+"'";
        System.out.println("Searching Administrator . . .");
        
        Administrator adm = null;
        try{
            Statement statement = CON.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            if(rs!=null){
                while(rs.next()){
                    adm = new Administrator(rs.getString("ID_Pegawai"),rs.getString("Nama"),rs.getString("Username"),rs.getString("Password"), Double.parseDouble(rs.getString("Gaji")),rs.getString("Divisi"), rs.getString("Tugas"));
                }
            }
            rs.close();
            statement.close();

        }
        catch(Exception Ex){
            System.out.println("Error reading database information...\n");
            System.out.println(Ex);
        }
         return adm;
    }
    
    //Search Kasir
    public Kasir searchKasir(String id_Pegawai){
        String sql="SELECT * FROM Tabel_pegawai where ID_Pegawai='"+id_Pegawai+"'";
        System.out.println("Searching Kasir . . .");
        
        Kasir ksr = null;
        try{
            Statement statement = CON.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            if(rs!=null){
                while(rs.next()){
                    ksr = new Kasir(rs.getString("ID_Pegawai"),rs.getString("Nama"),rs.getString("Username"),rs.getString("Password"), Double.parseDouble(rs.getString("Gaji")),Integer.parseInt(rs.getString("JamKerja")), rs.getString("Tugas"));
                }
            }
            rs.close();
            statement.close();

        }
        catch(Exception Ex){
            System.out.println("Error reading database information...\n");
            System.out.println(Ex);
        }
         return ksr;
    }

    //Edit Administrator
    public void editAdministrator(Administrator administrator,String id_Pegawai){
        String sql="UPDATE Tabel_pegawai SET ID_Pegawai = '"+ administrator.getID_Pegawai()+ "', Nama = '" +administrator.getNama()+ "', Username = '"+ administrator.getUsername()+"', Password = '" +administrator.getPassword()+"', Gaji= "+administrator.getGaji()+", Divisi = '"+administrator.getDivisi()+"' where ID_Pegawai='" +id_Pegawai+"'";
        System.out.println("Editing Administrator . . .");
        try{
            Statement statement = CON.createStatement();
            int result=statement.executeUpdate(sql);
            System.out.println("Edit "+result+" Administrator\n"+id_Pegawai);
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Error edit a Administrator...\n");
            System.out.println(Ex);
        }
    }
    
    //Edit Kasir
    public void editKasir(Kasir kasir,String id_Pegawai){
        String sql="UPDATE Tabel_pegawai SET ID_Pegawai = '"+ kasir.getID_Pegawai()+ "', Nama = '" +kasir.getNama()+ "', Username = '"+ kasir.getUsername()+"', Password = '" +kasir.getPassword()+"', Gaji= "+kasir.getGaji()+", JamKerja = "+kasir.getJamKerja()+" where ID_Pegawai='" +id_Pegawai+"'";
        System.out.println("Editing Kasir . . .");
        try{
            Statement statement = CON.createStatement();
            int result=statement.executeUpdate(sql);
            System.out.println("Edit "+result+" Kasir\n"+id_Pegawai);
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Error edit a Kasir...\n");
            System.out.println(Ex);
        }
    }
    
    //Delete Administrator
    public void deleteAdministrator(String id_Pegawai ){
        String sql="DELETE FROM Tabel_pegawai WHERE ID_Pegawai= '" +id_Pegawai+"'";
        System.out.println("Delete Administrator ");
        try{
            Statement statement=CON.createStatement();
            int result=statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Administrator\n");
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Error deleting a Administrator...\n");
            System.out.println(Ex);
        }
    }

    //Delete Kasir
    public void deleteKasir(String id_Pegawai ){
        String sql="DELETE FROM Tabel_pegawai WHERE ID_Pegawai= '" +id_Pegawai+"'";
        System.out.println("Delete Kasir ");
        try{
            Statement statement=CON.createStatement();
            int result=statement.executeUpdate(sql);
            System.out.println("Delete "+result+" Kasir\n");
            statement.close();
        }
        catch(Exception Ex){
            System.out.println("Error deleting a Kasir...\n");
            System.out.println(Ex);
        }
    }
    
    //Show Administrator
    public List<Administrator> ShowAdministrator() {
        String sql = "SELECT * FROM Tabel_pegawai";
        System.out.println("Daftar Administrator . . .");

        List<Administrator> list = new ArrayList<>();

        try{
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if (rs != null) {
                while (rs.next()) {
                    Administrator a = new Administrator(rs.getString("ID_Pegawai"),rs.getString("Nama"),rs.getString("Username"),rs.getString("Password"), Double.parseDouble(rs.getString("Gaji")),rs.getString("Divisi"), rs.getString("Tugas"));
                    list.add(a);
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

    //Show Kasir
    public List<Kasir> ShowKasir() {
        String sql = "SELECT * FROM Tabel_pegawai";
        System.out.println("Daftar Kasir . . .");

        List<Kasir> list = new ArrayList<>();

        try{
            Statement statement = CON.createStatement();
            ResultSet rs = statement.executeQuery(sql);

            if (rs != null) {
                while (rs.next()) {
                    Kasir k = new Kasir(rs.getString("ID_Pegawai"),rs.getString("Nama"),rs.getString("Username"),rs.getString("Password"), Double.parseDouble(rs.getString("Gaji")),Integer.parseInt(rs.getString("JamKerja")), rs.getString("Tugas"));
                    list.add(k);
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

    public Pegawai loginUser(String user,String pass)
    {
        String sql="SELECT * from Tabel_pegawai where username='"+user+"' AND password='"+pass+"'";
        Pegawai P= new Administrator();
        try
        {
            Statement statement=CON.createStatement();
            ResultSet rs=statement.executeQuery(sql);
            if(rs!=null)
            {
                while(rs.next())
                {
                    
                    P=new Administrator(rs.getString("ID_Pegawai"), rs.getString("Nama"), rs.getString("Username"), rs.getString("Password"), rs.getDouble("Gaji"), rs.getString("Divisi"), rs.getString("Tugas"));
                    return P;
                }
            }
            rs.close();
            statement.close();
        }
        catch(Exception Ex)
        {
            System.out.println("Error reading database information . . .\n");
            System.out.println(Ex);
        }
        return null;                
    }
}
