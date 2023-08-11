package org.example.tests;

import org.example.BigDecimalMyOwn;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertionTest {
    final double policyAmount = 100_000_000;
    final int beneficiaries = 3;
    float percentageFloat = 1.0f / beneficiaries;
    double percentage = 1.0 / beneficiaries;

    static BigDecimalMyOwn bigDecimalMyOwn;
    @BeforeAll
    static void createAnInstanceForAll(){

        bigDecimalMyOwn = new BigDecimalMyOwn();

    }

    @Test
    @DisplayName("Must Be Equal")
    void App_percentageAmount_ReturnTheSameAmount() {

        Assertions.assertEquals(
                bigDecimalMyOwn.percentageFloatReturnAmount(policyAmount,percentageFloat),
                bigDecimalMyOwn.percentageFloatReturnAmount(policyAmount,percentage)
                );
    }

    @Test
    @DisplayName("Must not be Equal")
    void App_percentageAmount_NotReturnTheSameAmount(){
        Assertions.assertNotEquals(
                bigDecimalMyOwn.percentageFloatReturnAmount(policyAmount,percentageFloat),
                bigDecimalMyOwn.percentageFloatReturnAmount(policyAmount,percentage)
        );
    }
}