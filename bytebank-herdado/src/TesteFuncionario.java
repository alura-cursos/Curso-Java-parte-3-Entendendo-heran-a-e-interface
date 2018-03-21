public class TesteFuncionario {

	public static void main(String[] args) {

		Funcionario nico = new EditorVideo();

		nico.setNome("Nico Steppat");
		nico.setCpf("223355646-9");
		nico.setSalario(2590.80);

		System.out.println(nico.getNome());
		System.out.println(nico.getBonificacao());

	}

}