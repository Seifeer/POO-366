import java.util.Scanner;
public class idade {
	public static void main(String[] agrs) {
		Scanner input=new Scanner (System.in);
		
		System.out.println("Digite a idade:");
		int idade=input.nextInt();
		
		System.out.println("Resultado:");
		double resultado=input.nextDouble();
		
		System.out.println("Sexo:");
		char sexo= input.nextLine();
		//byte, short e int recebem tamanhos diferentes de variaveis respectivamente.
		byte x=126;
		short codigo=32767;
		float nota=(float)9.7;
		//true e false sempre comletras minusculos
		boolean aprovado= true;
		
		
		System.out.println("Resultado="+String.format("%.2f",resultado));
		//println tudo é string, String.format formata o valor
		System.out.println("Idade= "+idade+"\nNota= "+nota+"\n");
		System.out.printf("Idade= %d\nNota= %f",idade,nota);
	}
}
