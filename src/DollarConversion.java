/**
 * @author Patrick H.
 * @since 2017-9-27
 * @version 1.0
 */

import javax.swing.*;

public class DollarConversion {
    public static void main(String[] args) {
        final int quarter = 4;
        final int dime = 10;
        final int nickel = 20;
        final int penny = 100;

        String oridol = JOptionPane.showInputDialog("Please a 1, 5, or 10 dollar bill.");
        int intdol = Integer.parseInt(oridol);
        int qtrs = (intdol * quarter);
        int dims = (intdol * dime);
        int nics = (intdol * nickel);
        int pens = (intdol * penny);
        JOptionPane.showMessageDialog(null, "$" + oridol + " is: \n" + qtrs + " quarters\n" + dims + " dimes\n" + nics + " nickels\nand " + pens + " pennies\n");
    }
}