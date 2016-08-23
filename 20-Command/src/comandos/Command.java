package comandos;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public interface Command {
    
    public void execute();
    public void undo();
}
