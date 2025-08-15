package metodos;

public class MetodosApi {
	
	// basear nesse exemplo de API
	
	/*
	public boolean validarCadastro(String cpf) {
		// Conectamos na API
		Response response = RestAssured.get("http://52.2.114.98/api/cliente");

		// Validando se o status code é diferente de 200
		if (response.statusCode() != 200) {
			return false;
		}
      
	    // Criamos um atributo chamado json para percorrer no caminho usando o JsonPath
	JsonPath json = response.jsonPath();
	  
        // Guardando em uma lista chamada cpfs usando o caminho abaixo
	List<String> cpfs = json.getList("personalInformation.cpf");
	
	    // Estamos validando se contém o cpf da assinatura na lista cpfs
	boolean cpfExistente = cpfs.contains(cpf);

	
              return cpfExistente;
              
}

*/
}
