/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESRA AYDIN
 */
public class Kullanici {
    
    private int id;
    String tckimlikno ;
    String name ;
    String password ;
    String type ; 
    
    
    public Kullanici(int id, String tckimlikno, String name, String password, String type){
        
        this.id = id;
        this.tckimlikno = tckimlikno;
        this.name = name;
        this.password = password;
        this.type = type;
    
    }
    
    public Kullanici(){}
    
    public int getId(){
        return id;
        
    }
    
    public String getTckimlikno(){
        return tckimlikno;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getType(){
        return type;
    }
    
    public static void main(String[] args) {
        
    }
    
    
}
