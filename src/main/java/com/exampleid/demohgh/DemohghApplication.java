package com.exampleid.demohgh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemohghApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(DemohghApplication.class, args);

	Mostro monstro = new Mostro();

		monstro.x = 10;
		monstro.y = 10 ;

		Heroi heroi = new Heroi(10,11);

		


		
		System.out.println("monstro tem => "+ monstro.vida);
		System.out.println("heroi tem => "+heroi.vida);


		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.atacar(heroi);
		heroi.atacar(monstro);

		monstro.andar(Direção.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);

		
		System.out.println("monstro tem => "+ monstro.vida);
		System.out.println("heroi tem => "+heroi.vida);
	
	
	}

}
