package com.tests.base;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.*;

public class WebTestSetup extends TestSetUp {

    @BeforeEach
    void setUp() {
        Configuration.headless = false;
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterEach
    void quit() {
        closeWindow();
        closeWebDriver();
    }
}
