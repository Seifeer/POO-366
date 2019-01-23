import javax.swing.JOptionPane;

public class lampada {
	long cod_barras;
	String marca;
	double potencia;
	double consumo;
	String estado;
	double preço;
	
	void acende() {
		if (estado=="apagado")
			estado="aceso";
	}
	void apaga() {
		if (estado=="aceso)")
			estado="apagado";
	}
	String mostraestado() {
		if (estado=="aceso")
			return "Lampada acesa";
		else
			return "Lampada apadada";
	}
}
