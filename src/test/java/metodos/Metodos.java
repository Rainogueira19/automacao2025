package metodos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}
	
	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void validarTexto(By elemento, String texto) {
		String textoCapturado = driver.findElement(elemento).getText();
		assertEquals(textoCapturado, texto);
		System.out.println(textoCapturado);
		
	}
	
	public void capturarTexto(By elemento) {
		String textoCapturado = driver.findElement(elemento).getText();
		System.out.println(textoCapturado);
	}
	
	public void validarUrl(String urlEsperada) {
		String urlCapturada = driver.getCurrentUrl();
		assertEquals(urlEsperada, urlCapturada);
		System.out.println(urlCapturada);
	}
	
	public void scroll(int px) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0," + px + ")", "");
	}
	
	public void aguardarElemento(By elemento) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elemento));
		
	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}
	
	public void limparCampo(By elemento) {
		driver.findElement(elemento).clear();
	}

	public void validarTitle(String titleEsperado) {
		String titleCapturado = driver.getTitle();
		assertEquals(titleEsperado, titleCapturado);
		System.out.println(titleCapturado);
	}
	
	
}
