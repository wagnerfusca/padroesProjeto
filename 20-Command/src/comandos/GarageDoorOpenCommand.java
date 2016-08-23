package comandos;

import objetos.GarageDoor;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public class GarageDoorOpenCommand implements Command{

    GarageDoor garage;
    
    public GarageDoorOpenCommand(GarageDoor garage){
        this.garage=garage;
    }
    
    @Override
    public void execute() {
        garage.open();
    }

    @Override
    public void undo() {
        garage.open();
    }
    
}
