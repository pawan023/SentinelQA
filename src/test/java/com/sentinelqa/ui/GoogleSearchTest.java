package com.sentinelqa.ui;

import com.microsoft.playwright.options.LoadState;
import com.sentinelqa.core.BaseTest;
import com.sentinelqa.pages.GoogleHomePage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSearchTest extends BaseTest {

    @Test
    void shouldSearchOnGoogle() {
        GoogleHomePage homePage = new GoogleHomePage(page);
        homePage.navigate();
        homePage.searchFor("Playwright");

        page.waitForLoadState(LoadState.DOMCONTENTLOADED);

        assertThat(page.title()).contains("Playwright");
    }
}
