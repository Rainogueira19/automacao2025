package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import browsers.Navegadores;
import elementos.Elementos;
import metodos.Metodos;

public class CarrinhoTest {
	
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
	
	//@Test
	public void validarItemAdicionadoCarrinho() {
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
		

}
	
	//@Test
	public void validarvariosItensAdicionadosCarrinho() {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		metodo.clicar(elemento.addToCartBackpack);
		metodo.clicar(elemento.addToCartBikelight);
		metodo.clicar(elemento.addToCartBoltTshirt);
		metodo.clicar(elemento.carrinho);
		metodo.clicar(elemento.botaoCheckout);
		metodo.escrever(elemento.firstName, "teste");
		metodo.escrever(elemento.lastName, "teste");
		metodo.escrever(elemento.postalCode, "12345678");
		metodo.clicar(elemento.botaoContinue);
		String valorTotalItens = "Total: $60.45";
		metodo.validarTexto(elemento.validarValorTotalBackpackBikelightBoltTShirt, valorTotalItens);
		

}                     
	
	//@Test
	public void continuarComprando() {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		metodo.clicar(elemento.addToCartBackpack);
		metodo.clicar(elemento.carrinho);
		metodo.clicar(elemento.botaoContinueShopping);
		metodo.clicar(elemento.addToCartBikelight);
		metodo.clicar(elemento.carrinho);
		metodo.clicar(elemento.botaoCheckout);
		metodo.escrever(elemento.firstName, "teste");
		metodo.escrever(elemento.lastName, "teste");
		metodo.escrever(elemento.postalCode, "12345678");
		metodo.clicar(elemento.botaoContinue);
		String valorTotalItens = "Total: $43.18";
		metodo.validarTexto(elemento.validarValorTotalContinuarComprando, valorTotalItens);
		

}
	
	//@Test
	public void removerItemAdicionadoCarrinho() {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		metodo.clicar(elemento.addToCartBackpack);
		metodo.clicar(elemento.carrinho);
		String item1Carrinho = "1";
		metodo.validarTexto(elemento.validar1Carrinho, item1Carrinho);
		metodo.clicar(elemento.botaoRemove);
		

}
	
	@Test
	public void removerTodosOsItensAdicionadosCarrinho() {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		metodo.clicar(elemento.addToCartBackpack);
		metodo.clicar(elemento.addToCartBikelight);
		metodo.clicar(elemento.addToCartBoltTshirt);
		metodo.clicar(elemento.carrinho);
		String item3Carrinho = "3";
		metodo.validarTexto(elemento.validar3Carrinho, item3Carrinho);
		metodo.clicar(elemento.botaoRemove);


}
	
}