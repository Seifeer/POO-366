import java.util.Scanner;
public class teste1 {
	public static void main(String[] agrs) {
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite os pontos do lider:");
		int lider= sc1.nextInt();
		System.out.println("Digite os pontos do lanterna");
		int lanterna= sc1.nextInt();
		int pontos= ((lider-lanterna)/3);
		System.out.println("O lanterna precisa de "+pontos+" vitorias para chegar.");
	}
}
