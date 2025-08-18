package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import browsers.Navegadores;
import elementos.Elementos;
import metodos.Metodos;

public class CompraTest {
	
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
	public void compraSucesso() throws InterruptedException {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		metodo.clicar(elemento.addToCartBackpack);
		metodo.clicar(elemento.carrinho);
		Thread.sleep(1000);
		metodo.clicar(elemento.botaoCheckout);
		Thread.sleep(1000);
		metodo.escrever(elemento.firstName, "teste");
		metodo.escrever(elemento.lastName, "teste");
		metodo.escrever(elemento.postalCode, "12345678");
		metodo.clicar(elemento.botaoContinue);
		String totalItem = "Total: $32.39";
		metodo.validarTexto(elemento.ValidarValorTotalItemBackpack, totalItem);
		metodo.clicar(elemento.botaoFinish);
	}
	
	@Test
	public void comprarAdicionandoVariosItens() throws InterruptedException {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		metodo.clicar(elemento.addToCartBackpack);
		metodo.clicar(elemento.addToCartBikelight);
		metodo.clicar(elemento.addToCartBoltTshirt);
		metodo.clicar(elemento.carrinho);
		Thread.sleep(1000);
		metodo.clicar(elemento.botaoCheckout);
		Thread.sleep(1000);
		metodo.escrever(elemento.firstName, "teste");
		metodo.escrever(elemento.lastName, "teste");
		metodo.escrever(elemento.postalCode, "12345678");
		metodo.clicar(elemento.botaoContinue);
		String totalVariosItens = "Total: $60.45";
		metodo.validarTexto(elemento.ValidarValorTotalVariosItens, totalVariosItens);
		metodo.clicar(elemento.botaoFinish);
	}
	
	@Test
	public void cancelarCompra() throws InterruptedException {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		metodo.clicar(elemento.addToCartBackpack);
		metodo.clicar(elemento.carrinho);
		Thread.sleep(1000);
		metodo.clicar(elemento.botaoCheckout);
		Thread.sleep(1000);
		metodo.escrever(elemento.firstName, "teste");
		metodo.escrever(elemento.lastName, "teste");
		metodo.escrever(elemento.postalCode, "12345678");
	    metodo.clicar(elemento.botaoContinue);
		metodo.clicar(elemento.botaoCancel);
		metodo.validarUrl("https://www.saucedemo.com/v1/inventory.html");
		
	}
	
	@Test
	public void cancelarCompraTodosOsItens() throws InterruptedException {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		metodo.clicar(elemento.addToCartBackpack);
		metodo.clicar(elemento.addToCartBikelight);
		metodo.clicar(elemento.addToCartBoltTshirt);
		metodo.clicar(elemento.carrinho);
		Thread.sleep(1000);
		metodo.clicar(elemento.botaoCheckout);
		Thread.sleep(1000);
		metodo.escrever(elemento.firstName, "teste");
		metodo.escrever(elemento.lastName, "teste");
		metodo.escrever(elemento.postalCode, "12345678");
	    metodo.clicar(elemento.botaoContinue);
		metodo.clicar(elemento.botaoCancel);
		metodo.validarUrl("https://www.saucedemo.com/v1/inventory.html");
		
	}

}
