package org.example.tests;


import junit.framework.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ApplicationTests {

    @BeforeAll
    public static void beforeAllTheMethodRun(){

        System.out.println("Before Start clean");

    }

    @DisplayName("Pagani Test")
    @Test
    public void tester(){
        Assert.assertEquals("Hello","Hello");
    }

}
