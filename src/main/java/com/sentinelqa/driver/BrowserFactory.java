package com.sentinelqa.driver;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Playwright;
import com.sentinelqa.config.ConfigFactory;
import com.sentinelqa.enums.BrowserType;

public class BrowserFactory {

    public static Browser createBrowser(Playwright playwright) {
        String browserName = ConfigFactory.getConfig().browser();
        BrowserType browserType = BrowserType.valueOf(browserName.toUpperCase());
        boolean headless = ConfigFactory.getConfig().headless();

        switch (browserType) {
            case CHROME:
                return playwright.chromium().launch(new LaunchOptions().setChannel("chrome").setHeadless(headless));
            case FIREFOX:
                return playwright.firefox().launch(new LaunchOptions().setHeadless(headless));
            case EDGE:
                return playwright.chromium().launch(new LaunchOptions().setChannel("msedge").setHeadless(headless));
            case SAFARI:
                return playwright.webkit().launch(new LaunchOptions().setHeadless(headless));
            default:
                throw new IllegalArgumentException("Unsupported browser type: " + browserType);
        }
    }
}
