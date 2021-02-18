package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.MainPage;
import pages.ResultPage;
import utilities.BrowserUtils;
import utilities.ConfigurationReader;
import utilities.Driver;

public class StepDef {
    MainPage mainPage = new MainPage();
    ResultPage ResultPage = new ResultPage();
    @Given("I am on the main page")
    public void iAmOnTheMainPage() {
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("I type {string} on search input and click on search button")
    public void iTypeOnSearchInputAndClickOnSearchButton(String booktitle) {
        mainPage.searchInput.sendKeys(booktitle);
        mainPage.searchButton.click();
    }

    @And("I click {string} title")
    public void iClickTitle(String booktitle) {
        ResultPage.clickItemTitle(booktitle).click();
    }

    @Then("{string} should be displayed on basket")
    public void shouldBeDisplayedOnBasket(String booktitle) {
        Assert.assertEquals(mainPage.basketItemTitle.getText(),booktitle);
    }

    @And("I click add to basket button")
    public void iClickAddToBasketButton() {
        BrowserUtils.waitForClickablility(ResultPage.addToBasketButton,5);
        ResultPage.addToBasketButton.click();
    }
}