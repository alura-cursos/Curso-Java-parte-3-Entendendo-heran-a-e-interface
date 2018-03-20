public class Gerente extends Funcionario {

	private int senha;
	
	@Override
	public double getBonificacao() {
	    return super.getBonificacao() + super.getSalario();
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

}