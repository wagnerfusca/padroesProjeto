package telas;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public class Status extends JFrame{
    
    private static Status instance;
    
    private JTextArea ja;
    private JScrollPane scroll;
    
    private Status() {
    
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        
        new JFrame();     
        setTitle("Status - Controle Remoto");
        setVisible(true);
        
        setBounds(350,250,350, 350);
        setResizable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation((dim.width/2),(dim.height/2)-200);
        ja = new JTextArea();
        scroll = new JScrollPane(ja);   
        
        ja.setEditable(false);
        
        add(scroll);
        
    }
    
    public void addMensagem(String texto){
         
        ja.append("\n"+texto);
        ja.setCaretPosition( ja.getText().length() ); 
    }
    
    public static Status getInstance(){
        
        if (instance==null)
            instance=new Status();
        
        return instance;
    }
    
    
    
    
}
