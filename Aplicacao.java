package br.com.clubedanatacao;

import java.util.ArrayList;
import java.util.Scanner;

import br.com.clubedanatacao.entidades.GrupoNatacao;
import br.com.clubedanatacao.enums.DiaSemana;
import br.com.clubedanatacao.enums.NivelGrupo;
import br.com.clubedanatacao.enums.TipoFuncionario;



public class Aplicacao {

	/**
	 * Executa o sistema de gestao de biblioteca.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// TODO - Deve ser usada para invocar todos os metodos conforme as opcoes do menu.
		
		Clube clube = new Clube();
		
		clube.instanciaEntidades();
		
		
		
		while (true) {
			exibeMenu("********** Sistema do Clube de Natação **********");
			int opcao = obtemOpcaoMenu(sc, 1,10);
			switch (opcao) {
			case 1:
				
				
				
				// Listar todos os funcionarios
				
				 clube.imprimeFuncionarios();
				
				 break;
			case 2:
				// Listar todos os funcionarios de uma categoria específica
				
				System.out.println("Informe a categoria de funcionario dentre estas: ");
				for(TipoFuncionario tipo: TipoFuncionario.values()) {
					System.out.println(tipo.name());}
				
				
				
				break;
			case 3:
				
				// Listar todos os grupos
				
				clube.imprimeGrupos();
				
				
				
				break;
			case 4:
				
				// Listar todos de um grupo específico
				
				System.out.println("Informe o nivel do grupo: ");
				
				for(NivelGrupo nivel: NivelGrupo.values()) {
				System.out.println(nivel.name());}
				
				String op = sc.nextLine();
				
				clube.imprimeNivel(op);
				
				
				
				break;
			case 5:
				// Listar todos os que treinam em um determinado dia
				
				
				System.out.println("Informe o dia da semana: ");
				
				for(DiaSemana dia: DiaSemana.values()) {
				System.out.println(dia.name());}
				
				op = sc.nextLine();
				
				clube.imprimeDiaSemana(op);
				
				
				
				break;
		
					
				
			case 10:
				// Sair
				
				
			}
				}
	}
	
	/**
     * Exibe o menu de funcionlidades do programa.
     * 
     * @param cabecalho Cabeçalho do programa. 
     */
    private static void exibeMenu(String cabecalho) {
        String[] opcoes = new String[] {
        		"Listar todos os funcionarios", 
        		"Listar todas os funcionarios em uma categoria específica", 
        		"Listar todos os grupos", 
        		"Listar os grupos de uma categororia específica", 
        		"Listar todos os que treinam em um dia específico",
        		"Sair"
        		};
        Menu menu = new Menu(opcoes);
        System.out.println(menu.exibeMenu(cabecalho));
    }
    
    /**
     * Obtem a opcao escolhida pelo usuario.
     * 
     * @param inicio das opcoes de escolhas, deve ser maior que 0 (zero).
     * @param fim das opcoes de escolhas, tambem deve ser maior que 0 (zero).
     * 
     * @return Opcao escolhida pelo usuario.
     */
    private static int obtemOpcaoMenu(Scanner sc, int inicio, int fim) {
		int opcao = 0;
		System.out.println("");
		System.out.println("Informe o numero da opcao desejada: ");
		while (sc.hasNextLine()) {
			try {
				opcao = Integer.parseInt(sc.nextLine());
				if (opcao < inicio || opcao > fim) {
					throw new Exception();
				}
				return opcao;
			} catch (Exception e) {
				System.out.println(String.format("Opcao invalida. Digite uma opcao entre %d e %d.",
						inicio, fim));
			}
		}
		return opcao;
	}
    
    
}
