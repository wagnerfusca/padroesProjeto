package comandos;

import objetos.TV;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public class TvOnCommand implements Command{

    TV tv;

    public TvOnCommand(TV tv) {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.on();
        tv.setCanal(5);
        tv.setVolume(9);
    }

    @Override
    public void undo() {
       tv.off();
    }
    
}
