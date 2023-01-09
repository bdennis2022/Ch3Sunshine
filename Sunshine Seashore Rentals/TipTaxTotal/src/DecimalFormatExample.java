/*
    This program shows how to format numbers using the DecimalFormat class.
    Refer to Appendix C. We are also using the printf() method from Appendix C.

    Brandon Dennis
    12/7/22
 */


import java.net.SocketOption;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Scanner;

public class DecimalFormatExample {
    //Global Definitions
    static String iData, oTest1, oTest2, oTest3, oAvg;
    static String iName;
    static int iTest1, iTest2, iTest3;
    static double cAvg;

    //Define the object for keyboard input
    static Scanner scanner;

    //Define the object for the decimal format class
    static DecimalFormat testDisplay, avgDisplay;

    public static void main(String[] args) {
        init();
        input();
        calcs();
        output();
    }

    private static void init() {
        scanner = new Scanner(System.in);
        testDisplay = new DecimalFormat("##0");
        avgDisplay = new DecimalFormat("##0.0");
    }

    private static void input() {
        System.out.println("Please enter your name. ");
        iName = scanner.nextLine();
        System.out.println("Please enter test score 1 " );
        iData = scanner.nextLine();
        iTest1 = Integer.parseInt(iData);
        System.out.println("Please enter test score 2 " );
        iData = scanner.nextLine();
        iTest2 = Integer.parseInt(iData);
        System.out.println("Please enter test score 3 " );
        iData = scanner.nextLine();
        iTest3 = Integer.parseInt(iData);
    }

    private static void calcs() {
        cAvg = (iTest1 + iTest2 + iTest3) / 3.0;
        cAvg = Math.round(cAvg * 10) / 10.0;
        System.out.println(cAvg);
    }

    private static void output() {
        oTest1 = testDisplay.format(iTest1);
        oTest2 = testDisplay.format(iTest2);
        oTest3 = testDisplay.format(iTest3);
        oAvg = avgDisplay.format(cAvg);

        //Student               Test Score 1    Test Score 2    Test Score 3    Average
        System.out.printf("%-25s%5s%-12s%5s%-12s%5s%-12s%5s%-7s\n", "Student", "", "Test Score 1", "",
                "Test Score 2", "", "Test Score 3", "", "Average");

        System.out.printf("%-25s%5s%-12s%5s%-12s%5s%-12s%5s%-7s\n",
                iName, "", oTest1, "", oTest2, "", oTest3, "", oAvg);

        /*
        System.out.println("Student: " + iName);
        System.out.println("Score 1: " + oTest1);
        System.out.println("Score 2: " + oTest2);
        System.out.println("Score 3: " + oTest3);
        System.out.println("Average: " + oAvg);
        */

    }
}
