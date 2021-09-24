package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class FormResult {

    @FindBy(how = How.ID, using = "_valueusername")
    private WebElement valueUserName;

    @FindBy(how = How.ID, using = "_valuepassword")
    private WebElement valuePassWord;

    @FindBy(how = How.ID, using = "_valuecomments")
    private WebElement valueComments;

    @FindBy(how = How.ID, using = "_valuecheckboxes0")
    private WebElement valueCheckBox1;

    @FindBy(how = How.ID, using = "_valuecheckboxes1")
    private WebElement valueCheckBox2;

    @FindBy(how = How.ID, using = "_valuecheckboxes2")
    private WebElement valueCheckBox3;

    @FindBy(how = How.ID, using = "_valueradioval")
    private WebElement valueRadio;

    @FindBy(how = How.ID, using = "_valuemultipleselect0")
    private WebElement valueSelect;

    @FindBy(how = How.ID, using = "_valuedropdown")
    private WebElement valueDropDown;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/p[1]/strong")
    private WebElement noValueUsername;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/p[2]/strong")
    private WebElement noValuePassword;

    @FindBy(how = How.XPATH, using = "/html/body/div/div[3]/p[3]/strong")
    private WebElement noValueComments;

    public WebDriver driver;
    public FormResult(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void verificarUserName(String nomeEsperado){
        String resultUserName = valueUserName.getText();
        Assert.assertEquals(nomeEsperado, resultUserName);
    }

    public void verificarPassWord(String senhaEsperada){
        String resultPassWord = valuePassWord.getText();
        Assert.assertEquals(senhaEsperada, resultPassWord);
    }

    public void verificarComentarios(String comentarioEsperado){
        String resultComments = valueComments.getText();
        Assert.assertEquals(comentarioEsperado, resultComments);
    }

    public void verificarCheckBox1(String checkBox1Esperado){
        String resultCheckBox1 = valueCheckBox1.getText();
        Assert.assertEquals(checkBox1Esperado, resultCheckBox1);
    }

    public void verificarCheckBox2(String checkBox2Esperado){
        String resultCheckBox2 = valueCheckBox2.getText();
        Assert.assertEquals(checkBox2Esperado, resultCheckBox2);
    }

    public void verificarCheckBox3(String checkBox3Esperado){
        String resultCheckBox3 = valueCheckBox3.getText();
        Assert.assertEquals(checkBox3Esperado, resultCheckBox3);
    }

    public void verificarRadioItens(String radioItensEsperado){
        String resultRadioItens = valueRadio.getText();
        Assert.assertEquals(resultRadioItens, resultRadioItens);
    }

    public void verificarMultipleSelect(String multipleSelectEsperado){
        String resultMultipleSelect = valueSelect.getText();
        Assert.assertEquals(multipleSelectEsperado, resultMultipleSelect);
    }

    public void verificarDropDown(String dropDownEsperado){
        String resultDropDown = valueDropDown.getText();
        Assert.assertEquals(dropDownEsperado, resultDropDown);
    }

    public void verificarCampoUsernameLimpo(String campoUsernameEsperado){
        String resultClearUsername = noValueUsername.getText();
        Assert.assertEquals(campoUsernameEsperado, resultClearUsername);
    }

    public void verificarCampoPasswordLimpo(String campoPasswordEsperado){
        String resultClearPassword = noValuePassword.getText();
        Assert.assertEquals(campoPasswordEsperado, resultClearPassword);
    }

    public void verificarCampoCommentsLimpo(String campoCommentsEsperado){
        String resultClearComments = noValueComments.getText();
        Assert.assertEquals(campoCommentsEsperado, resultClearComments);
    }
}


