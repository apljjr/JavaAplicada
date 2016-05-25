
package gui;

import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
/**
 *
 * @author Adeilson Jr
 */
public class JanelaSobre extends JFrame{
    
    private Container conteiner;
    private JanelaBaskaraSwing janelaPrincipal;
    
    public JanelaSobre(JanelaBaskaraSwing janelaPrincipal){
        
        super("Sobre..");
        
        
        
        conteiner = this.getContentPane();
        
        conteiner.setLayout(new GridLayout(5,1));
        conteiner.add(new JLabel("A:" + janelaPrincipal.getTfA().getText()));
        conteiner.add(new JLabel("B:" + janelaPrincipal.getTfB().getText()));
        conteiner.add(new JLabel("C:" + janelaPrincipal.getTfC().getText()));
        conteiner.add(new JLabel("Resultado X':" + janelaPrincipal.getLbResultX1().getText()));
        conteiner.add(new JLabel("Resultado X'':" + janelaPrincipal.getLbResultX2().getText()));
        
        
        //conteiner.add(new JLabel("Desenvolvedor: Adeilson Jr"));
        //conteiner.add(new JLabel("Email: aplj@gmail.com"));
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        this.setVisible(true);
        
    }
}
