package com.sriram.spring.seleniumusingspring;

import com.sriram.spring.seleniumusingspring.page.google.GooglePage;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GooglePageTest extends BaseTestNgTest {

    @Autowired
    private GooglePage googlePage;

    @Test
    public void googlePageTest() {
        googlePage.loadWebsite();
        Assert.assertTrue(googlePage.isDriverInitiatedAndLoaded());
        googlePage.getSearchComponent().searchGoogle("Kroger");
        Assert.assertTrue(googlePage.getSearchComponent().isDriverInitiatedAndLoaded());
        Assert.assertTrue(googlePage.getSearchResultsComponent().isDriverInitiatedAndLoaded());
        Assert.assertTrue(googlePage.getSearchResultsComponent().getResultsCount() > 0);
    }
}
