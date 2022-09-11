package com.br.marcus.petshop;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LogicaApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//SpringApplication.run(LogicaApplication.class, args);
		System.out.println("Digite seu cpf:");
		String cpf = sc.next();
		System.out.println("O CPF  digitado é: " +
		 (ValidadorCpf.Validar(cpf) ? "Valido" : "Invalido")
		 );
	}

}
