
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ESRA AYDIN
 */
public class Yardim {
    
    public static void showMsg(String str){
        String msg;
        
        switch(str){
            case "fill":
                msg = "Lütfen tüm alanları doldurunuz !";
                break;
            default:
                msg = str;
                
        }
        JOptionPane.showConfirmDialog(null, msg, "Mesaj:" , JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static void main(String[] args) {
        
    }
}
