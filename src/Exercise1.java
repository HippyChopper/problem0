import javax.swing.*;

public class Exercise1 {
    public static void main (String args[]){

        String snacksAsString, name, yourClass;

        int snacks, price;

        name = JOptionPane.showInputDialog("What is your name?");
        yourClass = JOptionPane.showInputDialog("What class are you in?");
        snacksAsString = JOptionPane.showInputDialog("How many snacks do you want?");

        snacks = Integer.parseInt(snacksAsString);

        price = snacks*2;

        JOptionPane.showMessageDialog(null,"Your Name is "+ name +"\n your class is" + yourClass + "\nyou have "+snacks + "\n that cost "+ price,"Info",JOptionPane.INFORMATION_MESSAGE);



}
}
