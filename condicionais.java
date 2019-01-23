import javax.swing.JOptionPane;
public class condicionais {
	public static void main(String[] agrs) {
		Object[] op= {"Masculino", "Feminino"};
		String resp= (String) JOptionPane.showInputDialog(null,
				"Selecione o Sexo:\n", "Pesquisa",
				JOptionPane.PLAIN_MESSAGE,null, op, "Masculino");
		if (resp==null) {
			JOptionPane.showMessageDialog(null, "Voce pressionol Cancel");
		}
		if (resp=="Masculino"){
			JOptionPane.showMessageDialog(null,"Voce é homem.");
		}
		if (resp=="Feminino") {
			JOptionPane.showMessageDialog(null, "Voce é mulher.");
		}
		System.exit(0);
	}
}
