/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simuladorinvernadero;

import simuladorinvernadero.Elementos.Bombillo;
import simuladorinvernadero.Elementos.Puerta;
import simuladorinvernadero.Elementos.Riego;
import simuladorinvernadero.Elementos.Ventilador;

/**
 *
 * @author melissa
 */
public class InvernaderoController {
    public Bombillo bombillo;
    public Puerta puerta;
    public Riego riego;
    public Ventilador ventilador;
    
    public InvernaderoController(){
        this.bombillo = new Bombillo();
        this.puerta = new Puerta();
        this.riego = new Riego();
        this.ventilador = new Ventilador();
    }
    
    
    public void onBombillo(){
        bombillo.encender();
    }

    public void OffBombillo() {
       
        bombillo.apagar();
    }
}
