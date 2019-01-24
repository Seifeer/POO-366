package cartao;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class teste {
	public static void main(String[] args) {
		SimpleDateFormat DataFormatada = new SimpleDateFormat("MM/yyyy");
		Date dataHoje = new Date();
		String validade1 = DataFormatada.format(dataHoje);
		System.out.println(validade1);
	}
}
