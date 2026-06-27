package com.sentinelqa.driver;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.sentinelqa.enums.BrowserType;

public class BrowserFactory {

    public static Browser createBrowser(Playwright playwright, BrowserType browserType) {
        switch (browserType) {
            case CHROME:
                return playwright.chromium().launch(new LaunchOptions().setChannel("chrome").setHeadless(false));
            case FIREFOX:
                return playwright.firefox().launch(new LaunchOptions().setHeadless(false));
            case EDGE:
                return playwright.chromium().launch(new LaunchOptions().setChannel("msedge").setHeadless(false));
            case SAFARI:
                return playwright.webkit().launch(new LaunchOptions().setHeadless(false));
            default:
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
        }
    }
}
