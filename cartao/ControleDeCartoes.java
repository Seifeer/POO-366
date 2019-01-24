package cartao;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Conta.BF;

public class ControleDeCartoes {
	public static void main(String[] agrs) {
		//TODO Auto-Generated method stub
		
		Scanner leitor=new Scanner(System.in);
		cartao Card[]= new cartao[10];
		String titular, bandeira;
		String validade;
		int senha, numero;
		int opc=0,indice=0;
		double renda,valor;
		while (true) {
			while ((opc>=0) && (opc<4)) {
				System.out.println("+---------------------------------+");
				System.out.println("|          Menu de Opcoes         |");
				System.out.println("+---------------------------------+");
				System.out.println("| 1-Cadastro de Cartao            |");
				System.out.println("| 2-Realizar Compra               |");
				System.out.println("| 3-Lista de Todos os Cartoes     |");
				System.out.println("| 4-Valor total de compras        |");
				System.out.println("+---------------------------------+");
				opc=leitor.nextInt();
				switch(opc) {
				case 1:{
					System.out.println("Titular:");
					titular=leitor.next();
					System.out.println("Bandeira:");
					bandeira=leitor.next();
					System.out.println("Renda Mensal:");
					renda=leitor.nextDouble();
					System.out.println("Senha:");
					senha=leitor.nextInt();
					Card[indice]= new cartao(titular,senha,renda,bandeira);
					indice++;
					break;
				}
				case 2:{
					System.out.println("Numero:");
					numero=leitor.nextInt();
					System.out.println("Senha:");
					senha=leitor.nextInt();
					System.out.println("Valor:");
					valor=leitor.nextDouble();
					realizar_compra(Card,numero,senha,valor);
				}
				case 3:{
					listar_cartoes(Card);
					break;
				}
				case 4:{
					System.out.println(getTotal_compras());
					break;
				}
				}
			}
		}
		
	}
	private static double getTotal_compras() {
		// TODO Auto-generated method stub
		return cartao.total_compras;
	}
	static void listar_cartoes(cartao[] Card) {
		for(int i=0;i<=Card.length;i++) {
			if(Card[i]!=null)
				System.out.println(Card[i]);
		}
	}
	static void realizar_compra(cartao[] Card, int numero, int senha, double valor) {
		for(int i=0;i<Card.length;i++) {
			if (Card[i].getNumero()==numero) {
				Scanner input= new Scanner(System.in);
				String data_compra=input.next();
				boolean val_data= Card[i].getValidade().equals(data_compra);
				if (val_data!=true) {
					System.out.println("Cartão Vencido");
				}else {
					if (Card[i].getSenha()!=senha) {
						System.out.println("Senha invalida");
					}else {
						if (valor>Card[i].getLimite_compras()) {
							System.out.println("Valor acima dolimite.");;
						}else {
							Card[i].comprar(data_compra, valor, senha);
							System.out.println("Compra efetuada.");
						}
					}
				}
				
			}
		}
	}
}
