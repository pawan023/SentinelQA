package com.sentinelqa.core;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.sentinelqa.driver.BrowserFactory;
import com.sentinelqa.enums.BrowserType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class BaseTest {

    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    @BeforeEach
    void setUp() {
        playwright = Playwright.create();
        browser = BrowserFactory.createBrowser(playwright, BrowserType.CHROME);
        context = browser.newContext();
        page = context.newPage();
    }

    @AfterEach
    void tearDown() {
        // Closing the browser will close all its contexts and pages.
        if (browser != null) {
            browser.close();
        }
        // Finally, close the Playwright instance.
        if (playwright != null) {
            playwright.close();
        }
    }
}
