package com.sentinelqa.pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.LoadState;

public class GoogleHomePage extends BasePage {

    private final String searchBox = "[name='q']";

    public GoogleHomePage(Page page) {
        super(page);
    }

    public void navigate() {
        page.navigate("https://www.google.com");
    }

    public GoogleResultsPage searchFor(String text) {
        page.locator(searchBox).fill(text);
        page.locator(searchBox).press("Enter");
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);
        return new GoogleResultsPage(page);
    }
}
