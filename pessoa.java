import java.util.Date;
import java.util.Calendar;
class pessoa {
	String nome;
	Date data_nasc;
	String nome_mae;
	String naturalidade;
	char sexo;
	Date data_morte;
	double peso_nasc;
	double tamanho;
	String causa_morte;
	
	void morrer (Date morte,String causa) {
		this.data_morte=morte;
		this.causa_morte=causa;
		System.out.println("Data da morte: "+data_morte);
	}
	boolean edemaior(){
		Date dataHoje= new Date();
		Calendar d1= Calendar.getInstance();
		d1.setTime(this.data_nasc);
		d1.add(d1.YEAR,+18);
		if (d1.getTime().after(dataHoje)) {
			return false;
		}else {
			return true;
		}
	}
	
	public static void main(String[] args) {
		pessoa denilson= new pessoa();
		
	}
}
