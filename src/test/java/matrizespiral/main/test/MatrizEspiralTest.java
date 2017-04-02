package matrizespiral.main.test;

import static org.junit.Assert.*;

import org.junit.Test;

import matrizespiral.main.MatrizEspiral;

public class MatrizEspiralTest {

	@Test
	public void deveCriar1x1() {
		MatrizEspiral matrizEspiral = new MatrizEspiral(1, 1);
		assertArrayEquals(new Integer[][] { { 1 } }, matrizEspiral.getMatriz());
	}

	@Test
	public void deveCriar6x3() {
		MatrizEspiral matrizEspiral = new MatrizEspiral(6, 3);
		assertArrayEquals(new Integer[][] { { 1, 2, 3 }, { 14, 15, 4 }, { 13, 16, 5 }, { 12, 17, 6 }, { 11, 18, 7 },
				{ 10, 9, 8 } }, matrizEspiral.getMatriz());
	}

	@Test
	public void deveCriar4x5() {
		MatrizEspiral matrizEspiral = new MatrizEspiral(4, 5);
		assertArrayEquals(new Integer[][] { { 1, 2, 3, 4, 5 }, { 14, 15, 16, 17, 6 }, { 13, 20, 19, 18, 7 },
				{ 12, 11, 10, 9, 8 } }, matrizEspiral.getMatriz());
	}

	@Test
	public void deveCriar9x9() {
		MatrizEspiral matrizEspiral = new MatrizEspiral(9, 9);
		assertArrayEquals(new Integer[][] { { 1, 2, 3, 4, 5, 6, 7, 8, 9 }, { 32, 33, 34, 35, 36, 37, 38, 39, 10 },
				{ 31, 56, 57, 58, 59, 60, 61, 40, 11 }, { 30, 55, 72, 73, 74, 75, 62, 41, 12 },
				{ 29, 54, 71, 80, 81, 76, 63, 42, 13 }, { 28, 53, 70, 79, 78, 77, 64, 43, 14 },
				{ 27, 52, 69, 68, 67, 66, 65, 44, 15 }, { 26, 51, 50, 49, 48, 47, 46, 45, 16 },
				{ 25, 24, 23, 22, 21, 20, 19, 18, 17 } }, matrizEspiral.getMatriz());
	}

	@Test
	public void deveImprimir1x1() {
		MatrizEspiral matrizEspiral = new MatrizEspiral(1, 1);
		assertEquals(String.format("%s    1%s%s>>> (1 x 1)", System.lineSeparator(), System.lineSeparator(),
				System.lineSeparator()), matrizEspiral.toString());
	}

	@Test
	public void deveImprimir1x4() {
		MatrizEspiral matrizEspiral = new MatrizEspiral(1, 4);
		assertEquals(String.format("%s    1    2    3    4%s%s>>> (1 x 4)", System.lineSeparator(),
				System.lineSeparator(), System.lineSeparator()), matrizEspiral.toString());
	}

	@Test
	public void deveImprimir2x2() {
		MatrizEspiral matrizEspiral = new MatrizEspiral(2, 2);
		assertEquals(String.format("%s    1    2%s    4    3%s%s>>> (2 x 2)", System.lineSeparator(),
				System.lineSeparator(), System.lineSeparator(), System.lineSeparator()), matrizEspiral.toString());
	}

	@Test
	public void deveImprimir6x3() {
		MatrizEspiral matrizEspiral = new MatrizEspiral(6, 3);
		assertEquals(
				String.format(
						"%s    1    2    3%s   14   15    4%s   13   16    5%s   12   17    6%s   11   18    7%s   10    9    8%s%s>>> (6 x 3)",
						System.lineSeparator(), System.lineSeparator(), System.lineSeparator(), System.lineSeparator(),
						System.lineSeparator(), System.lineSeparator(), System.lineSeparator(), System.lineSeparator()),
				matrizEspiral.toString());
	}

}
