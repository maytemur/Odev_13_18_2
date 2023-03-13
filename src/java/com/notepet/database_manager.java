package com.notepet;
import java.sql.*;
public class database_manager {
    public void ekle(String username,String password,String name,
            String surname,String email) {
        try{
            database_connect m=new database_connect();
            Connection baglanti=m.getConnection();
            String sql="insert into portaldatabase(username,password,name,surname,email) " +
                    "values(?,?,?,?,?)";
            PreparedStatement ekle=baglanti.prepareStatement(sql);
            ekle.setString(1,username);
            ekle.setString(2,password);
            ekle.setString(3,name);
            ekle.setString(4,surname);
            ekle.setString(5,email);
            
            int sonuc=ekle.executeUpdate();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        database_manager dm=new database_manager();
        dm.ekle("wtrww","er","mahmu","snma","email");
    }}