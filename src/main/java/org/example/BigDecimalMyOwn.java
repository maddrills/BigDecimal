package org.example;

public class BigDecimalMyOwn {

    public  <T extends Double, R extends Float> Double percentageFloatReturnAmount(final T policyAmount,final R percentageFloat){

        return policyAmount.doubleValue() * percentageFloat.floatValue();

    }
    public  <T extends  Double, R extends Double> Double percentageFloatReturnAmount(final T policyAmount,final R percentage){

        return policyAmount.doubleValue() * percentage.doubleValue();

    }
}
