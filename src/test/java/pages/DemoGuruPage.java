package pages;


    import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

    import utulities.Driver;

public class DemoGuruPage {

        public DemoGuruPage() {
            PageFactory.initElements(Driver.getDriver(), this);
        }

        @FindBy (xpath = "(//a[@class='button button-orange'])[5]")
        public WebElement bankButton;

        @FindBy (xpath = "(//a[@class='button button-orange'])[6]" )
        public WebElement salesButton;

        @FindBy (xpath = "(//a[@class='button button-orange'])[2]")
        public WebElement ilkBesBinButton;

        @FindBy (xpath = "(//a[@class='button button-orange'])[4]")
        public WebElement ikincibesBinButton;

        @FindBy (xpath = "//ol[@id='bank']")
        public WebElement debitAccountBase;

        @FindBy (xpath = "(//li[@class='placeholder'])[1]")
        public WebElement debitAmountBase;

        @FindBy (xpath = "//ol[@id='loan']")
        public WebElement creditAccountBase;

        @FindBy (xpath = "(//ol[@class='field13 ui-droppable ui-sortable'])[2]")
        public WebElement creditAmountBase;

        @FindBy (xpath = "(//a[@class='button button-green'])[1]")
        public WebElement perfectButton;
}
