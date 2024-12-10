import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Currency {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        Locale usLocale = Locale.US;
        String us = NumberFormat.getCurrencyInstance(usLocale).format(payment);

        // India Locale (Custom Locale for India)
        Locale indiaLocale = new Locale("en", "IN");
        String india = NumberFormat.getCurrencyInstance(indiaLocale).format(payment);

        // China Locale
        Locale chinaLocale = Locale.CHINA;
        String china = NumberFormat.getCurrencyInstance(chinaLocale).format(payment);

        // France Locale
        Locale franceLocale = Locale.FRANCE;
        String france = NumberFormat.getCurrencyInstance(franceLocale).format(payment);
        
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
