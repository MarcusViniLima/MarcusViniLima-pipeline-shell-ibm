package com.br.marcus.petshop;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class LogicaApplicationTests {

	@Test
	void testandoCpfValido() {
		var valido = ValidadorCpf.Validar("05460669502");
		assertEquals(true, valido);
	}
	@Test
	void testandoCpfInvalido() {
		var valido = ValidadorCpf.Validar("05460669511");
		assertEquals(false, valido);
	}

}
