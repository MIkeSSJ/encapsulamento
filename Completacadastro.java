
public class CompletaCadastro {
	public static void main(String[] args) {

		Cadastro nome = new Cadastro();
		Cadastro idade = new Cadastro();
		Cadastro sexo = new Cadastro();

		nome.setNome("Mike Queiroz Oliveria");
		idade.setIdade(1986);
		sexo.setSexo("Homem");

		System.out.println("Seu nome é " + nome.getNome());

		System.out.println("Você tem " + idade.getIdade() + " anos");

		System.out.println("Você se define como " + sexo.getSexo());

	}
}
