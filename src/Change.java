/**
 * @author Patrick H.
 * @since 2017-9-27
 * @version 1.0
 */

import javax.swing.*;

public class Change {
    public static void main(String[] args){
        final int quarter = 25;
        final int dime = 10;
        final int nickel = 5;
        final int penny = 1;

        String oridol = JOptionPane.showInputDialog("Please enter a dollar amount.");
        double dbldol = Double.parseDouble(oridol);
        int intdol = (int) (dbldol * 100);
        int qtrchg = (intdol / quarter);
        int qtrrem = (intdol % quarter);
        int dimchg = (qtrrem / dime);
        int dimrem = (qtrrem % dime);
        int nicchg = (dimrem / nickel);
        int nicrem = (dimrem % nickel);
        int penchg = (nicrem / penny);
        JOptionPane.showMessageDialog(null,"your change from $" + oridol + " is: \n" + qtrchg + " quarters\n" + dimchg + " dimes\n" + nicchg + " nickels\nand " + penchg + " pennies\n");
    }
}
