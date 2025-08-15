package testes;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import browsers.Navegadores;
import elementos.Elementos;
import metodos.Metodos;

public class LoginTeste {

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
	public void loginSucesso() {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		String title = "Swag Labs";
		metodo.validarTitle(title);
	}

	@Test
	public void loginDadosInvalidos() {
		metodo.escrever(elemento.username, "teste");
		metodo.escrever(elemento.password, "12345678");
		metodo.clicar(elemento.botaoLogin);
		String msg = "Epic sadface: Username and password do not match any user in this service";
		metodo.validarTexto(elemento.msgError, msg);
	}

	@Test
	public void loginDadosEmBranco() {
		metodo.escrever(elemento.username, "");
		metodo.escrever(elemento.password, "");
		metodo.clicar(elemento.botaoLogin);
		String msg = "Epic sadface: Username is required";
		metodo.validarTexto(elemento.msgError, msg);
	}
	
	@Test
	public void loginUsuarioInvalido() {
		metodo.escrever(elemento.username, "teste");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		String msg = "Epic sadface: Username and password do not match any user in this service";
		metodo.validarTexto(elemento.msgError, msg);
	}
	
	
	@Test
	public void loginSenhaInvalida() {
		metodo.escrever(elemento.username, "standard_user");
		metodo.escrever(elemento.password, "teste");
		metodo.clicar(elemento.botaoLogin);
		String msg = "Epic sadface: Username and password do not match any user in this service";
		metodo.validarTexto(elemento.msgError, msg);
	}
	
	@Test
	public void loginUsuarioBloqueado() {
		metodo.escrever(elemento.username, "locked_out_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		String msg = "Epic sadface: Sorry, this user has been locked out.";
		metodo.validarTexto(elemento.msgError, msg);
	}
	
	@Test
	public void loginComProblemaDoUsuario() {
		metodo.escrever(elemento.username, "problem_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		String title = "Swag Labs";
		metodo.validarTitle(title);
	}
	
	@Test
	public void loginDemoraPraFazerLogin() throws InterruptedException {
		metodo.escrever(elemento.username, "performance_glitch_user");
		metodo.escrever(elemento.password, "secret_sauce");
		metodo.clicar(elemento.botaoLogin);
		Thread.sleep(3000);
		String title = "Swag Labs";
		metodo.validarTitle(title);
	}
	
	
	
}
