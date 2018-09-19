import javax.swing.*;

public class Exercise5 {
    public static void main (String args []){
        float num1 = 0, num2 = 0;
        String letter, num1AsString,num2AsString ;

        letter = JOptionPane.showInputDialog("Please enter a letter");
        num1AsString = JOptionPane.showInputDialog("Please enter a Number");
        num1 = Float.parseFloat(num1AsString);
        num2AsString = JOptionPane.showInputDialog("Please enter another Number");
        num1 = Float.parseFloat(num2AsString);



    }
}
