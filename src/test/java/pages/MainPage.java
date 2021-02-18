package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MainPage extends BasePage{
    public MainPage(){
        PageFactory.initElements(Driver.get(), this);
    }


}
