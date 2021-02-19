package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public abstract class BasePage {
/*
 I have used Page Object Model (POM) which is test design pattern to locate webElements only once.
    Page Factory class is used to initialize the webElements by using @FindBy annotation

 In Pages Package, BasePage class can be extended by all the classes in pages package. ( Inheritance )
 BasePage is used to store common webElements and methods.
 The reason of creating Abstract class is hiding of data implementation and showing only functionality.
 Can not create any objects from BasePage ( because Abstract)

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
