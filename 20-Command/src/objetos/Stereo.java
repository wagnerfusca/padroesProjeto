package objetos;

import telas.Status;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public class Stereo {
    
     Status s = Status.getInstance();
    
    public void on(){
        s.addMensagem("Radio ligado");
    }
    
    public void setCD(){
        s.addMensagem("CD selecionado");
    }
    
    public void setVolume(int vol){
        s.addMensagem("Volume alterado: "+vol);
    }
 
    public void off(){
        s.addMensagem("Radio desligado");
    }
    
}
