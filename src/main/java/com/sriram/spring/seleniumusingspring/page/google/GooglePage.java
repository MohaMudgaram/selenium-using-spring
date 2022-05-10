package com.sriram.spring.seleniumusingspring.page.google;

import com.sriram.spring.seleniumusingspring.page.Base;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GooglePage extends Base {

    @Autowired
    private SearchComponent searchComponent;

    @Autowired
    private SearchResultsComponent searchResultsComponent;

    @Value("${url.google:https://www.google.com/}")
    private String webUrl;

    public void loadWebsite() {
        logger.info("Loader URL: " + webUrl);
        this.webDriver.get(webUrl);
    }

    public SearchComponent getSearchComponent() {
        return searchComponent;
    }

    public void setSearchComponent(SearchComponent searchComponent) {
        this.searchComponent = searchComponent;
    }

    public SearchResultsComponent getSearchResultsComponent() {
        return searchResultsComponent;
    }

    public void setSearchResultsComponent(SearchResultsComponent searchResultsComponent) {
        this.searchResultsComponent = searchResultsComponent;
    }

    @Override
    public boolean isDriverInitiatedAndLoaded() {
        return this.searchComponent.isDriverInitiatedAndLoaded();
    }
}
