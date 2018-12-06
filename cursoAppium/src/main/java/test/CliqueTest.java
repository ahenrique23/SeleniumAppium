package test;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import appium.core.BaseTest;
import appium.core.DriverFactory;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import page.CliquePage;
import page.MenuPage;

public class CliqueTest extends BaseTest {

	private AndroidDriver<MobileElement> driver;
	private CliquePage page = new CliquePage();
	private MenuPage menu = new MenuPage();
	
	@Before
	public void inicializarAppium() throws MalformedURLException {
		driver = DriverFactory.getDrive();
		
		menu.acessarCliques();
	}
	
	@Test 
	public void devInteragirComCliqueLongo() {
		 
		//Realizar o clique longo
		page.cliqueLongo("Clique Longo");
		//Verificar o resultado
		Assert.assertEquals("Clique Longo", page.obterTextoCampo());
	}
	
	@Test 
	public void devInteragirComCliqueDuplo() {
		 
		//Realizar o clique Duplo
		
		//Verificar o resultado
		
	}
	
	@Test 
	public void devInteragirComCliqueDuploLento() {
		 
		//Realizar o clique Duplo Lento
		
		//Verificar o resultado
		
	}	
}
