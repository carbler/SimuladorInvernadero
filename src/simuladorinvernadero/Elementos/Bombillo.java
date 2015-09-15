
package simuladorinvernadero.Elementos;

/**
 *
 * @author melissa
 */
public class Bombillo {
    
    /**
     * Attributos del objeto bombillo 
     */
    public int lumines;
    public int calor;
    public int durabilidad;
    
    public boolean estado=true;
    
    public Bombillo(){
        this.lumines=0;
        this.durabilidad=100;
        this.calor=0;
    }
    
    public void encender(){
        this.lumines=20;
        this.calor=30;
    }
    
    public void apagar(){
         this.lumines=0;
        this.calor=0;
    }
    
    
    
}
