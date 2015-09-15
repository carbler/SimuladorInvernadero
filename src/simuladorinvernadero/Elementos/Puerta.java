/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorinvernadero.Elementos;

/**
 *
 * @author melissa
 */
public class Puerta {
    
    public boolean estado;
    
    public Puerta(){
        this.estado=false;
    }
    
    public void Abrir(){
        this.estado=true;
    }
    
    public void Cerrar(){
        this.estado=false;
    }
}
