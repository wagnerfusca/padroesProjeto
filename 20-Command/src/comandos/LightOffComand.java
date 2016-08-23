package comandos;

import objetos.Light;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public class LightOffComand implements Command{

    Light light;
    
    public LightOffComand(Light light){
        this.light=light;
    }
    
    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void undo() {
        light.on();
    }
    
}
