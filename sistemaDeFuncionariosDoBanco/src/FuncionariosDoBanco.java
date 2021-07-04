
public class FuncionariosDoBanco {

		private double salarios;
		private String nomes;
		
		public FuncionariosDoBanco() {
			this.salarios = 0;
			this.nomes = null;
		}
		
		public FuncionariosDoBanco(double salarios, String nomes) {
			this.salarios = salarios;
			this.nomes = nomes;
		}

		public double getSalarios() {
			return salarios;
		}

		public void setSalarios(double salarios) {
			this.salarios = salarios;
		}

		public String getNomes() {
			return nomes;
		}

		public void setNomes(String nomes) {
			this.nomes = nomes;
		}
		
		public String imprimeDados() {
			return "Nome: " + getNomes() + "Salário: " + getSalarios();
		}

}
