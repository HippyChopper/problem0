import javax.swing.*;

public class Exercise4 {

    public static void main (String args [])
    {
        int totalNum  = 0;
        int count = 0;
        int num;
        String numAsString = "";

           while (!numAsString.equalsIgnoreCase("q")) {



               numAsString = JOptionPane.showInputDialog("please enter a Number!! q to quit");

               if(!(numAsString.equals("q"))) {

                   count++;
                   num = Integer.parseInt(numAsString);


                   totalNum += num;

               }
               else
               // numAsString = JOptionPane.showInputDialog("please enter a Number!! q to quit");

               JOptionPane.showConfirmDialog(null, "count" + count + "num" + totalNum, "show", JOptionPane.INFORMATION_MESSAGE);
           }

            System.exit(0);

    }




}
