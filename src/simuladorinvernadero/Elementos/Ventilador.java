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
public class Ventilador {
    
    public int rpm;
    public int flujoAire;
    public boolean estado=true;
    
    public Ventilador(){
        this.flujoAire=0;
    }
    
    public void Encender(){
        this.flujoAire=10;
    }
    
    public void Apagar(){
        this.flujoAire=0;
    }
}
