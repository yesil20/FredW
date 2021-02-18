package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {
/*
I created Base page to store common part of my pages and store them in one place
I did abstract to hide implementation and for example if i put a method here when i call it in another page that extend from base page
then i will have to implement it. i do not need to add this to every pages.

I used POM here in pages directory and it allows me to control my Webelements in one place and separated.
 */
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "input#header-search")
    public WebElement searchInput;
    @FindBy(xpath = "//button[@aria-label='search']")
    public WebElement searchButton;
    @FindBy (xpath = "//button[@class='c-btn c-btn--main c-btn--large c-btn--block _-btn-wrap-fix js-add']")
    public WebElement addToBasketButton;
    @FindBy(xpath = "//a[@class='c-mini-basket__title']")
    public WebElement basketItemTitle;







}
