package com.exampleid.demohgh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemohghApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemohghApplication.class, args);


		
		

		Compra compra1 = new Compra();
		compra1.AdicionarIntem(new Produto("Notebbok", 1897.90), 2);

		
		Compra compra2 = new Compra();
		compra2.AdicionarIntem(new Produto("Notebbok", 1897.90), 2);
		compra2.AdicionarIntem(new Produto("Caderno ", 10), 10);
		compra2.AdicionarIntem(new Produto("Impressora ", 900), 1);
		Cliente cliente  = new Cliente("maria julia ");
		cliente.adicionarCompra(compra1);
		cliente.compras.add(compra2);

		System.out.print(cliente.obterValorTotal());



	}

}
