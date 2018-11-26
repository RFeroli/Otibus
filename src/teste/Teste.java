package teste;

import java.io.File;
import java.util.ArrayList;
import java.util.Random;

import api_interface.Onibus;
import api_interface.Otibus;
import api_interface.Passageiros;
import api_interface.Resposta;
import api_interface.TemposMedios;

public class Teste {
	public static void main(String[] args) {
		Otibus o = new Otibus();
		ArrayList<Passageiros> passageiros = carreguePassageiros();
		ArrayList<Onibus> onibus = carregueOnibus();
		Valores v = new Valores();
		int qtdPontos = 39; // quantidade de pontos
		int nGeracoes = 100000; // numero de gerações para o algoritmo
		String versao = ""; // forma de diferenciar diferentes versoes dentro de uma pasta
		File file=null; // diretorio de saida para os arquivos gerados
		Resposta r = o.start(passageiros, onibus, v, qtdPontos, nGeracoes, versao, file);
		// r contem todas os dados gerados pelo modelo que também foram salvos no diretorio file
	}

	private static ArrayList<Onibus> carregueOnibus() {
		// Crie sua lista de onibus contendo o seu id, o horario que inicia as operacoes, capacidade de passageiros, definir como modificavel
		return null;
	}

	private static ArrayList<Passageiros> carreguePassageiros() {
		// Crie sua lista de passageiros com os dados de origem, destino e tempo de chegada no ponto.
		return null;
	}
}
class Valores implements TemposMedios{
	@Override
	public double tempoEntrePontos(int ponto, int idOnibus, double tempoCorrente) {
		// Dado um ponto i, o onibus e o tempo atual, devolva o tempo ate i+1 
		return 0.0;
	}

	@Override
	public double tempoParadoNoPonto(int ponto, int idOnibus, double tempoCorrente, int quatidadePassageiros) {
		// Devolva o tempo parado no ponto i
		return 0.0;
	}
	
}

