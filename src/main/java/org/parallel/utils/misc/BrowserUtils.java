package org.parallel.utils.misc;

import org.openqa.selenium.JavascriptExecutor;

import java.util.ArrayList;

import static org.parallel.stepsdefinition.BaseClass.getWebDriver;

public class BrowserUtils {

    public static void openNewTab() {
        ((JavascriptExecutor) getWebDriver()).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(getWebDriver().getWindowHandles());
        getWebDriver().switchTo().window(tabs.get(1));
    }

    public static void navigateBack() {
        getWebDriver().navigate().back();
    }

    public static void navigateForward() {
        getWebDriver().navigate().forward();
    }

    public static void refreshPage() {
        getWebDriver().navigate().refresh();
    }
}