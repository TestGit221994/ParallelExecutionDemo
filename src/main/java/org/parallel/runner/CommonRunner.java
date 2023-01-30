package org.parallel.runner;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.parallel.stepsdefinition.BaseClass;
import org.testng.IAlterSuiteListener;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

import java.util.ArrayList;
import java.util.List;

import static org.parallel.utils.misc.PropertyUtils.getProperty;

@CucumberOptions(features = {"src/test/resources/features/"}, glue = {
        "org/parallel/stepsdefinition"}, monochrome = true,tags = "@Smokelt",dryRun = false, plugin = {"pretty","html:target/cucumber-reports/cucumber-pretty", "json:target/cucumber-reports/CucumberTestReports.json", "rerun:target/cucumber-reports/rerun.txt"
})

public class CommonRunner extends AbstractTestNGCucumberTests {

    /*

    @Override
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
    @Parameters({ "browser" })
    @BeforeMethod
    public static void setUpScenario(String browser) {
        BaseClass.setBrowserName(browser);
    }

     */

}
