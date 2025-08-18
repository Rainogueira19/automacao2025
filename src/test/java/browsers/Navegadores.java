package browsers;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.Drivers;

public class Navegadores extends Drivers {

	public static void iniciarTeste() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/v1/index.html");
		System.out.println("*** Iniciando o teste ***");

	}

	public static void finalizarTeste() {
		driver.quit();
		System.out.println("*** Finalizando o teste ***");

	}

}
