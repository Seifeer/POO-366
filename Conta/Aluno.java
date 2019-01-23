package Conta;

public class Aluno {

	public static double vaquinha=0;//count
	
	private String Nome;
	private double Doacao=0;
	private char Pago='N';

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome = nome;
	}
	public double getDoacao() {
		return Doacao;
	}
	public void setDoacao(double doacao) {
		this.Doacao = doacao;
	}
	public char getPago() {
		return Pago;
	}
	public void setPago(char c) {
		this.Pago = c;
	}
	
	public Aluno(String nome, double doação){
		setNome(nome);
		setDoacao(doação);
		Aluno.vaquinha+=this.Doacao;
	}
	
	public String toString() {
		return "Aluno: "+this.Nome+" fez uma doação de R$ "+this.Doacao+". Muito obrigado."+"\n"+
				"Com a sua doação ja temos R$ "+Aluno.vaquinha;
	}
	static void gerarRelatorioPgto(Aluno[] aluno) {
		
	}
}
