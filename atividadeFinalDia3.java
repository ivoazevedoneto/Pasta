package aula3;

import java.util.Scanner;

public class atividadeFinalDia3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nome;
		double saldo = 0;
		int menu = 0;
		int cc = 9999;
		int qtdsaques = 0;
		double saque = 0;
		String sim = "sim";
		String emp;
		double saldofinal = 0;
	
		
		
		Scanner read = new Scanner (System.in);
		
		System.out.println("<<<<<<<<<<<->>>>>>>>>>>");
		System.out.println("<<<<<<<<<CAIXA>>>>>>>>>");
		System.out.println("<<<<<<<<<<<->>>>>>>>>>>\n");;
		System.out.println("_______________________\n");
		System.out.println("DADOS DO CLIENTE:");
		System.out.println("Nome: ");
		nome = read.next();
				
		System.out.println("Valor inicial em conta: "/*Informar variável aqui*/);
		saldofinal = read.nextDouble();
		
		do {
		
		System.out.println("_______________________\n");
		System.out.println("<<<<<<<<<<<->>>>>>>>>>>");
		System.out.println("<<<<<<<<<MENU>>>>>>>>>>");
		System.out.println("<<<<<<<<<<<->>>>>>>>>>>\n");
		System.out.println("_______________________\n");
		
		System.out.println("1 - Extrado");
		System.out.println("2 - Sacar");
		System.out.println("3 - Depositar");
		System.out.println("4 - Sair");
		menu = read.nextInt();
		
		
		switch(menu) {
		
		case 1:
			System.out.println("Nome: "+nome);
			System.out.println("Nº conta corrente: "+cc);
			System.out.println("Saldo atual: "+ saldofinal);
			System.out.println("Saques realizados hoje: "+qtdsaques);
			
			break;
			
		case 2:
			if(qtdsaques >2 || saldofinal < 0){
				System.out.println("Você já alcançou a quantidade limite de saques do dia ou está sem saldo!");
				System.out.println("Tente novamente amanhã!");
			}
			
			else{
			
			System.out.println("_______________________");
			System.out.println("Informe o valor desejado: R$");
			saque = read.nextDouble();
			saldofinal = saldofinal - saque;
			
					if (saque > saldofinal){
						System.out.println("Saldo insuficiente!");
						System.out.println("Gostaria de realizar um empréstimo?");
						emp = read.next();
						
						if(emp.contentEquals(sim)) {
							
							saldofinal = saldofinal-saque;
							double tarifa = 0.11;
							double res = saldofinal-saque;
							double divida = res*tarifa;
							qtdsaques++;
							
							System.out.println("Saque realizado!");
							System.out.println("Você deverá pagar uma taxa de 11% de juros do valor emprestado!");
							System.out.println("Valor resgatado: R$"+saque);
							System.out.println("Valor emprestado: R$"+res);
							System.out.println("Valor juros a ser devitado: R$"+divida);
							System.out.println("Saldo: "+saldofinal);
						}
						
					}
						else{
						System.out.println("Saque realizado com sucesso!");
						System.out.println("Saldo atual: R$"+saldofinal);
						qtdsaques++;
							}
			}
			
			break;
			
		case 3:
			break;
			
		case 4:
			System.out.println("Saindo! Obrigado por utilizar nosso sistema!");
			break;
			
		default:
			System.out.println("Erro! Selecione uma das opções do menu!");
			break;
		
		
		
		}
		
	}while (menu != 4);

}}
