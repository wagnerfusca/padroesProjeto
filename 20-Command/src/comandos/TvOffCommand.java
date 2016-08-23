package comandos;

import objetos.TV;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public class TvOffCommand implements Command{

    TV tv;

    public TvOffCommand(TV tv) {
        this.tv = tv;
    }
    
    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
         tv.setCanal(5);
        tv.setVolume(9);
    }
    
}
