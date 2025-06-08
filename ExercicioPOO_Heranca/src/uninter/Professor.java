package uninter;

//Subclasse Professor
public class Professor extends Pessoa {

	 private double salario;
	    private String disciplina;

	    public Professor(String nome, String cpf, int idade, double salario, String disciplina) {
	        super(nome, cpf, idade);
	        this.salario = salario;
	        this.disciplina = disciplina;
	    }

	    // Getters e Setters
	    public double getSalario() {
	        return salario;
	    }

	    public void setSalario(double salario) {
	        this.salario = salario;
	    }

	    public String getDisciplina() {
	        return disciplina;
	    }

	    public void setDisciplina(String disciplina) {
	        this.disciplina = disciplina;
	    }

	    @Override
	    public void exibirDados() {
	        super.exibirDados();
	        System.out.println("Disciplina: " + disciplina);
	        System.out.printf("Salario: R$ %.2f\n", salario);
	    }
	
}
