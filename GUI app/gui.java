
import javax.swing.JOptionPane;

public class gui {
  public static void main(String[] args) {
    String name = JOptionPane.showInputDialog("Enter your name");

    JOptionPane.showMessageDialog(null, "Hello " + name);
    
    int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
    JOptionPane.showMessageDialog(null, "you are " + age + "years Old");
    
    double height =  Double.parseDouble(JOptionPane.showInputDialog("Enter your Height"));
    JOptionPane.showMessageDialog(null, "your height is " + height + " cm tall");
    
  }
}


// JOPTIONPAIN GUI  - graphical user interphase