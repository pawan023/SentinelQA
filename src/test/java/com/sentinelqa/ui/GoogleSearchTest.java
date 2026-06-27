package com.sentinelqa.ui;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.LoadState;
import com.sentinelqa.driver.BrowserFactory;
import com.sentinelqa.enums.BrowserType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSearchTest {

    private Playwright playwright;
    private Browser browser;
    private Page page;

    @BeforeEach
    void setUp() {
        playwright = Playwright.create();
        browser = BrowserFactory.createBrowser(playwright, BrowserType.CHROME);
        page = browser.newPage();
    }

    @Test
    void shouldSearchOnGoogle() {
        page.navigate("https://www.google.com");
        page.locator("[name='q']").fill("Playwright");
        page.locator("[name='q']").press("Enter");

        // Wait for the DOM to be ready, which is faster than waiting for full load
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);

        assertThat(page.title()).contains("Playwright");
    }

    @AfterEach
    void tearDown() {
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }
}
