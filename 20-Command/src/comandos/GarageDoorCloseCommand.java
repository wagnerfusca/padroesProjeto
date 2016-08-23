package comandos;

import objetos.GarageDoor;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public class GarageDoorCloseCommand implements Command{

    GarageDoor garage;
    
    public GarageDoorCloseCommand(GarageDoor garage){
        this.garage=garage;
    }
    
    @Override
    public void execute() {
        garage.close();
    }

    @Override
    public void undo() {
        garage.open();
    }
    
}
