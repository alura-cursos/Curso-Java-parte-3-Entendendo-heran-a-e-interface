
public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario nico = new Funcionario();
		nico.setNome("nico steppat");
		nico.setCpf("223355646-9");
		nico.setSalario(2500.80);
		
		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());
	}

}
