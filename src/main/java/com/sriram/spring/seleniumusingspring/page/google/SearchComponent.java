package com.sriram.spring.seleniumusingspring.page.google;

import com.sriram.spring.seleniumusingspring.page.Base;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SearchComponent extends Base {

    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(name = "btnK")
    private List<WebElement> searchButton;

    public void searchGoogle(final String searchString) {
        this.searchBox.sendKeys(searchString);
        this.searchBox.sendKeys(Keys.TAB);
        this.searchButton
                .stream()
                .filter(webElement -> webElement.isDisplayed() && webElement.isEnabled())
                .findFirst()
                .ifPresent(WebElement::click);
    }

    @Override
    public boolean isDriverInitiatedAndLoaded() {
        return
                this.webDriverWait.until((webDriver) -> this.searchBox.isDisplayed());
    }
}
