import java.util.Scanner;
//Escopo devariaveis(Uma variavel declarada em um if so vai funcionar nele
//Variaveis não podem ser duplicadas
public class quest5 {
	public static void main(String[] args) {
		Scanner sc1= new Scanner(System.in);
		System.out.println("Digite o seu Sexo(m ou f):");
		String sexo= sc1.nextLine();
		if (sexo=="feminino") {
			System.out.println("Digite sua idade:");
			int idade=sc1.nextInt();
			if (idade<60) {
				System.out.println("Você não tem idade para se aposentar.");
			}else {
				System.out.println("Digite a quantidade de anos de contribuição:");
				int contrib= sc1.nextInt();
				if (contrib<30) {
					int resto= (30-contrib);
					System.out.println("Faltam "+resto+" anos para voce se aposentar.");
				}else {
					System.out.println("Voce ja tem o direito a aposentadoria.");
				}
			}
		}else if (sexo=="masculino"){
			System.out.println("Digite sua idade:");
			int idade=sc1.nextInt();
			if (idade<65) {
				System.out.println("Você não tem idade para se aposentar.");
			}else {
				System.out.println("Digite a quantidade de anos de contribuição:");
				int contrib= sc1.nextInt();
				if (contrib<35){
					int resto= (35-contrib);
					System.out.println("Faltam "+resto+" anos para voce se aposentar.");
				}else {
					System.out.println("Voce ja tem o direito a aposentadoria.");
				}
		}
	}
}
}
