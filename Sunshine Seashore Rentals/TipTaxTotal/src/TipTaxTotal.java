import java.text.DecimalFormat;
import java.util.Scanner;
import java.text.DecimalFormatSymbols;
import java.net.SocketOption;
/**
 * Demo how to format using the DecimalFormat class
 * This is the tip, tax and total project.
 *
 * DecimalFormat - import java.text.*
 * Pattern String - Edit Mask
 * # - Zero suppressed
 * 0 - Forces digit to print
 *  , - thousands separator
 *  . - decimal point
 *  $ - Currency
 * Brandon Dennis
 * 12/6/22
 */



public class TipTaxTotal {
    //Global Definitions
    static double iCost, cTip, cTax, cTotal;
    static String iData, oTotal, oTax, oTip, oCost;
    static Scanner inputDevice;
    static DecimalFormat totalDisplay, dollarDisplay;


    public static void main(String[] args) {
        init();
        input();
        calcs();
        output();
    }

    private static void input() {
        System.out.println("Enter the food cost. ");
        iData = inputDevice.nextLine();
        iCost = Double.parseDouble(iData);
    }

    private static void init() {
        inputDevice = new Scanner(System.in);

        totalDisplay = new DecimalFormat("$#,###.00");  //$z,zzz.99
        dollarDisplay = new DecimalFormat("$#,###.00");  //$z,zzz.99
    }

    private static void calcs() {
        cTax = (iCost * .07) * 10 / 10.0;
        cTip = (iCost + cTax) * .15;
        cTotal = cTip + cTax + iCost;
    }

    private static void output() {
        oCost = dollarDisplay.format(iCost);
        oTip = dollarDisplay.format(cTip);
        oTax = dollarDisplay.format(cTax);
        oTotal = totalDisplay.format(cTotal);

        System.out.printf("%-25s%5s%-12s%5s%-12s%5s%-7s\n", "Cost", "", "Tip", "",
                "Tax", "", "Total");

        System.out.printf("%-25s%5s%-12s%5s%-12s%5s%-7s\n",
                oCost, "", oTip, "", oTax, "", oTotal);
    }
}
