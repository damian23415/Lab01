package lab01;

import java.util.Random;
import java.util.Scanner;
public class Main {
    /**
     * This is the java dock
     * its my first project in java
     * <p> It works properly
     * @param args testing java dock
     */


    public static void main(String[] args) {
        // One line comment
        /*
            Many lines comment
            Second line
         */
//        System.out.print("Testing print");
//        System.out.print("Testing print");
//        System.out.print("Testing print");
//
//        System.out.println(("Its my first java program"));
//        System.out.println(("Its my first java program"));
//        System.out.println(("Its my first java program"));
//
//        System.out.print("Testing print with n\n");
//        System.out.print("Testing print with n\n");
//        System.out.print("Testing print with n\n");
//
//        int a = 3;
//        double b = 4.21;
//        String s = "example text";
//
//        System.out.printf("a = %d, b = %f, s = %s %n", a, b, s);
//        System.out.printf("a = %d, b = %.2f, s = %20s %n", a, b, s);
//
//        System.out.println("Nazwaliśmy to \"witaminą B3\"");
//
//        System.out.printf("alfa\tsin(alfa)\n");
//        for(int i = 0; i < 370; i += 10)
//            System.out.printf("%d\t%f\t\n", i, Math.sin(i / 360.0 * 2 * Math.PI));
//
//        System.out.printf("arg\tlog2(arg)\tsum(arg)");
//        int sum = 0;
//        for(int i = 0; i < 100; i += 1) {
//            sum = sum + i;
//            System.out.printf("%d\t%f\t%d\n", i, Math.log(i) / Math.log(2), sum);
//
//        }

//        Scanner input = new Scanner(System.in);
//        int num1 = 0, num2 = 0;
//        do {
//            System.out.print("Podaj pierwsza liczbe: ");
//            num1 = input.nextInt();
//            if(num1 != 0)
//            {
//                System.out.print("Podaj drugą liczbę: ");
//                num2 = input.nextInt();
//            }
//            int sum = num1 + num2;
//            System.out.println("Wynik dodawania: " + sum);
//        } while((num1 != 0) && (num2 != 0));

        int[] liczby = new int[30];
        Random rnd = new Random();

        for(int i = 0; i < 30; i++)
            liczby[i] = rnd.nextInt();

        int mx = Integer.MIN_VALUE;
        int mn = Integer.MAX_VALUE;
        long avg = 0;

        for(int l : liczby)
        {
            System.out.println(l);
            if(l < mn) mn = l;
            if(l > mx) mx = l;
            avg += 1;
        }
        System.out.printf("MIN = %d, MAX = %d, AVG = %f", mn, mx, (float)avg/liczby.length);


    }

    public static String leftPad(String aText, char aChar, int aWidth)
    {
        String res = aText;
        for (int i = 0; i < aWidth - aText.length(); i++)
            res = aChar + res;
        return res;
    }

}
