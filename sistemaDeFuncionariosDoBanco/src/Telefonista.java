public class Telefonista extends FuncionariosDoBanco {
	
	private int codigoDeEstacao;
	
	public Telefonista() {
		this.codigoDeEstacao = 0;
	}
	
	public Telefonista(double salarios, String nomes, int codigoDeEstacao) {
		super(salarios, nomes);
		this.codigoDeEstacao = codigoDeEstacao;
	}

	public int getCodigoDeEstacao() {
		return codigoDeEstacao;
	}

	public void setCodigoDeEstacao(int codigoDeEstacao) {
		this.codigoDeEstacao = codigoDeEstacao;
	}
	
	public String imprimeDados() {
		return "Nomes: " + getNomes() + "Salário: " + getSalarios() + 
				"Código de Estação: " + getCodigoDeEstacao();
	}

}
