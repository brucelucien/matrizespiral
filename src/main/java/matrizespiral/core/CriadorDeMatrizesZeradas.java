package matrizespiral.core;

public class CriadorDeMatrizesZeradas {

	public Integer[][] criar(Integer qtdLinhas, Integer qtdColunas) {
		Integer[][] matrizDeZeros = new Integer[qtdLinhas][qtdColunas];
		for (Integer linha = 0; linha < matrizDeZeros.length; linha++) {
			for (Integer coluna = 0; coluna < matrizDeZeros[linha].length; coluna++) {
				matrizDeZeros[linha][coluna] = 0;
			}
		}
		return matrizDeZeros;
	}

}
