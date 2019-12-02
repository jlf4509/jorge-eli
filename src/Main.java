import javax.swing.JFrame;

/**
 * The Main class of the program
 * 
 * @author Eli Hopkins & Jorge Figueroa
 * @version 0.1
 */
public class Main extends JFrame {
   private static JFrame mainFrame;
   
   public Main() {
      setSize(400, 400);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setTitle("Accounting Program");
      setVisible(true);
   }
   
   public static void main(String[] args) {
      mainFrame = new Main();
   }
}
