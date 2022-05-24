package json;

import java.util.ArrayList;

import com.google.gson.Gson;

public class TesteJSON {

	public static void main(String[] args) {
		//Gravado JSON
		//instancia um cliente e preenche suas propriedades
        Cliente cliente = new Cliente(); 
        cliente.setCodigo(786);
        cliente.setNome("Paulo César Barreto");
        cliente.setAltura((float) 1.86);
        cliente.setStatus(true);
        cliente.setPeso(69);
        cliente.setEndereco(new ArrayList<String>());
        cliente.getEndereco().add("Av. Brasil, 340, Santo Antonio, Americana - SP");
        cliente.getEndereco().add("R. João Silvba, 1.345, Centro, Americana - SP");
        cliente.getEndereco().add("Pr. Olivio Batistella, S/N, Brasilia - DF");

        //instancia um objeto da classe Gson        
        Gson gson = new Gson(); 

        //pega os dados do cliente, converte para JSON e armazena em string
        String aux = gson.toJson(cliente);

        //imprime os resultados
        System.out.println(aux);
        
        //string com informação representada em JSON 
        String entrada = "{\"codigo\":\"456\",\"nome\":\"Luiz Barreto\",\"altura\":1.91,\"endereco\":[\"Av. José Paulino, 100, Campinas - SP\"]}";

        //instancia um cliente e preenche seus dados com a informação vinda
        //da string JSON
        cliente = gson.fromJson(entrada, Cliente.class);

        //imprime os resultados
        System.out.println(cliente.getCodigo());
        System.out.println(cliente.getNome());
        System.out.println(cliente.getAltura());
        System.out.println(cliente.getPeso());
        System.out.println(cliente.isStatus());
        System.out.println(cliente.getEndereco());
	}
}