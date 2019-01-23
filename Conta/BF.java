package Conta;

public class BF {
	private int numero;
	private String nomeMae;
	private int qtdFilhos;
	private String cidade;
	private double valorMensal;
 
	//Atributo Estático
	public static int numBeneficio=0;
	public static int contFamilia=0;
	public static double totalPago=0;

	//Getters e Setters
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public int getQtfFilhos() {
		return qtdFilhos;
	}
	public void setQtfFilhos(int qtfFilhos) {
		this.qtdFilhos = qtfFilhos;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public int getNumero() {
		 return numero;
	}
	public double getValorMensal() {
		return valorMensal;
	}
	 
	public BF(String nomeMae, int qtfFilhos, String cidade) {
		this.numero=++BF.numBeneficio;
		this.nomeMae=nomeMae;
		this.qtdFilhos=qtfFilhos;
		this.cidade=cidade;
		this.valorMensal=this.qtdFilhos*70;
		BF.contFamilia++;
		BF.totalPago+=this.valorMensal;
	}
	 
	 @Override
	 public String toString() {
		 return "Numero=" + numero +"\n" +
				"Nome Mae=" + nomeMae +"\n"+
				"Qtd.Filhos=" + qtdFilhos +"\n"+
				"Cidade=" + cidade+"\n"+
				"ValorMensal=" + valorMensal;
	 }
	 
	 
}
