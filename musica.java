import java.util.Date;
import javax.swing.JOptionPane;

public class musica {
	String nome;
	String artista;
	Date Tempo_atual;
	String Duracao;
	String Genero;
	
	void CriarMusica(String nome, String artista, String duracao, String genero){
		this.nome=nome;
		this.artista=artista;
		this.Duracao=duracao;
		this.Genero=genero;
	}
	void play() {
		int minutos, segundos;
		for (minutos=0; minutos<60; minutos++) {
			for (segundos=0; segundos<60; segundos++) {
				System.out.println(minutos+":"+segundos);
				try {
					Thread.sleep(1000);
					if (minutos==3) {
						System.exit(0);
					}
				}catch (InterruptedException erro) {
						erro.toString();
				}
			}
			
		}
	}
	
	public static void main(String[] args){
		musica teste= new musica();
		teste.CriarMusica("Minha 1 musica", "Eu mesmo", "03:00", "ah seilamano");
		teste.play();
	}
}

