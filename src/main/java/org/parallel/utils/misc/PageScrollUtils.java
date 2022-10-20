package org.parallel.utils.misc;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.event.KeyEvent;

import static org.parallel.stepsdefinition.BaseClass.getWebDriver;

public class PageScrollUtils {

    private static JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getWebDriver();

    public static void scrollVertically(int yAxis) {
        javascriptExecutor.executeScript("window.scrollBy(0," + yAxis + ")");
    }

    public static void scrollHorizontally(int xAxis) {
        javascriptExecutor.executeScript("window.scrollBy(" + xAxis + ",0)");
    }

    public static void scrollUp(int scrollCount) {
        Robot robot;
        try {
            while (scrollCount > 0) {
                robot = new Robot();
                robot.keyPress(KeyEvent.VK_PAGE_UP);
                robot.keyRelease(KeyEvent.VK_PAGE_UP);
                scrollCount--;
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void scrollDown(int scrollCount) {

        Robot robot;
        try {
            while (scrollCount > 0) {
                robot = new Robot();
                robot.keyPress(KeyEvent.VK_PAGE_DOWN);
                robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
                scrollCount--;
            }
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public static void scrollToTop() {
        javascriptExecutor.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
    }

    public static void scrollToBottom() {
        javascriptExecutor.executeScript("window.scrollBy(0,document.body.scrollHeight)");
    }

    public static WebElement scrollToElement(WebDriver webDriver, WebElement webElement) {
        JavascriptExecutor jse = (JavascriptExecutor) getWebDriver();
        jse.executeScript("arguments[0].scrollIntoView();", webElement);
        return webElement;
    }

    public static void javaScriptClick(WebElement element) {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) getWebDriver();
        WaitUtils.waitForElementToBeClickable(getWebDriver(),element);
        javascriptExecutor.executeScript("arguments[0].click()", element);
    }

    public static WebElement scrollElementIntoMiddle(WebDriver webDriver, WebElement webElement) {
        String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                + "var elementTop = arguments[0].getBoundingClientRect().top;"
                + "window.scrollBy(0, elementTop-(viewPortHeight/2));";
        ((JavascriptExecutor) getWebDriver()).executeScript(scrollElementIntoMiddle, webElement);
        return webElement;
    }
}