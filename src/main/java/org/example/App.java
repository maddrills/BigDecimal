package org.example;

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


        BigDecimal bigDecimal = new BigDecimal();

        System.out.printf("Payout = %,.2f%n", bigDecimal.percentageFloatReturnAmount(policyAmount,percentageFloat));

        System.out.printf("Payout = %,.2f%n",bigDecimal.percentageFloatReturnAmount(policyAmount,percentage));

        double totalUsingFloat = policyAmount -
                ((policyAmount * percentageFloat) * beneficiaries);

        System.out.println(totalUsingFloat);
    }
}
