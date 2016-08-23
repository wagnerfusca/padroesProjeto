package telas;

import comandos.Command;
import comandos.TvOnCommand;
import comandos.TvOffCommand;
import comandos.LightOffComand;
import comandos.GarageDoorCloseCommand;
import comandos.StereoOnCommand;
import comandos.GarageDoorOpenCommand;
import comandos.LightOnComand;
import comandos.StereoOffCommand;
import comandos.MacroCommand;
import comandos.NoCommand;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import objetos.GarageDoor;
import objetos.Light;
import objetos.Stereo;
import objetos.TV;
import dominio.RemoteControl;

/**
 * @author Paulo Collares
 * www.paulocollares.com.br
 */
public class ControleRemoto extends JFrame {

    private JButton[] botoesOn;
    private JButton[] botoesOff;
    private JButton undo;
    private JLabel[] nomes;
    private JLabel vazio;
    
    public ControleRemoto() {

        Status s = Status.getInstance();

        s.addMensagem("Iniciando Sistema\n");

        RemoteControl remote = new RemoteControl();

        Light light = new Light();
        GarageDoor garage = new GarageDoor();
        Stereo stereo = new Stereo();
        TV tv = new TV();

        LightOnComand lightOn = new LightOnComand(light);
        LightOffComand lightOff = new LightOffComand(light);

        GarageDoorOpenCommand garageDoorOpen = new GarageDoorOpenCommand(garage);
        GarageDoorCloseCommand garageDoorClose = new GarageDoorCloseCommand(garage);

        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);

        TvOnCommand tvOn = new TvOnCommand(tv);
        TvOffCommand tvOff = new TvOffCommand(tv);

        Command[] partyOn = {lightOff, garageDoorClose, stereoOn, tvOn};
        Command[] partyOff = {lightOn, garageDoorOpen, stereoOff, tvOff};
        
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);
        
        remote.setCommand(0, lightOn, lightOff, "Luz");
        remote.setCommand(1, garageDoorOpen, garageDoorClose, "Garagem");
        remote.setCommand(2, stereoOn, stereoOff, "Radio");
        remote.setCommand(3, tvOn, tvOff, "TV");
        remote.setCommand(4, partyOnMacro, partyOffMacro, "Modo Festa");

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();

        botoesOn = new JButton[7];
        botoesOff = new JButton[7];
        nomes = new JLabel[7];
        undo = new JButton();
        vazio = new JLabel();
        
        new JFrame();
        setTitle("Controle Remoto");
        setVisible(true);
        setLayout(new GridLayout(8, 3));
        setBounds(350, 250, 350, 350);
        setResizable(true);
        setLocation((dim.width / 2) - 400, (dim.height / 2) - 200);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);



        for (int i = 0; i < 7; i++) {

            botoesOn[i] = new JButton("ON");
            botoesOff[i] = new JButton("OFF");
            nomes[i] = new JLabel();

            add(nomes[i]);
            add(botoesOn[i]);
            add(botoesOff[i]);

            if (remote.getCommand(i) instanceof NoCommand) {
                nomes[i].setText("vazio");
                botoesOn[i].setEnabled(false);
                botoesOff[i].setEnabled(false);
            } else {
                nomes[i].setText(remote.getNome(i));
            }

            AcaoBotao ab = new AcaoBotao(i, remote);

            botoesOn[i].addActionListener(ab);
            botoesOff[i].addActionListener(ab);
        }
        
        add(vazio);
        add(undo);
        
        add(new JLabel("     by @pcollares"));
        
        undo.setText("Desfazer");
        
        AcaoBotao ab = new AcaoBotao(-1, remote);

        undo.addActionListener(ab);
        
    }

    private class AcaoBotao implements ActionListener {

        int slot;
        RemoteControl remote;

        public AcaoBotao(int slot, RemoteControl remote) {
            this.slot = slot;
            this.remote = remote;
        }

        @Override
        public void actionPerformed(ActionEvent e) {

            String tipo = e.getActionCommand();

            if (tipo.equals("ON")) {
                remote.onButtonWasPushed(slot);
            } else if (tipo.equals("OFF")){
                remote.offButtonWasPushed(slot);
            } else if (tipo.equals("Desfazer")){
                remote.undoButtonWasPushed();
            }

        }
    }
}
