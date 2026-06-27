package com.sentinelqa.ui;

import com.microsoft.playwright.options.LoadState;
import com.sentinelqa.core.BaseTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSearchTest extends BaseTest {

    @Test
    void shouldSearchOnGoogle() {
        page.navigate("https://www.google.com");
        page.locator("[name='q']").fill("Playwright");
        page.locator("[name='q']").press("Enter");

        // Wait for the DOM to be ready, which is faster than waiting for full load
        page.waitForLoadState(LoadState.DOMCONTENTLOADED);

        assertThat(page.title()).contains("Playwright");
    }
}
