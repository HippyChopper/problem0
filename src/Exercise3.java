import javax.swing.*;

public class Exercise3 {

    public static void main (String args []){

        String name, incomeAsString;
        float income;

        name = JOptionPane.showInputDialog("Can I have your Name?");
        incomeAsString = JOptionPane.showInputDialog("Can I have your income please");

        income = Float.parseFloat(incomeAsString);

        JOptionPane.showMessageDialog(null, taxRate(income));

    }

    private static float taxRate(float i)
    {
        final float TAX_RATE0 = 0f ,TAX_RATE1 = 20f, TAX_RATE2 = 40f;
        final float INCOME_BREAK1 = 20000f, INCOME_BREAK2 = 36000f;

      if(i <= INCOME_BREAK1 )
      {
          return TAX_RATE0;
      }
      else if (i<= INCOME_BREAK2)
      {
          return TAX_RATE1;
      }
      else
          return TAX_RATE2;


    }




}
