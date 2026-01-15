package empresa;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Cofrinho cofrinho = new Cofrinho();
		
		int opcao;
		
		System.out.println("--- Cofrinho Digital ---");
		
		while(true) {
			
			System.out.println("\nMenu:");
			System.out.println("1 - Adicionar Moeda");
			System.out.println("2 - Remover Moeda");
			System.out.println("3 - Listar Moedas");
			System.out.println("4 - Calcular total convertido para Real");
			System.out.println("0 - Sair");
			System.out.print("Escolha uma opção: ");
			
			opcao = teclado.nextInt();
			
			if (opcao == 0) {
				System.out.println("Enerrando sistema...");
				break;
			}
			
			switch(opcao) {
			case 1:
				System.out.println("Escolha a moeda:");
				System.out.println("1-Real | 2-Dolar | 3-Euro");
				int tipoMoeda = teclado.nextInt();
						
				System.out.println("Digite o valor:");
				double valor = teclado.nextDouble();
				
				Moeda moeda = null;
				
				if (tipoMoeda == 1) moeda = new Real(valor);
				else if (tipoMoeda == 2) moeda = new Dolar(valor);
				else if (tipoMoeda == 3) moeda = new Euro(valor);
				
				if (moeda != null) {
					cofrinho.adicionar(moeda);
					System.out.println("Moeda adicionada!");
				} else {
					System.out.println("Opção de moeda inválida.");
				}
				break;
				
			case 2:
				System.out.println("Escolha a moeda para remover:");
				System.out.println("1-Real | 2-Dolar | 3-Euro");
				int tipoMoedaRemover = teclado.nextInt();
				
				System.out.println("Digite o valor da moeda:");
				double valorRemover = teclado.nextDouble();
				
				Moeda moedaRemover = null;
				if (tipoMoedaRemover == 1) moedaRemover = new Real(valorRemover);
				else if (tipoMoedaRemover == 2) moedaRemover = new Dolar(valorRemover);
				else if (tipoMoedaRemover == 3) moedaRemover = new Euro(valorRemover);
				
				cofrinho.remover(moedaRemover);
				System.out.println("Tentativa de remoção executada.");
				break;
				
			case 3:
				cofrinho.listagemMoedas();
				break;
				
			case 4:
				double total = cofrinho.totalConvertido();
				System.out.printf("Total convertido para Real: R$ %.2f\n", total);
				break;
				
				default:
					System.out.println("Opção inválida!");
			}
		}
		
	}

}
