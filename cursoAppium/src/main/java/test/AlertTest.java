package test;

import org.junit.Assert;
import org.junit.Test;
import appium.core.BaseTest;
import page.AlertPage;
import page.MenuPage;

public class AlertTest extends BaseTest {
	
	private MenuPage menu = new MenuPage();
	private AlertPage page = new AlertPage();
	
	@Test
	public void deveConfirmarAlerta() {
	//acessar menu alerta
	menu.acessarAlerta();
	
	//clicar em alerta confirm
	page.clicarAlertaConfirm();
	
	//Verificar os textos
	Assert.assertEquals("Info", page.obterTituloAlerta());
	Assert.assertEquals("Confirma a opera��o?", page.obterMensagemAlerta());
	
	//Confirmar alerta
	page.confirmar();
	
	//verificar nova mensagem
	Assert.assertEquals("Confirmado", page.obterMensagemAlerta());
	
	//Sair
	page.sair();
	
	}	
}
