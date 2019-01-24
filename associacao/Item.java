package associacao;

public class Item{

	private int codigo;
	private String descricao;
	private int qtd_Estoque;
	private double Preço_Unt;
	
	public static int seq=0;
	
	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getQtd_Estoque() {
		return qtd_Estoque;
	}

	public void setQtd_Estoque(int qtd_Estoque) {
		this.qtd_Estoque = qtd_Estoque;
	}

	public double getPreço_Unt() {
		return Preço_Unt;
	}

	public void setPreço_Unt(double preço_Unt) {
		Preço_Unt = preço_Unt;
	}

	
	public Item(String descricao, int qtd_Estoque, double preço_Unt) {
		this.codigo=++seq;
		this.descricao = descricao;
		this.qtd_Estoque = qtd_Estoque;
		this.Preço_Unt = preço_Unt;
	}

	@Override
	public String toString() {
		return "Item [codigo=" + codigo + ", descricao=" + descricao + ", qtd_Estoque=" + qtd_Estoque + ", Preço_Unt="
				+ Preço_Unt + "]";
	}

	
}

