/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication8;

/**
 *
 * @author sena
 */
public class Usuario {
    private int idUsuario;
    public void setIdUsuario (int idUsuarioP)
    {
        this.idUsuario=idUsuarioP;
    }
    public int getIdUsuario()
    {
        return this.idUsuario;
      
    }
    
  
    private String nombre;
    public void setNombre (String nombreP)
    {
        this.nombre=nombreP;
        
    }
    public String getNombre()
    {
        return this.nombre;
    }
    
     private String apellidos;
    public void setApellidos (String apellidosP)
    {
        this.apellidos=apellidosP;
        
    }
    public String getApellidos()
    {
        return this.apellidos;
    }
    
     private int telefono;
    public void setTelefono (int telefonoP)
    {
        this.idUsuario=telefonoP;
    }
    public int getTelefono()
    {
        return this.telefono;
      
    }
    
    
}
