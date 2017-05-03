/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author SENA
 */
public class Contactos {
    
    private String dniContacto;
    private String emailContacto;
    private String nickUsuario;
    
    public void setDniContacto(String dniContactoP){
        this.dniContacto = dniContactoP;
    }
    
    public String getDniContacto(){
        return this.dniContacto;
    }
    
    public void setEmailContacto(String emailContactoP){
        this.emailContacto = emailContactoP;
    }
    
    public String getEmailContacto(){
        return this.emailContacto;
    }
    
    public void setNickContacto(String nickContactoP){
        this.nickUsuario = nickContactoP;
    }
    
    public String getNickContacto(){
        return this.nickUsuario;
    }
}
