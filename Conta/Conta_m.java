package Conta;

import java.util.Scanner;

public class Conta_m {
	public static void main(String[] args) {
		double depo;
		int senha1;
		Scanner leitor= new Scanner(System.in);
	//Criando dados da conta
	//Nome:
		System.out.println("Digite seu nome:");
		String nome= leitor.nextLine();
		
	//Numero da conta:
		System.out.println("Numero da conta:");
		int numero_conta= leitor.nextInt();
	
	//Agencia:
		System.out.println("Numero da agência:");
		int numero_agencia=leitor.nextInt();
	
	//Senha:
		System.out.println("Senha:");
		senha1= leitor.nextInt();
	
	//Telefone:
		System.out.println("Telefone:");
		long telefone= leitor.nextLong();
	
	//Deposito:
		System.out.println("Informe o valor do deposito:");
		depo= leitor.nextDouble();
		
		Conta conta1= new Conta(nome,numero_conta,numero_agencia,senha1,telefone,depo);
		
		System.out.println("Digite a senha para entrar:");
		senha1= leitor.nextInt();
		if (senha1!=conta1.getSenha())
			System.out.println("Senhas não correspondem! ");
		else {
			System.out.println("Sua senha foi definida.");
			System.out.println("+----------------------+\n|      Operações       |\n+----------------------+\n| 1- Alterar Senha     |\n| 2- Saque             |\n| 3- Deposito          |\n| 4- Saldo Atual       |\n+----------------------+");
			System.out.println("Digite a operação: ");
			int escolha= leitor.nextInt();
			switch (escolha) {
				case 1:
					System.out.println("Digite sua senha atual:");
					senha1= leitor.nextInt();
					//Caso a pessoa erre a senha 3 vezes(for ou while)(futuramente)
					if (conta1.getSenha()==senha1)
						System.out.println("Digite a nova senha:");
						senha1= leitor.nextInt();
						conta1.alterar_senha(senha1);
					System.out.println("Senha da conta: "+(conta1.getSenha()));
					break;
				case 2:
					double saque;
					System.out.println("Informe o valor do saque:");
					saque= leitor.nextDouble();
					while(conta1.getSaldo()<saque) {
						System.out.println("Informe o valor do saque:");
						saque= leitor.nextDouble();
					}
					System.out.println("Senha:");
					senha1= leitor.nextInt();
			}
		}
	}
}

