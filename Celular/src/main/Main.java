package main;

import java.util.ArrayList;
import java.util.Scanner;

import entidade.Contato;
import entidade.Ligacao;
import entidade.Mensagem;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scn = new Scanner(System.in);

		ArrayList<String> contatos = new ArrayList<String>();

		System.out.println("__oreiacell__");
		
		System.out.println("Deseja criar um novo contato? ");
		String resp = scn.next().toLowerCase();
		
		if(resp.equals("nao") || resp.equals("não")) {
			System.out.println("Reiniciando...");
			main(args);
		}
		else {
			System.out.println("Quantos contatos deseja criar? ");
			int quantosContatos = scn.nextInt();
			
			for(int i = 0; i < quantosContatos; i++) {
				
				Scanner scn2 = new Scanner(System.in);
				
				
				Contato x = new Contato();
				
				System.out.print("Digite o nome do contato: ");
				String nome = scn2.next();
				x.setNomeContato(nome);
				System.out.print("Digite o número do contato: ");
				String numero = scn2.next();
				x.setNumeroContato(numero);
				
				contatos.add(nome);
				contatos.add(numero);
				
				//System.out.println(contatos);
			}
			
			Scanner scn3 = new Scanner(System.in);
			
			System.out.println(" 1- Lista de contatos");
			System.out.println(" 2- Fazer ligação");
			System.out.println(" 3- Mandar mensagem");
			String respMenu = scn3.next();
			
			switch(respMenu) {
			
			case "1": System.out.println(contatos);
			break;
			
			case "2": System.out.println("Qual contato deseja ligar? ");
					System.out.println(contatos);
					String ligarContato = scn3.next();
				
					Ligacao x = new Ligacao();
					
					x.Ligar(ligarContato);
				
			break;
			
			case "3": System.out.println("Para qual contato deseja mandar Mensagem? ");
					System.out.println(contatos);
					String mandarMensagem = scn.next();
					
					Mensagem y = new Mensagem();
					
					System.out.println("Digite sua mensagem: ");
					String mensagem = scn3.next();
					
					y.mandarMensagem(mandarMensagem);
			break;
			default: main(args);
			break;
			}
		}
		
	}

}
