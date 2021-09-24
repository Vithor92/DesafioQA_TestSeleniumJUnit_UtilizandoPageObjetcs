package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.FormResult;
import pages.HomePage;
import setup.Driver;

public class DesafioTest2 {

    private WebDriver driver;

    @Before
    public void abrirNavegador(){
        Driver navegador = new Driver();
        driver = navegador.inicializarNavegador();
    }

    @After
    public void finalizarNavegador(){
        driver.quit();
    }

    @Test
    public void validarCamposSolicitadosSeEstaoLimpos(){
        HomePage homePage = new HomePage(driver);
        homePage.limparCampoDigitarComentario("");
        homePage.clicarBotaoSubmit();

        FormResult validacoes = new FormResult(driver);
        validacoes.verificarCampoUsernameLimpo("No Value for username");
        validacoes.verificarCampoPasswordLimpo("No Value for password");
        validacoes.verificarCampoCommentsLimpo("No Value for comments");

    }

}
