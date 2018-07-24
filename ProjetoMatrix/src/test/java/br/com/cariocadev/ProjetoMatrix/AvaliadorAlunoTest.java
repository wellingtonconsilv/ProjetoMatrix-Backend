package br.com.cariocadev.ProjetoMatrix;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.math.BigDecimal;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AvaliadorAlunoTest {

	@Rule
	public ExpectedException exceptionRule = ExpectedException.none();

	@Test
	public void deveRetornarAMaiorNota() {
		AvaliadorAluno avaliador = new AvaliadorAluno();
		BigDecimal[] notas = new BigDecimal[] { new BigDecimal(10.0), new BigDecimal(5.0), new BigDecimal(3.0),
				new BigDecimal(7.0) };
		assertEquals(new Double(10.0), avaliador.getMaiorNota(notas));
		assertNotNull("O método não deve retornar null", avaliador.getMaiorNota(notas));
	}

	@Test
	public void deveDispararExcecaoSeArgumentoAoBuscarMaiorNotaIgualNull() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getMaiorNota(null);
	}

	@Test
	public void deveCalcularAMediaDasNotas() {
		AvaliadorAluno avaliador = new AvaliadorAluno();
		assertEquals(new BigDecimal(7.3),
				avaliador.getMedia(new BigDecimal(10.0), new BigDecimal(5.0), new BigDecimal(7.0)));
		assertNotNull("O método não deve retornar null",
				avaliador.getMedia(new BigDecimal(10.0), new BigDecimal(5.0), new BigDecimal(7.0)));
	}

	@Test
	public void deveDispararExcecaoSeArgumentoAoBuscarMediaDeNotasIgualNull() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getMedia(null, null, null);
	}

	@Test
	public void deveDispararExcecaoSeArgumentoNota1AoBuscarMediaDeNotasIgualNull() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getMedia(null, new BigDecimal(5.0), new BigDecimal(7.0));
	}

	@Test
	public void deveDispararExcecaoSeArgumentoNota1AoBuscarMediaDeNotasMenorQueZero() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getMedia(new BigDecimal(-2.0), new BigDecimal(5.0), new BigDecimal(10.0));
	}

	@Test
	public void deveDispararExcecaoSeArgumentoNota1AoBuscarMediaDeNotasMaiorQueDez() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getMedia(new BigDecimal(10.1), new BigDecimal(5.0), new BigDecimal(10.0));
	}

	@Test
	public void deveDispararExcecaoSeArgumentoNota2AoBuscarMediaDeNotasIgualNull() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getMedia(new BigDecimal(10.0), null, new BigDecimal(7.0));
	}

	@Test
	public void deveDispararExcecaoSeArgumentoNota2AoBuscarMediaDeNotasMenorQueZero() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getMedia(new BigDecimal(10.0), new BigDecimal(-0.1), new BigDecimal(10.0));
	}

	@Test
	public void deveDispararExcecaoSeArgumentoNota2AoBuscarMediaDeNotasMaiorQueDez() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getMedia(new BigDecimal(10.0), new BigDecimal(10.10), new BigDecimal(10.0));
	}

	@Test
	public void deveDispararExcecaoSeArgumentoNota3AoBuscarMediaDeNotasIgualNull() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getMedia(new BigDecimal(10.0), new BigDecimal(5.0), null);
	}

	@Test
	public void deveDispararExcecaoSeArgumentoNota3AoBuscarMediaDeNotasMenorQueZero() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getMedia(new BigDecimal(10.0), new BigDecimal(10.00), new BigDecimal(-10.0));
	}

	@Test
	public void deveDispararExcecaoSeArgumentoNota3AoBuscarMediaDeNotasMaiorQueDez() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getMedia(new BigDecimal(10.0), new BigDecimal(10.10), new BigDecimal(15.0));
	}
	
	@Test
	public void deveCalcularMedia() {
		AvaliadorAluno avaliador = new AvaliadorAluno();
		assertNotNull("O método não deve retornar null", avaliador.getStatus(new BigDecimal(10.0), new BigDecimal(5.0), new BigDecimal(7.0)));
		assertEquals("APROVADO",avaliador.getStatus(new BigDecimal(10.0), new BigDecimal(5.0), new BigDecimal(7.0)));
		assertEquals("REPROVADO",avaliador.getStatus(new BigDecimal(2.0), new BigDecimal(4.0), new BigDecimal(1.0)));
		assertEquals("PROVA_FINAL",avaliador.getStatus(new BigDecimal(4.0), new BigDecimal(4.0), new BigDecimal(4.0)));
	}
	
	@Test
	public void deveDispararExcecaoSeArgumentoIgualNullAoBuscarStatus() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getStatus(null, null, null);
	}
	
	@Test
	public void deveDispararExcecaoSeArgumentoNota1MenorQueZeroAoBuscarStatus() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getStatus(new BigDecimal(-2.0), new BigDecimal(5.0), new BigDecimal(10.0));
	}
	
	@Test
	public void deveDispararExcecaoSeArgumentoNota1MaiorQueDezAoBuscarStatus() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getStatus(new BigDecimal(10.1), new BigDecimal(5.0), new BigDecimal(10.0));
	}

	@Test
	public void deveDispararExcecaoSeArgumentoNota2IgualNullAoBuscarStatus() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getStatus(new BigDecimal(10.0), null, new BigDecimal(7.0));
	}
	
	@Test
	public void deveDispararExcecaoSeArgumentoNota3MenorQueZeroAoBuscarStatus() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getStatus(new BigDecimal(10.0), new BigDecimal(10.00), new BigDecimal(-10.0));
	}

	@Test
	public void deveDispararExcecaoSeArgumentoNota3MaiorQueDezAoBuscarStatus() {
		exceptionRule.expect(IllegalArgumentException.class);
		AvaliadorAluno avaliador = new AvaliadorAluno();
		avaliador.getStatus(new BigDecimal(10.0), new BigDecimal(10.10), new BigDecimal(15.0));
	}

}
