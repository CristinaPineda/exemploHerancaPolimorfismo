import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Aluno aluno = new Aluno("Rafael", "123.456.789-00", new Date(), "1234567");
		System.out.println(aluno.imprimirDados());
		aluno.calculoMedia(10, 5);
		System.out.println("A média do aluno "+aluno.nome+": "+aluno.getMedia());
		
		//usando o overload
		double[] notas = new double[] {10, 3.4, 4.6, 3};
		aluno.calculoMedia(notas);
		System.out.println("A média do aluno "+aluno.nome+": "+aluno.getMedia());
 		
		Professor professor = new Professor("José", "987.654.321-00", new Date(), 50, "POO");
		System.out.println(professor.imprimirDados());
		double salario = professor.calculaSalario(10);
		System.out.println("O salário do professor "+professor.nome+": "+salario);
		
		Pessoa alunoPolimorfico = new Aluno("Val", "123.456.789-00", new Date(), "1234568");
		System.out.println(alunoPolimorfico.imprimirDados());
		((Aluno) alunoPolimorfico).calculoMedia(10, 8);
		System.out.println("A média do aluno "+alunoPolimorfico.nome+": "+((Aluno)alunoPolimorfico).getMedia());
		
		Pessoa professorPolimorfico = new Professor("Max", "987.654.322-00", new Date(), 70, "Java");
		System.out.println(professorPolimorfico.imprimirDados());
		double salario2 = ((Professor) professorPolimorfico).calculaSalario(20);
		System.out.println("O salário do professor "+professorPolimorfico.nome+": "+salario2);
		
	}

}
