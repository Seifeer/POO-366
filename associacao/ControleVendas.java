package associacao;
import java.util.Scanner;
import java.util.Date;

public class ControleVendas {
	public static void main(String[] agrs) {
		//TODO Auto-generated method stub
		
		Date hoje= new Date();
		Item caneta= new Item("caneta",15,1.4);
		pedido p1= new pedido(hoje,caneta,20);
		System.out.println(p1);
		pedido p2= new pedido(hoje,caneta,13);
		System.out.println(p2);
		
	}
}
