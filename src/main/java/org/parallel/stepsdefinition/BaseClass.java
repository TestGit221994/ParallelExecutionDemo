package org.parallel.stepsdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Allure;
import io.qameta.allure.Attachment;
import io.qameta.allure.Description;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.parallel.utils.misc.BrowserFactory;
import org.parallel.utils.misc.ClearCacheUtils;
import org.parallel.utils.misc.PropertyUtils;
import org.slf4j.Logger;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

import static org.parallel.utils.misc.PropertyUtils.getProperty;
import static org.slf4j.LoggerFactory.getLogger;

public class BaseClass {
    private static final Logger logger = getLogger(BaseClass.class);
    static private ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
    public static ThreadLocal<String> browserName=new ThreadLocal<>();


    public synchronized static void setBrowserName(String bName){
        browserName.set(bName);

    }

    public synchronized static String getBName(){
        return browserName.get();
    }

    public static WebDriver getWebDriver() {
        return driver.get();
    }


    public synchronized static void initializeBrowser() {

       // System.out.println(" ThreadName ============================================================" + Thread.currentThread().getName() + " ThreadID " +Thread.currentThread().getId());
       /*
        if(BrowserFactory.getInstance().getBrList()==null){
                try {
                    browserName = BrowserFactory.getInstance().setBr(Thread.currentThread().getName().trim(), BrowserFactory.getInstance().getBrowserName());
                }catch (IndexOutOfBoundsException aw){
                    browserName = BrowserFactory.getInstance().getBr(Thread.currentThread().getName().trim());
                }

        }else {
            if(BrowserFactory.getInstance().getBrList().containsKey(Thread.currentThread().getName().trim())){

                browserName = BrowserFactory.getInstance().getBr(Thread.currentThread().getName().trim());
            }else {
                try {
                    browserName = BrowserFactory.getInstance().setBr(Thread.currentThread().getName().trim(), BrowserFactory.getInstance().getBrowserName());
                }catch (IndexOutOfBoundsException aw){
                    browserName = BrowserFactory.getInstance().getBr(Thread.currentThread().getName().trim());
                }
            }
        }

        */






        System.out.println(" From Ini : Browser Name : " +browserName.get()+ " INS " +browserName+" ThreadName "+Thread.currentThread().getName()+" ID " +Thread.currentThread().getId() );
        //getBName()

        switch ("chrome") {
            case "edge":
                EdgeOptions eo = new EdgeOptions();
                //eo.setHeadless(Boolean.parseBoolean(getProperty("headless.mode")));
                String path=System.getProperty("user.dir") + File.separator + "src/test/resources/drivers/msedgedriver.exe";
                System.setProperty("webdriver.edge.driver", path.trim());
                driver.set(new EdgeDriver());
                driver.get().manage().window().maximize();
                //ClearCacheUtils.clearBrowserCache(getWebDriver());
                break;
            case "opera":
                System.out.println("I am in Opera");
                //driver = WebDriverManager.operadriver().create();
                //driver.manage().window().maximize();
                break;
            case "firefox":
                FirefoxOptions fo = new FirefoxOptions();
                //fo.setHeadless(Boolean.parseBoolean(getProperty("headless.mode")));
                driver.set(WebDriverManager.firefoxdriver().capabilities(fo).create());
                driver.get().manage().window().maximize();

                //driver = WebDriverManager.firefoxdriver().capabilities(fo).create();
                //driver.manage().window().maximize();
                break;
            case "safari":
                //driver = WebDriverManager.safaridriver().create();
                //driver.manage().window().maximize();
                break;
            default:
                System.out.println("I am in chrome");
                ChromeOptions co = new ChromeOptions();
//              co.setHeadless(Boolean.parseBoolean(getProperty("headless.mode")));
                driver.set(WebDriverManager.chromedriver().capabilities(co).create());
                driver.get().manage().window().maximize();

        }
    }



    public static String getScenarioName(Scenario scenario) {
        return scenario.getName().replaceAll(" ", "_");
    }

    @Attachment(value = "Failed Test ScreenShot", type = "image/png")
    public void saveScreenShot(WebDriver driver, Scenario scenario) {
        TakesScreenshot screenshot = (TakesScreenshot) driver;
        String fileName = getScenarioName(scenario);
        File scr = screenshot.getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(scr, new File(PropertyUtils.getProperty("default.screenshot.location") + "/" + fileName + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Parameters({"browser"})
    public static void navigateToLoginPage() {

        initializeBrowser();
        logger.info("navigating to pbl webapp " + getProperty("pbl.user.url"));
        driver.get().get(getProperty("pbl.user.url"));
        //driver.get().get("http://automationpractice.com/index.php");
    }


    @After(order = 1)
    public void tearDown(Scenario scenario) {
        System.out.println(" From tearDown : Browser Name : " +browserName.get()+ " INS " +browserName+" ThreadName "+Thread.currentThread().getName()+" ID " +Thread.currentThread().getId() +" Scenario Name " +scenario.getName());



        if (scenario.isFailed()) {
            saveScreenShot(getWebDriver(), scenario);
            try {
                FileInputStream inputStream = new FileInputStream(PropertyUtils.getProperty("default.screenshot.location") + "/" + getScenarioName(scenario) + ".png");
                Allure.addAttachment("Failed Test Screenshot", inputStream);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            Allure.addAttachment("Failed Scenario Name", getScenarioName(scenario));
        }

    }

    @After(order = 0)
    public void quitDriver() {
        //BrowserFactory.getInstance().addBrowserName(browserName);
        driver.get().quit();
    }
}