import javax.swing.*;

public class Exercise3 {

    public static void main (String args []){

        String name, incomeAsString;
        float income;

        name = JOptionPane.showInputDialog("Can I have your Name?");
        incomeAsString = JOptionPane.showInputDialog("Can I have your income please");

        income = Float.parseFloat(incomeAsString);

        JOptionPane.showMessageDialog(null, "gross income\t "+ income +"\nTax rate\t " + taxRate(income)+ "\nTax due\t " + taxdue(income)
                + "\nIncome after tax \t " + afterTax(income) );

    }

    private static float taxRate(float i)
    {
        final float TAX_RATE0 = 0f ,TAX_RATE1 = 20f, TAX_RATE2 = 41f;
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

    private static float taxdue(float i)
    {
        final float INCOME_BREAK1 = 20000f, INCOME_BREAK2 = 36000f;
        final float TAX_RATE1 = 20f, TAX_RATE2 = 40f;

        if(i <= INCOME_BREAK1 )
        {

            return  i;
        }
        else if (i<= INCOME_BREAK2)
        {
            return (i/100) * TAX_RATE1;
        }
        else
            return (i/100) * TAX_RATE2;


    }
// afterTax
   private static float afterTax(float i)
    {
        final float INCOME_BREAK1 = 20000f, INCOME_BREAK2 = 36000f;
        final float TAX_RATE1 = 20f, TAX_RATE2 = 40f;

        if(i <= INCOME_BREAK1)
        {
            return i;
        }
        else if (i <= INCOME_BREAK2)
        {
            return ((i/100) * TAX_RATE1) + i;
        }
        else
            return((i/100) * TAX_RATE2) + i;


    }

}
