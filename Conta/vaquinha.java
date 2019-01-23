package Conta;
import java.util.Scanner;

public class vaquinha{
	public static void main(String[] args) {
		Scanner leitor= new Scanner(System.in);
		Aluno [] aluno = new Aluno[40];
		String nome;
		double valor=0;
		int indice=0;
		char resp='\0';
		while(true) {
			System.out.println("Nome:");
			nome= leitor.nextLine();
			System.out.println("Valor:");
			valor= leitor.nextDouble();
			aluno[indice] = new Aluno(nome,valor);
			
			if (resp=='S')
				aluno[indice].setPago('S');
			
			indice++;
			System.out.println("Deseja continuar?(S/N):");
			resp=leitor.next().charAt(0);
			if (resp=='N')
				break;
		}
		
		gerarRelatorioPgto(aluno)
	}
}
