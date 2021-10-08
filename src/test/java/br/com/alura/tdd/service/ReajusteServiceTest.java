package br.com.alura.tdd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;

import br.com.alura.tdd.modelo.Desempenho;
import br.com.alura.tdd.modelo.Funcionario;

class ReajusteServiceTest {

	@Test
	public void reajusteDeveriaSerDeTresPorCentoQuandoDesempenhoForADesejar() {

		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Jean Heberth", LocalDate.now(), new BigDecimal("1000.00"));

		service.concederReajuste(funcionario, Desempenho.A_DESEJAR);

		assertEquals(new BigDecimal("1030.00"), funcionario.getSalario());

	}

	@Test
	public void reajusteDeveriaSerDeQuinzePorCentoQuandoDesempenhoForBom() {

		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Jean Heberth", LocalDate.now(), new BigDecimal("1000.00"));

		service.concederReajuste(funcionario, Desempenho.Bom);

		assertEquals(new BigDecimal("1150.00"), funcionario.getSalario());

	}

	@Test
	public void reajusteDeveriaSerDeVintePorCentoQuandoDesempenhoForOtimo() {

		ReajusteService service = new ReajusteService();
		Funcionario funcionario = new Funcionario("Jean Heberth", LocalDate.now(), new BigDecimal("1000.00"));

		service.concederReajuste(funcionario, Desempenho.Otimo);

		assertEquals(new BigDecimal("1200.00"), funcionario.getSalario());

	}
}
