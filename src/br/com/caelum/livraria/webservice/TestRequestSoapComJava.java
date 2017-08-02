package br.com.caelum.livraria.webservice;

import java.rmi.RemoteException;

public class TestRequestSoapComJava {

	public static void main(String[] args) throws RemoteException {

		// LivrariaWSProxy realiza a chamada remota e
		// gera SOAP
		LivrariaWS cliente = new LivrariaWSProxy();
		
		// cliente.get faz o req. HTTP retornando todo o SOAP
		Livro[] livros = cliente.getLivrosPeloNome("Areia");

		for (Livro l : livros) {
			System.out.println("Titulo: " + l.getTitulo());
			System.out.println("Autor: " + l.getAutor());
		}
	}

}
