package matrizespiral.core.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import matrizespiral.core.CriadorDeMatrizesZeradas;

public class CriadorDeMatrizesZeradasTest {

	private CriadorDeMatrizesZeradas criador;

	@Before
	public void instanciarCriadorDeMatrizesZeradas() {
		criador = new CriadorDeMatrizesZeradas();
	}

	@Test
	public void deveRetornar1x1Zerada() {
		assertArrayEquals(new Integer[][] { { 0 } }, criador.criar(1, 1));
	}

	@Test
	public void deveRetornar7x3Zerada() {
		assertArrayEquals(new Integer[][] { { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 }, { 0, 0, 0 },
				{ 0, 0, 0 }, { 0, 0, 0 } }, criador.criar(7, 3));
	}

}
