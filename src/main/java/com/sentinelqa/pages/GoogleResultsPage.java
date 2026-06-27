package com.sentinelqa.pages;

import com.microsoft.playwright.Page;

public class GoogleResultsPage extends BasePage {

    public GoogleResultsPage(Page page) {
        super(page);
    }

    public String getTitle() {
        return page.title();
    }
}
