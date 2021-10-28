//é um funcionário, ele herda da classe funcionário
public class EditorVideo extends Funcionario {
	
	@Override
	public double getBonificacao() {
		System.out.println("bonificação do editor de video");
		return 150;
	}
	
}
