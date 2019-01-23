import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class calendario {
	public static void main(String[] args){
		//TODO Auto-generated method stub
		Date dataHoje= new Date();
		System.out.println(dataHoje);
		Calendar d1= Calendar.getInstance();
		d1.set(2018,  11, 25);
		Date natal = d1.getTime();
		System.out.println(natal);
		boolean hojeénatal = dataHoje.equals(natal);
		boolean dataposterior = dataHoje.after(natal);
		boolean dataanterior = dataHoje.before(natal);
		System.out.println(hojeénatal);
		System.out.println(dataposterior);
		System.out.println(dataanterior);
		SimpleDateFormat datanormal = new SimpleDateFormat("dd/MM/yyyy");
		String dataHojeOk = datanormal.format(dataHoje);
		System.out.println(dataHojeOk);
		String dataString = "15/12/2014";
		SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
		Date data= null;
		try {
			data= df.parse(dataString);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			System.out.println("Erro de conversao");
		}
		System.out.println(data);
	}
}
