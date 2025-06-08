package uninter;

//Classe de teste
public class Main {

	public static void main(String[] args) {       

			//dados necessários para o construtor:
			Aluno aluno = new Aluno("Ana Silva", "123.456.789-00", 20, "202501", "Engenharia");
	        Professor professor = new Professor("Carlos Lima", "987.654.321-00", 45, 4500.00, "Matemática");

	        
	        System.out.println("Dados do Aluno:");
	        aluno.exibirDados();

	        System.out.println("\nDados do Professor:");
	        professor.exibirDados();

	}

}
