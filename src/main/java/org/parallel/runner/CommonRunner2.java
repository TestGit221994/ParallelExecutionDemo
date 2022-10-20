package org.parallel.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.parallel.stepsdefinition.BaseClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

@CucumberOptions(features = {"src/test/resources/features/"}, glue = {
        "org/parallel/stepsdefinition"}, monochrome = true,tags = "@Smoke",dryRun = false, plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReports.json", "rerun:target/cucumber-reports/rerun.txt"
})

public class CommonRunner2 extends AbstractTestNGCucumberTests {


    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        System.out.println(" Thread Count ========================================<<<<<<< " + System.getProperty("dataproviderthreadcount"));
        System.out.println(" Tage name " +System.getProperty("dynamic.runner.tag"));
        return super.scenarios();
    }
    @Parameters({ "browser" })
    @BeforeMethod
    public static void setUpScenario(String browser) {
        System.out.println("From Runner : Browser Name :  " +browser + " Thread ID : " +Thread.currentThread().getId()+" Thread Name : " +Thread.currentThread().getName());
        BaseClass.setBrowserName(browser);
    }

}
