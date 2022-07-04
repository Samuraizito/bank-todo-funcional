
public class ClassTest {


	public static void main(String[] args) {
		
	ContaCorrente cliente = new ContaCorrente(111, 111);
	cliente.deposita(1000);
	cliente.saca(10);
	
	System.out.println();
	
	ContaPoupanca cliente1 = new ContaPoupanca(222, 222);
	
	System.out.println();
	
	cliente1.deposita(200);
	
	cliente.transferir(10.0, cliente1);
	System.out.println(cliente1.getSaldo());
	System.out.println(cliente.getSaldo());
	}
}
