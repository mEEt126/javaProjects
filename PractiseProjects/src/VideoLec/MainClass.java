package VideoLec;
import java.awt.Graphics;
import javax.swing.JFrame;

public class MainClass extends JFrame {

  public static void main(String[] a){
    MainClass f = new MainClass();
    f.setSize(600,600);
    f.setVisible(true);
  }
  
  
  public void paint(Graphics g) {
    g.drawRect(100, 100, 60, 60);
    g.fillRect(0, 50, 60, 50);
    g.drawOval(200, 200, 50, 50);
    g.fillOval(300, 300, 75, 50);
  }
}