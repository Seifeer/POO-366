package associacao;
import java.util.Date;

public class pedido {
	private int codigo;
	private Date data;
	private Item item;
	private int quantidade;
	private double valor;
	
	public static int seq=0;
	
	public int getCodigo() {
		return codigo;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public Item getItem() {
		return item;
	}
	
	public void setItem(Item item) {
		this.item = item;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}

	
	public pedido(Date data, Item item, int quantidade) {
		
		this.codigo=++seq;
		this.data = data;
		this.item = item;
		if (quantidade<=item.getQtd_Estoque()){
			this.quantidade = quantidade;
			item.setQtd_Estoque(item.getQtd_Estoque()-quantidade);
			this.valor = valor*item.getPreço_Unt();
		}else {
			this.quantidade=0;
			this.valor=0;
		}
	}

	@Override
	public String toString() {
		return 	"data=" + data +"\n"+
				"item=" + item.getDescricao() + "\n"+
				"quantidade=" + quantidade + "\n"+
				"valor=" + valor;
	}
	
	
	
}
