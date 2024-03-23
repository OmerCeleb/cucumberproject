package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DataTable_HomePage {
    public DataTable_HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
