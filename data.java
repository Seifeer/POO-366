
public class data {
	//Construtor:
	//Conta(){
	//}
	public static void main(String[] args) {
		//TODO Auto-generated method stub
		
		RegistroAcademicoSemConstrutor maria = new RegistroAcademicoSemContstrutor();
		RegistroAcademicoSemConstrutor joao = new RegistroAcademicoSemContstrutor();
		maria.inicializaRegistroAcademico("Maria", 1234, 2);
		
		System.out.println(maria.CalculaMensalidade());
		System.out.println(joao.CalculaMensalidade());
	}
}
