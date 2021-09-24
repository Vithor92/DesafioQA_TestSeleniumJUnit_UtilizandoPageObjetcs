package tests;

import org.junit.*;
import setup.Driver;

import org.openqa.selenium.WebDriver;
import pages.FormResult;
import pages.HomePage;

public class DesafioTest1 {

    private WebDriver driver;

    @Before
    public void abrirNavegador(){
        Driver navegador = new Driver();
        driver = navegador.inicializarNavegador();
    }

    @After
    public void fecharNavegador() {
        driver.quit();
    }

    @Test
    public void preencherCamposSolicitados_eValidar() {
        HomePage homePage = new HomePage(driver);
        homePage.digitarNoCampoUserName("Vithor");
        homePage.digitarNoCampoPassword("Senha123");
        homePage.limparCampoDigitarComentario("Comentarios");
        homePage.marcarItem1NoCheckBox();
        homePage.marcarItem2NoCheckBox();
        homePage.marcarRadio1EmRadioItens();
        homePage.desmarcarItem4_MarcarItem1();
        homePage.selecionarDropDownItem1();
        homePage.clicarBotaoSubmit();

        FormResult validacoes = new FormResult(driver);
        validacoes.verificarUserName("Vithor");
        validacoes.verificarPassWord("Senha123");
        validacoes.verificarComentarios("Comentarios");
        validacoes.verificarCheckBox1("cb1");
        validacoes.verificarCheckBox2("cb2");
        validacoes.verificarCheckBox3("cb3");
        validacoes.verificarRadioItens("rd1");
        validacoes.verificarMultipleSelect("ms1");
        validacoes.verificarDropDown("dd1");

    }

}
