package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	// Elementos Login
	public By username = By.xpath("//input[@id='user-name']");
	public By password = By.xpath("//input[@id='password']");
	public By botaoLogin = By.xpath("//input[@id='login-button']");
	public By msgError = By.xpath("//h3[@data-test='error']");
	public By title = By.xpath("//title[text()='Swag Labs']");

	// Elementos Logout
	public By openMenu = By.xpath("//button[text()='Open Menu']");
	public By logout = By.xpath("//a[contains(text(),'Logout')]");
	public By addToCartBackpack = By.xpath("//div[@class='inventory_item'][1]//button");
	public By addToCartBikelight = By.xpath("//div[@class='inventory_item'][2]//button");
	public By addToCartBoltTshirt= By.xpath("//div[@class='inventory_item'][3]//button");
	// para validar texto >> //div[@class='inventory_item'][1]//div[text()='29.99']
	
	
	// Elementos Carrinho
	public By carrinho = By.xpath("//div[@id='shopping_cart_container']");
	
	// Elementos Compra
	public By botaoCheckout = By.xpath("//a[@class='btn_action checkout_button']");
	public By firstName = By.xpath("//input[@id='first-name']");
	public By lastName = By.xpath("//input[@id='last-name']");
	public By postalCode = By.xpath("//input[@id='postal-code']");
	public By botaoContinue = By.xpath("//input[@value='CONTINUE']");
	public By ValidarValorTotalItemBackpack = By.xpath("//div[@id='checkout_summary_container']//div[text()='32.39']");
	public By botaoFinish = By.xpath("//div//a[@class='btn_action cart_button']");
	public By validarCompra = By.xpath("//div[@id]//h2[text()='THANK YOU FOR YOUR ORDER']");

}
