package page;

import org.openqa.selenium.By;

import appium.core.BasePage;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
	

public class MenuPage extends BasePage{
	private AndroidDriver<MobileElement> driver;	
	
	public void acessarFormulario() {
		clicar(By.xpath("//android.widget.TextView[@text='Formul�rio']"));
	}
	
	public void acessarSplash() {
		selecionarPorTexto("Splash");
	}
	
	public void acessarAlerta() {
		selecionarPorTexto("Alertas");
	}
	
	public void acessarAbas() {
		selecionarPorTexto("Abas");
	}
	
	public void acessarAccordion() {
		selecionarPorTexto("Accordion");
	}
	
	public void acessarCliques() {
		selecionarPorTexto("Cliques");
	}
	
	public void opcaoEscondida() {
		selecionarPorTexto("Op��o bem escondida");
	}
}
