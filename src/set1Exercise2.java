import javax.swing.*;

public class set1Exercise2 {

    public static void main(String args) {

        JTextArea textArea = new JTextArea("Yards"+ "\t"+ "Inches");

        for (int x = 1; x <= 10; x++) {
            int y = 0;
            y = x * 36;



        }//for

        JOptionPane.showMessageDialog(null, textArea);

    } //main
}