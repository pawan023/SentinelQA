package com.sentinelqa.ui;

import com.sentinelqa.core.BaseTest;
import com.sentinelqa.pages.GoogleHomePage;
import com.sentinelqa.pages.GoogleResultsPage;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GoogleSearchTest extends BaseTest {

    @Test
    void shouldSearchOnGoogle() {
        GoogleHomePage homePage = new GoogleHomePage(page);
        homePage.navigate();
        
        GoogleResultsPage resultsPage = homePage.searchFor("Playwright");

        assertThat(resultsPage.getTitle()).contains("Playwright");
    }
}
