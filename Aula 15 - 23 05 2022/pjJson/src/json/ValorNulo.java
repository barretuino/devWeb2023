package json;

import java.util.ArrayList;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ValorNulo{

	public static void main(String[] args) {
		//Gravado JSON
		//instancia um cliente e preenche suas propriedades
		Cliente cliente = new Cliente(); 
		cliente.setCodigo(786);
		//cliente.setNome("Paulo César Barreto");
		cliente.setAltura((float) 1.86);
		cliente.setStatus(true);
		cliente.setPeso(72);
		cliente.setEndereco(new ArrayList<String>());
		cliente.getEndereco().add("Av. Brasil, 340, Santo Antonio, Americana - SP");
		cliente.getEndereco().add("R. João Silvba, 1.345, Centro, Americana - SP");
		cliente.getEndereco().add("Pr. Olivio Batistella, S/N, Brasilia - DF");

		//instancia um objeto da classe Gson        
		Gson gson = new Gson(); 

		//pega os dados do cliente, converte para JSON e armazena em string
		String aux = gson.toJson(cliente);

		JsonObject json = new JsonParser().parse(aux).getAsJsonObject();

		JsonElement jsonElement = json.get("nome");

		if (jsonElement == null || jsonElement instanceof JsonNull) {
			System.out.println("Conteúdo Nulo");
		}else {
			System.out.println(jsonElement);
		}

	}
}