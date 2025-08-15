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
	
	@Test //Passou
	public void compraSucesso() {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		metodo.clicar(elemento.addToCartBackpack);
		metodo.clicar(elemento.carrinho);
		metodo.clicar(elemento.botaoCheckout);
		metodo.escrever(elemento.firstName, "teste");
		metodo.escrever(elemento.lastName, "teste");
		metodo.escrever(elemento.postalCode, "12345678");
		metodo.clicar(elemento.botaoContinue);
		String totalItem = "Total: $32.39";
		metodo.validarTexto(elemento.ValidarValorTotalItemBackpack, totalItem);
		metodo.clicar(elemento.botaoFinish);
	}

}
