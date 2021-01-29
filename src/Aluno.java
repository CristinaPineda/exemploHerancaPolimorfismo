import java.util.Date;

public class Aluno extends Pessoa{
	private String matricula;
	private double media;
		
	public Aluno(String nome, String cpf, Date data, String matricula) {
		super(nome, cpf, data);
		this.matricula = matricula;
	}
		
	public String imprimirDados() {
		return super.imprimirDados()+"\nMatricula: "+matricula+"\nMédia: "+media+"\n";
	}
	
	public void calculoMedia(double nota1, double nota2) {
		this.media = (nota1 + nota2)/2;
	}
	
	public void calculoMedia(double[] notas) {     // overload - sobrecarga de métodos
		double soma = 0;
		for(int i = 0; i <= notas.length -1; i++) {
			soma += notas[i];
		}
		this.media = soma/notas.length;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public double getMedia() {
		return media;
	}
	
	public void setMedia(double media) {
		this.media = media;
	}
	
}