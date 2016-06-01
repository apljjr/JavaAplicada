
package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
/**
 *
 * @author Adeilson Jr
 */
public class JanelaSobre extends JDialog{
    
    private Container conteiner;
    private JanelaBaskaraSwing janelaPrincipal;
    private JButton btEnviar;
    private JProgressBar pbStatus;
    
    public JanelaSobre(JanelaBaskaraSwing janelaPrincipal){
        
        super( janelaPrincipal, true );
        
        
        
        conteiner = this.getContentPane();
        
        btEnviar = new JButton("Enviar");
        pbStatus = new JProgressBar(JProgressBar.HORIZONTAL, 0, 100);
        
        conteiner.setLayout(new GridLayout(7,1));
        conteiner.add(new JLabel("A:" + janelaPrincipal.getTfA().getText()));
        conteiner.add(new JLabel("B:" + janelaPrincipal.getTfB().getText()));
        conteiner.add(new JLabel("C:" + janelaPrincipal.getTfC().getText()));
        conteiner.add(new JLabel("Resultado X':" + janelaPrincipal.getLbResultX1().getText()));
        conteiner.add(new JLabel("Resultado X'':" + janelaPrincipal.getLbResultX2().getText()));
        
        conteiner.add(btEnviar);
        conteiner.add(pbStatus);
        
        btEnviar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                btEnviarAction();
            }
        });
        
        //conteiner.add(new JLabel("Desenvolvedor: Adeilson Jr"));
        //conteiner.add(new JLabel("Email: aplj@gmail.com"));
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        this.pack();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        //this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        
        this.setVisible(true);
        
    }
    
    private void btEnviarAction(){
        ProcessarThread pt = new ProcessarThread();
        pt.start();
    }
    
    class ProcessarThread extends Thread{
        public void run(){
            for(int i = 1; i <= 100; i++){
            pbStatus.setValue(i);
            try{
                Thread.sleep(100);
            }catch(Exception e){
                System.out.println("Erro");
            }
            
        }
        }
    }
}
