package com.sriram.spring.seleniumusingspring.page.google;

import com.sriram.spring.seleniumusingspring.page.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchResultsComponent extends Base {

    @FindBy(css = "div.yuRUbf")
    private List<WebElement> results;

    public int getResultsCount() {
        return this.results.size();
    }

    @Override
    public boolean isDriverInitiatedAndLoaded() {
        return this.webDriverWait.until((webDriver) -> !this.results.isEmpty());
    }
}
