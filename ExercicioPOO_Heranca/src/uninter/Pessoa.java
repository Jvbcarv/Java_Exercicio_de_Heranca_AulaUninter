package uninter;

//Superclasse
public class Pessoa { 
	 private String nome;
	    private String cpf;
	    private int idade;
	    
	    //construtor, usado para inicializar um objeto do tipo Pessoa:
	    //O this serve para diferenciar o atributo da variável passada como parâmetro.
	    public Pessoa(String nome, String cpf, int idade) {
	        this.nome = nome;
	        this.cpf = cpf;
	        this.idade = idade;
	    }

	    // Getters e Setters: permitem acessar e modificar os valores dos atributos privados de forma segura.
	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getCpf() {
	        return cpf;
	    }

	    public void setCpf(String cpf) {
	        this.cpf = cpf;
	    }

	    public int getIdade() {
	        return idade;
	    }

	    public void setIdade(int idade) {
	        this.idade = idade;
	    }

	    public void exibirDados() {
	        System.out.println("Nome: " + nome);
	        System.out.println("CPF: " + cpf);
	        System.out.println("Idade: " + idade);
	    }
	
	
}
