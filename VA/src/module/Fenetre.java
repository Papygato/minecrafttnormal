package module;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Fenetre extends JFrame{
  private JPanel pan = new JPanel();
  private JButton bouton = new JButton("Mon bouton");

  public Fenetre(){
    this.setTitle("Viewers Adventure v0.01");
    this.setSize(1920, 1080);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setLocationRelativeTo(null);
    
    //Ajout du bouton à notre content pane
    pan.add(bouton);
    this.setContentPane(pan);
    this.setVisible(true);
  }       
}