package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import browsers.Navegadores;
import elementos.Elementos;
import metodos.Metodos;

public class LogoutTest {

	Metodos metodo = new Metodos();
	Elementos elemento = new Elementos();

	@BeforeEach
	public void setUp() {
		Navegadores.iniciarTeste();
	}

	@AfterEach
	public void tearDown() {
		Navegadores.finalizarTeste();
	}

	@Test
	public void logoutSucesso() throws InterruptedException {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		metodo.clicar(elemento.openMenu);
		Thread.sleep(2000);
		metodo.clicar(elemento.logout);
		String urlEsperada = "https://www.saucedemo.com/v1/index.html";
		metodo.validarUrl(urlEsperada);
	}
	
	@Test
	public void logoutComProdutoAdicionadoCarrinho() throws InterruptedException {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		metodo.clicar(elemento.addToCartBackpack);
		metodo.clicar(elemento.openMenu);
		Thread.sleep(2000);
		metodo.clicar(elemento.logout);
		String urlEsperada = "https://www.saucedemo.com/v1/index.html";
		metodo.validarUrl(urlEsperada);

	}
	
	@Test
	public void logoutComVariosProdutosAdicionadosCarrinho() throws InterruptedException {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		metodo.clicar(elemento.addToCartBackpack);
		metodo.clicar(elemento.addToCartBikelight);
		metodo.clicar(elemento.addToCartBoltTshirt);
		metodo.clicar(elemento.openMenu);
		Thread.sleep(2000);
		metodo.clicar(elemento.logout);
		String urlEsperada = "https://www.saucedemo.com/v1/index.html";
		metodo.validarUrl(urlEsperada);

}
	
}
