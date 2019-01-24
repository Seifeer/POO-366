package Conta;
import java.util.Scanner;

public class familia {
	public static void main(String[] agrs) {
		//TODO Auto-Generated method stub
		
		Scanner input=new Scanner(System.in);
		BF f[]=new BF[10];
		String nomeMae="", cidade="";
		int qtdFilhos;
		int indice=0;
		int opc=0;
		int soma=0;
		int valor=0;
		int total=0;
		while(true) {
			while ((opc>=0) && (opc<3)) {
				System.out.println("+---------------------------------+");
				System.out.println("| 1-Cadastrat Familia             |");
				System.out.println("| 2-Listar Familias Cadastradas   |");
				System.out.println("| 3-Sair                          |");
				System.out.println("+---------------------------------+");
				System.out.println("Escolha uma opção:");
				opc=input.nextInt();
				switch (opc) {
				case 1:{
					System.out.println("Nome da Mãe:");
					nomeMae=input.next();
					System.out.println("Numero de Filhos:");
					qtdFilhos=input.nextInt();
					System.out.println("Cidade:");
					cidade=input.next();
					f[indice]= new BF(nomeMae,qtdFilhos,cidade);
					indice++;
					soma+=f[indice].getValorMensal();
					break;
				}
				case 2:{
					total+=valor;
				}
				case 3:{
					relatorioFamilias(f);
					break;
				}
				}
			}
		}
	}//fim do main()
	
	static void relatorioFamilias(BF[] f) {
		for(int i=0;i<=f.length;i++) {
			if(f[i]!=null)
				System.out.println(f[i]);
		}
	}
	static int pesqCidade(BF[] f) {
		int valor=0;
		String cidade=null;
		for(int i=0;i<f.length;i++) {
			if (f[i].getCidade().equals(cidade))
				valor+=f[i].getValorMensal();
		}
		return valor;
	}
}
