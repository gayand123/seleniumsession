package com.orange.ddtexample;

import org.testng.annotations.DataProvider;

public class DDTExample {
    //data source
    @DataProvider(name = "usercredentials")
    private static Object[][] userCredentials() {
        return new Object[][]{
                {"Administrator", "admin123"},
                {"Admin", "admin123"},
                {"Ad", "ad"},
                {"asfasf","aSFasf"}
        };
    }
}
