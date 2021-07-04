public class Gerente extends FuncionariosDoBanco {

		private String login;
		private int senha;
		
		public Gerente() {
			this.login = null;
			this.senha = 0;
		}
		
		public Gerente(double salarios, String nomes, String login, int senha) {
			super(salarios, nomes);
			this.login = login;
			this.senha = senha;
		}

		public String getLogin() {
			return login;
		}

		public void setLogin(String login) {
			this.login = login;
		}

		public int getSenha() {
			return senha;
		}

		public void setSenha(int senha) {
			this.senha = senha;
		}
		
		public String imprimeDados() {
			return "Nomes: " + getNomes() + "Salário: " + getSalarios() + "Login: " + getLogin() + 
					"Senha: " + getSenha();
		}
		
}
