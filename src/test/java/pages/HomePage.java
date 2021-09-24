package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    @FindBy(how = How.XPATH, using = "//*[@id=\"HTMLFormElements\"]/table/tbody/tr[1]/td/input")
    private WebElement userName;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HTMLFormElements\"]/table/tbody/tr[2]/td/input")
    private WebElement passWord;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HTMLFormElements\"]/table/tbody/tr[3]/td/textarea")
    private WebElement textComments;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[1]")
    private WebElement checkBox1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HTMLFormElements\"]/table/tbody/tr[5]/td/input[2]")
    private WebElement checkBox2;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HTMLFormElements\"]/table/tbody/tr[6]/td/input[1]")
    private WebElement radioItems1;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HTMLFormElements\"]/table/tbody/tr[7]/td/select")
    private WebElement selectionItem;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HTMLFormElements\"]/table/tbody/tr[8]/td/select/option[1]")
    private WebElement dropDown;

    @FindBy(how = How.XPATH, using = "//*[@id=\"HTMLFormElements\"]/table/tbody/tr[9]/td/input[2]")
    private WebElement submitButton;

    public WebDriver driver;
    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void digitarNoCampoUserName(String name){
        userName.sendKeys(name);
    }

    public void digitarNoCampoPassword(String key){
        passWord.sendKeys(key);
    }

    public void limparCampoDigitarComentario(String comments){
        textComments.clear();
        textComments.sendKeys(comments);
    }

    public void marcarItem1NoCheckBox(){
        checkBox1.click();
    }

    public void marcarItem2NoCheckBox(){
        checkBox2.click();
    }

    public void marcarRadio1EmRadioItens(){
        radioItems1.click();
    }

    public void desmarcarItem4_MarcarItem1(){
        Select item4 = new Select(selectionItem);
        item4.deselectByValue("ms4");
        Select item1 = new Select(selectionItem);
        item1.selectByValue("ms1");
    }

    public void selecionarDropDownItem1(){
        dropDown.click();
    }

    public void clicarBotaoSubmit(){
        submitButton.click();
    }

}
