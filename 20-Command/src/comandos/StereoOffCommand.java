package comandos;

import objetos.Stereo;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public class StereoOffCommand implements Command{

    Stereo stereo;

    public StereoOffCommand(Stereo stero) {
        this.stereo = stero;
    }
    
    @Override
    public void execute() {
        stereo.off();
    }

    @Override
    public void undo() {
       stereo.on();
        stereo.setCD();
        stereo.setVolume(11);
    }
    
}
