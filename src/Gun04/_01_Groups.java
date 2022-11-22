package Gun04;

import org.testng.annotations.Test;

public class _01_Groups {

    @Test(groups = "SmokeTest")
    void abc(){ System.out.println("Test 1 SmokeTest"); }

    @Test(groups = "Regression")   // @Test(groups = {"Regression","SmokeTest"})
    void Test3(){ System.out.println("Test 3 Regression"); }

    @Test(groups = "Regression")
    void Test5(){ System.out.println("Test 5 Regression"); }

    @Test(groups = "Regression")
    void Test2(){ System.out.println("Test 2 Regression"); }

    @Test(groups = "SmokeTest")
    void bcd(){ System.out.println("Test 4 SmokeTest"); }

    @Test(groups = "SmokeTest", dependsOnMethods = "bcd")
    void cde(){ System.out.println("Test 6 SmokeTest"); }

    @Test
    void Test7(){ System.out.println("Test 7"); }

}
