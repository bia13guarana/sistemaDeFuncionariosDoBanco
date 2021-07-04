public class Secretaria extends FuncionariosDoBanco {
	
		private int ramal;
		
		public Secretaria() {
			this.ramal = 0;
		}
		
		public Secretaria(double salarios, String nomes, int ramal) {
			super(salarios, nomes);
			this.ramal = ramal;
		}

		public int getRamal() {
			return ramal;
		}

		public void setRamal(int ramal) {
			this.ramal = ramal;
		}
		
		public String imprimeDados() {
			return "Nomes: " + getNomes() + "Salário: " + getSalarios() + 
					"Ramal: " + getRamal();
		}
		
}
