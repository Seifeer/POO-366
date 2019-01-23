import javax.swing.JOptionPane;
public class teste1JO {
	public static void main(String[] agrs) {
		String entrada;
		int lider,lanterna, vitorias;
		try {
			entrada=JOptionPane.showInputDialog("Digite os pontos do lider:");
			lider=Integer.parseInt(entrada);
			
			entrada=JOptionPane.showInputDialog("Digite os pontos do lanterna:");
			lanterna=Integer.parseInt(entrada);
			vitorias=(lider-lanterna)/3;
			JOptionPane.showMessageDialog(null, "O lanterna precisa de "+vitorias+" Vitorias para alcançar os pontos do lider.");
		}catch (NumberFormatException erro) {
			JOptionPane.showMessageDialog(null, "Digite apenas caracteres numéricos.");
		}
		System.exit(0);
	}
	//Faça a quinta questao da pagina 41 certo?!
}

te falar

a pessoa que eu to observando é vc

agr deixa eu esconder minha cara em algum lugar