package matrizespiral.core.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import matrizespiral.core.GeradorDeEsquinas;

public class GeradorDeEsquinasTest {

	private GeradorDeEsquinas gerador;

	@Before
	public void instanciarGerador() {
		gerador = new GeradorDeEsquinas();
	}

	@Test
	public void proximaEsquinaDeveSer8() {
		final Integer CONTADOR = 1;
		final Integer QTD_LINHA_OU_QTD_COLUNA = 6;
		final Integer ESQUINA_ANTERIOR = 3;
		final Integer PROXIMA_ESQUINA = 8;
		assertEquals(PROXIMA_ESQUINA.intValue(),
				gerador.calcularProximaEsquina(ESQUINA_ANTERIOR, QTD_LINHA_OU_QTD_COLUNA, CONTADOR).intValue());
	}

	@Test
	public void deveRetornarTodasAsEsquinas6x3() {
		final Integer QTD_LINHAS = 6;
		final Integer QTD_COLUNAS = 3;
		Integer[] esquinas = new Integer[] { 3, 8, 10, 14, 15, 18 };
		assertArrayEquals(esquinas, gerador.calcularEsquinas(QTD_LINHAS, QTD_COLUNAS));
	}

	@Test
	public void deveRetornarTodasAsEsquinas4x5() {
		final Integer QTD_LINHAS = 4;
		final Integer QTD_COLUNAS = 5;
		Integer[] esquinas = new Integer[] { 5, 8, 12, 14, 17, 18, 20 };
		assertArrayEquals(esquinas, gerador.calcularEsquinas(QTD_LINHAS, QTD_COLUNAS));
	}

	@Test
	public void deveRetornarTodasAsEsquinas1x1() {
		final Integer QTD_LINHAS = 1;
		final Integer QTD_COLUNAS = 1;
		Integer[] esquinas = new Integer[] { 1 };
		assertArrayEquals(esquinas, gerador.calcularEsquinas(QTD_LINHAS, QTD_COLUNAS));
	}

	@Test
	public void deveRetornarTodasAsEsquinas2x2() {
		final Integer QTD_LINHAS = 2;
		final Integer QTD_COLUNAS = 2;
		Integer[] esquinas = new Integer[] { 2, 3, 4 };
		assertArrayEquals(esquinas, gerador.calcularEsquinas(QTD_LINHAS, QTD_COLUNAS));
	}

	@Test
	public void deveRetornarTodasAsEsquinas3x3() {
		final Integer QTD_LINHAS = 3;
		final Integer QTD_COLUNAS = 3;
		Integer[] esquinas = new Integer[] { 3, 5, 7, 8, 9 };
		assertArrayEquals(esquinas, gerador.calcularEsquinas(QTD_LINHAS, QTD_COLUNAS));
	}

	@Test
	public void deveRetornarTodasAsEsquinas2x3() {
		final Integer QTD_LINHAS = 2;
		final Integer QTD_COLUNAS = 3;
		Integer[] esquinas = new Integer[] { 3, 4, 6 };
		assertArrayEquals(esquinas, gerador.calcularEsquinas(QTD_LINHAS, QTD_COLUNAS));
	}

	@Test
	public void deveRetornarTodasAsEsquinas9x9() {
		final Integer QTD_LINHAS = 9;
		final Integer QTD_COLUNAS = 9;
		Integer[] esquinas = new Integer[] { 9, 17, 25, 32, 39, 45, 51, 56, 61, 65, 69, 72, 75, 77, 79, 80, 81 };
		assertArrayEquals(esquinas, gerador.calcularEsquinas(QTD_LINHAS, QTD_COLUNAS));
	}

	@Test
	public void deveRetornarTodasAsEsquinas4x7() {
		final Integer QTD_LINHAS = 4;
		final Integer QTD_COLUNAS = 7;
		Integer[] esquinas = new Integer[] { 7, 10, 16, 18, 23, 24, 28 };
		assertArrayEquals(esquinas, gerador.calcularEsquinas(QTD_LINHAS, QTD_COLUNAS));
	}

}
