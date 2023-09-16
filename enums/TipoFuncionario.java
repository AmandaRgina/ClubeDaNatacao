package br.com.clubedanatacao.enums;

public enum TipoFuncionario {
	
	RECEPCIONISTA, FAXINEIRO, ZELADOR, GERENTE, TREINADOR_PRINCIPAL, 
	TREINADOR_ASSISTENTE,PROFESSOR_NATACAO;

	
public String toString() {
	
	String retorno = "";
	
	for (int i = 0; i < values().length; i++) {
		TipoFuncionario tipo = values()[i];
		
		retorno = tipo.name()+", ";
		
	}
	
	return retorno.substring(0, retorno.length() - 2);
	
}


	
}
