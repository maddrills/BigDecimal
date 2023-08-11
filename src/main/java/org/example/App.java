package org.example;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        final double policyAmount = 100_000_000;
        final int beneficiaries = 3;
        float percentageFloat = 1.0f / beneficiaries;
        double percentage = 1.0 / beneficiaries;


        BigDecimalMyOwn bigDecimalMyOwn = new BigDecimalMyOwn();

        System.out.printf("Payout = %,.2f%n", bigDecimalMyOwn.percentageFloatReturnAmount(policyAmount,percentageFloat));

        System.out.printf("Payout = %,.2f%n", bigDecimalMyOwn.percentageFloatReturnAmount(policyAmount,percentage));

        double totalUsingFloat = policyAmount -
                ((policyAmount * percentageFloat) * beneficiaries);

        System.out.println("float yield "+totalUsingFloat);

        double total = policyAmount -
                ((policyAmount * percentage) * beneficiaries);

        System.out.println("total "+total);


        // reason for using strings in big decimal
        final String[] tests = {
                "5.456",
                "8",
                "10000.000001",
                ".123"
        };

        final BigDecimal[] bds = new BigDecimal[tests.length];
        Arrays.setAll(bds,i -> new BigDecimal(tests[i]));

        System.out.printf("%-14s %-15s %-8s %s%n",
                "Value",
                "Unscaled Value",
                "Scale",
                "Precision");

        for(var bd : bds){

            System.out.printf("%-15s %-15d %-8d %d %n",
                    bd,
                    bd.unscaledValue(),
                    bd.scale(),
                    bd.precision());

        }
    }
}
