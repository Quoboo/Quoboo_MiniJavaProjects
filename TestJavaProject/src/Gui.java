import javax.swing.*;

public class Gui {
    public static void main(String [] args) {

        String Name = JOptionPane.showInputDialog("Enter your Name!");
        JOptionPane.showMessageDialog(null, "Hello " + Name + "!");

        int Age = Integer.parseInt(JOptionPane.showInputDialog("How old are you?"));
        JOptionPane.showMessageDialog(null, Age + " is a nice Age!");

        double Height = Double.parseDouble(JOptionPane.showInputDialog("How tall are you?"));
        JOptionPane.showMessageDialog(null, Height +" is very tall!");
    }

}
