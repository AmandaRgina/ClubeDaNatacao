package br.com.clubedanatacao.utils;

import java.util.Random;

public abstract class GeradorNomes {
	
	private static String[] nomes = {"Fernanda", "Beatriz", "Ana", "Lucas", "Davi", "Gabriel"};
	private static String[] sobrenomes = {"Silveira", "Leite", "Santos", "Pinho", "Silva", "Alcantara"};
	
	
	public static String geraNome() {
		
		String result;
		
		Random random = new Random();
		
		int nom = random.nextInt(nomes.length);
		
		int sob = random.nextInt(sobrenomes.length);
		
		result = nomes[nom]+ " " + sobrenomes[sob];
		
		return result;
	
	}
}
