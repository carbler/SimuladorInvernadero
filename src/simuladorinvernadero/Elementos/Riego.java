
package simuladorinvernadero.Elementos;

/**
 *
 * @author melissa
 */
public class Riego {
    
    public int caudal;
    public boolean estado;
    
    public Riego(){
        this.caudal=0;
    }
    
    public void Encender(){
        this.caudal=10;
    }
    
    public void Apagar(){
        this.caudal=0;
    }
}
