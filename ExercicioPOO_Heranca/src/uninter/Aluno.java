package uninter;

//Subclasse Aluno
public class Aluno extends Pessoa { //extends: a classe Aluno herda  os atributos que estão na classe Pessoa
	private String matricula;
    private String curso;

    public Aluno(String nome, String cpf, int idade, String matricula, String curso) {
        super(nome, cpf, idade);  //super: chama o construtor da superclasse
        this.matricula = matricula;
        this.curso = curso;
    }

    // Get e Set 
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void exibirDados() {
        super.exibirDados();
        System.out.println("Matricula: " + matricula);
        System.out.println("Curso: " + curso);
    }
	
}
