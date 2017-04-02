package matrizespiral.main;

import java.util.Arrays;

import matrizespiral.core.CriadorDeMatrizesZeradas;
import matrizespiral.core.PopuladorDeMatrizesEspirais;

public class MatrizEspiral {

	private Integer[][] matriz;

	public MatrizEspiral(Integer qtdLinhas, Integer qtdColunas) {
		CriadorDeMatrizesZeradas criadorDeMatrizesZeradas = new CriadorDeMatrizesZeradas();
		matriz = criadorDeMatrizesZeradas.criar(qtdLinhas, qtdColunas);
		PopuladorDeMatrizesEspirais populador = new PopuladorDeMatrizesEspirais();
		populador.popular(matriz);
	}

	public Integer[][] getMatriz() {
		return matriz;
	}

	@Override
	public String toString() {
		StringBuilder saida = new StringBuilder();
		Arrays.stream(matriz).forEach((Integer[] linha) -> {
			saida.append(System.lineSeparator());
			Arrays.stream(linha).forEach((Integer numeroAtual) -> {
				saida.append(preencherEspacosAEsquerda(numeroAtual));
			});
		});
		final Integer PRIMEIRA_LINHA = 0;
		saida.append(String.format("%s%s>>> (%d x %d)", System.lineSeparator(), System.lineSeparator(), matriz.length, matriz[PRIMEIRA_LINHA].length));
		return saida.toString();
	}

	private String preencherEspacosAEsquerda(Integer numeroAtual) {
		final String FORMATO_PADRAO = "     ";
		String resultado = String.format("%s%d", FORMATO_PADRAO, numeroAtual);
		resultado = resultado.substring(resultado.length() - FORMATO_PADRAO.length());
		return resultado;
	}

}
