package objetos;

import telas.Status;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public class GarageDoor {
    
    Status s = Status.getInstance();
        
    
    public void open(){
        s.addMensagem("Porta da garagem aberta");
    }
    
    public void close(){
        s.addMensagem("Porta da garagem fechada");
    }
    
}
