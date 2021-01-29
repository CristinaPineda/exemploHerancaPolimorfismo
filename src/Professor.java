import java.util.Date;


public class Professor extends Pessoa {
	private double valorHoraAula;
	private String disciplina;
	
	public Professor(String nome, String cpf, Date data, double valorHoraAula, String disciplina) {
		super(nome, cpf,data);
		this.valorHoraAula = valorHoraAula;
		this.disciplina = disciplina;
	}
	
	public double calculaSalario(int quantidadeHorasTrabalhadas) {
		double salario = 0;
		salario = valorHoraAula * quantidadeHorasTrabalhadas;
		return salario;
	}
	
	public String imprimirDados() {
		return "Valor da hora aula: "+valorHoraAula+"\nDisciplina: "+disciplina+"\n";
	}
	
}
