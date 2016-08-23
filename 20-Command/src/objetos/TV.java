package objetos;

import telas.Status;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public class TV {
    
     Status s = Status.getInstance();
    
    public void on(){
        s.addMensagem("TV ligada");
    }
    
    public void off(){
        s.addMensagem("TV desligada");
    }
    
    public void setVolume(int vol){
        s.addMensagem("Volume alterado: "+vol);
    }
    
     public void setCanal(int canal){
        s.addMensagem("Canal sintonizado: "+canal);
    }
}
