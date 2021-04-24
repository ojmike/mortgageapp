import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT  = 100;

       Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: ");
        float annualInterestRate = scanner.nextFloat();
        float monthlyInterestRate = annualInterestRate / PERCENT / MONTHS_IN_YEAR;

        System.out.print("Period (Years) : ");
        int years = scanner.nextInt();
        int numberOfPayment = years * MONTHS_IN_YEAR;
        double mortgage = principal * (monthlyInterestRate * Math.pow(monthlyInterestRate + 1, numberOfPayment)) / (Math.pow(monthlyInterestRate + 1,numberOfPayment) - 1);


        System.out.println("Mortgage: " + NumberFormat.getCurrencyInstance().format(mortgage));




    }
}
