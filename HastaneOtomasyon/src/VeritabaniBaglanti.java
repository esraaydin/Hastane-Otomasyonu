
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESRA AYDIN
 */
public class VeritabaniBaglanti {
    
    private String kullanici_adi= "root";
    private String password = "";
    
    private String db_ismi = "hastaneotomasyon" ;
     
    private String host = "localhost";
    
    private int port = 3306;
    
    private Connection con = null ;
    
    private Statement statement = null ;
    
    public void kullaniciGetir(){
        
        String sorgu = "Select * From kullanici ";
        
        try {
            statement = con.createStatement();
            
            ResultSet rs = statement.executeQuery(sorgu);
            while( rs.next()){
                 int id= rs.getInt("id");
                 String tckimlikno= rs.getString("tckimlikno");
                 String password= rs.getString("password");
                 String name= rs.getString("name");
                 String type= rs.getString("type");
                 
                 System.out.println("Id :" + id);
                 System.out.println("T.C Kimlik No :" + tckimlikno);
                 System.out.println("Şifre :" + password);
                 System.out.println("İsim :" + name);
                 System.out.println("Type :" + type);
                 
                 System.out.println("*******************************");
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(VeritabaniBaglanti.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public VeritabaniBaglanti(){
        
        //"jdbc:mysql://localhost:3306/hastaneotomasyon"
        String url = "jdbc:mysql://" + host + ":" + port + "/" + db_ismi;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException ex) {
            System.out.println("Driver Bulunamadı..!");
        }
        
        try {
            con = DriverManager.getConnection(url, kullanici_adi, password);
            System.out.println("Bağlantı Başarılı..!");
            
            
        } catch (SQLException ex) {
            System.out.println("Bağlantı Başarısız..!");
            //ex.printStackTrace();
           
        } 
        
            
        } 
    public static void main(String[] args ){
        
        VeritabaniBaglanti veritabanibaglanti = new VeritabaniBaglanti();
        veritabanibaglanti.kullaniciGetir();
    }
}
    

 