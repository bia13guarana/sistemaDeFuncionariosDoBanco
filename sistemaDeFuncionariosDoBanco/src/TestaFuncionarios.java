
public class TestaFuncionarios {

	public static void main(String[] args) {
		
	Gerente g1 = new Gerente(1000.00, "Bia", "bia13", 123);
	System.out.println(g1.imprimeDados());
	
	Telefonista t1 = new Telefonista(1500.00, "Max", 99);
	System.out.println(t1.imprimeDados());
	
	Secretaria s1 = new Secretaria(2.000, "Ana", 190);
	System.out.println(s1.imprimeDados());
	
	}

}
