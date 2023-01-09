import java.text.DecimalFormat;
import java.util.Scanner;
/*
    This project is a program that prompts the user for
        the number of minutes a piece of sports equipment was rented.

        Brandon Dennis
        12/14/22
 */

public class Ch3Sunshine {



    public static void main(String[] args) {
        int iTimes = inputTimes();
        CalcResults cResults = new CalcResults();
        cResults.calculate(iTimes);
        new CompanyMotto().getMotto();
        output(cResults);
    }



    private static void output(CalcResults calcResults) {
        DecimalFormat priceFormat = new DecimalFormat("$#,###.00");
        String oPrice = priceFormat.format(calcResults.cPrice);
        DecimalFormat intFormat = new DecimalFormat("##0");
        String oHrs = intFormat.format(calcResults.cHrs);
        String oAdditionalMinutes = intFormat.format(calcResults.cAdditionalMinutes);




        System.out.printf("%-8s%5s%-18s%5s%-12s\n", "Hours", "", "Additional Minutes", "",
                "Price");

        System.out.printf("%-8s%5s%-18s%5s%-12s\n",
                oHrs, "", oAdditionalMinutes, "", oPrice);
    }

    private static int inputTimes() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Minutes");
        String iData = input.nextLine();
        try{
            return Integer.parseInt(iData);
        }
        catch(Exception e) {
            System.out.println("Error in Minutes");
            System.out.println("Minutes assigned a value of 0");
            return CalcResults.DEFAULT_RENTAL_MINUTES;
        }

    }
}
