import javax.swing.*;

public class Exercise2 {
    public static void main(String args[]) {
        String name, kmAsString;
        float km;

        name = JOptionPane.showInputDialog("Please enter your first name, intial and last name?");
        kmAsString = JOptionPane.showInputDialog("Please enter the distance that you have cycled?");

        km = Float.parseFloat(kmAsString);

        JOptionPane.showMessageDialog(null, " this is the price " +price(km));
    }
        private static float price ( float km)
        {
            float rate = 0;
            final float RATE_1 = .07f;
            final float RATE_2 = .10f;

            if (km <= 10) {
                rate = km * RATE_1;

            }
            else if (km > 10) {
                rate = (km * RATE_2) - 1 +.70f;

            }

            return rate;

        }
}
