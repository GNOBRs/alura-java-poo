//gerente é um funcionário, ele herda da classe funcionário, assina o contrato autenticavel
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticacaoUtil autenticador;
	
	public Gerente() {
		this.autenticador = new AutenticacaoUtil();
	}
	
	@Override
	public double getBonificacao() {
		System.out.println("bonificação do gerente");
		return super.getSalario();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	@Override
	public boolean autentica(int senha) {
			return this.autenticador.autentica(senha);
	}
	
}
