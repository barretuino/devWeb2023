package br.barretuino.test;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import br.barretuino.modelagem.Pessoa;

@WebService
public class ListagemPessoa {
	List<Pessoa> lista = new ArrayList<Pessoa>();
	
	public ListagemPessoa(){
		Pessoa p1 = new Pessoa();
		p1.setCodigo(123);
		p1.setNome("Pessoa 1");
		
		Pessoa p2 = new Pessoa();
		p2.setCodigo(456);
		p2.setNome("Pessoa 2");
		
		lista.add(p1);
		lista.add(p2);
	}
	
	public List<Pessoa> listarPessoa(){
		return lista;
	}
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8175/pessoas", new ListagemPessoa());
		System.out.println("Serviço inicializado!");
		}
}
