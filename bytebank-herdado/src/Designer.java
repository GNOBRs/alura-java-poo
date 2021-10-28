//é um funcionário, ele herda da classe funcionário
public class Designer extends Funcionario {
	
	@Override
	public double getBonificacao() {
		System.out.println("bonificação do designer");
		return 200;
	}
	
}
