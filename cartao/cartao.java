package cartao;

import java.util.Calendar;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class cartao {
	private int numero;
	private String bandeira;
	private String validade;
	private String titular;
	private double renda_mensal;
	private double limite_total;
	private double limite_compras;
	private int senha;
	
	//Estáticos
	public static int num_cliente=0;
	public static int con_cartoes=0;
	public static double total_compras=0;
	
	//Getters e Setters
	public String getTitular() {
		return titular;
	}
	
	public int getSenha() {
		return senha;
	}
	
	public int getNumero() {
		return numero;
	}
	
	public String getValidade() {
		return validade;
	}
	
	public double getRenda_mensal() {
		return renda_mensal;
	}
	
	public void setRenda_mensal(double renda_mensal) {
		this.renda_mensal=renda_mensal;
	}
	
	public double getLimite_total() {
		return limite_total;
	}
	
	public double getLimite_compras() {
		return limite_compras;
	}
	
	public String getBandeira() {
		return this.bandeira;
	}
	
	//metodos
	public void comprar(String data_compra, double valor, int senha) {
		cartao.total_compras+=valor;
		this.limite_compras-=valor;
	}
	
	//Construtor
	public cartao(String titular, int senha, double renda_mensal, String Bandeira) {
		this.limite_total=(renda_mensal*80)/100;
		this.limite_compras=this.limite_total;
		this.titular=titular;
		Date dataHoje = new Date();
		SimpleDateFormat DataFormatada = new SimpleDateFormat("MM/yyyy");
		String validade = DataFormatada.format(dataHoje);
		this.validade=validade;
		this.bandeira=Bandeira;
		this.senha=senha;
		this.renda_mensal=renda_mensal;
		this.numero=++cartao.num_cliente;
		cartao.total_compras=0;
		cartao.con_cartoes++;
	}

	//ToString
	@Override
	public String toString() {
		return 	"numero=" + numero +"\n"+
				"bandeira=" + bandeira +"\n"+
				"validade=" + validade +"\n"+
				"titular=" + titular +"\n"+
				"renda_mensal=" + renda_mensal +"\n"+
				"limite_total=" + limite_total +"\n"+
				"limite_compras=" + limite_compras;
	}
	
	
}

