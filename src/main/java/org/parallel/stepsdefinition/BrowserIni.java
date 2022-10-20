package org.parallel.stepsdefinition;

import io.cucumber.java.en.Given;

import static org.parallel.stepsdefinition.BaseClass.navigateToLoginPage;

public class BrowserIni {

    @Given("initialise browser")
    public void initialiseBrowser() {
          navigateToLoginPage();
    }
}
