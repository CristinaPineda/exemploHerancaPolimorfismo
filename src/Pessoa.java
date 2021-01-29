import java.util.Date;

public class Pessoa {
	protected String nome;
	protected String cpf;
	protected Date dataNascimento;
	
	public Pessoa(String nome, String cpf, Date data) {
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = data;
}

	public String imprimirDados() {
		return "Nome: "+nome+"\n"+"CPF: "+cpf+"\n"+"Data de nascimento: :"+dataNascimento;
	}
}

