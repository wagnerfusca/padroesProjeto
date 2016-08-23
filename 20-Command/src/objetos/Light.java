package objetos;

import telas.Status;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public class Light {
    
     Status s = Status.getInstance();
    
    public void on(){
        s.addMensagem("Luz acesa");
    }
    
    public void off(){
        s.addMensagem("Luz apagada");
    }
    
}
