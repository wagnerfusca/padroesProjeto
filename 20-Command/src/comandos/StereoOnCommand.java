package comandos;

import objetos.Stereo;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public class StereoOnCommand implements Command{

    Stereo stereo;

    public StereoOnCommand(Stereo stero) {
        this.stereo = stero;
    }
    
    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }

    @Override
    public void undo() {
        stereo.off();
    }
    
}
