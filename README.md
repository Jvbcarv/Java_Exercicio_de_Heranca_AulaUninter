<p>Exercício: Sistema de Cadastro de Pessoas</p>

Você foi contratado para desenvolver um pequeno sistema de cadastro para uma instituição. A instituição precisa registrar informações de Pessoas, que podem ser Alunos ou Professores.<br><br>

Requisitos:<br><br>
1.	Crie uma classe Pessoa com os seguintes atributos:<br>
-	nome (String)<br>
-	cpf (String)<br>
-	idade (int)<br><br>
2.	Crie uma classe Aluno que herda de Pessoa e contém os seguintes atributos adicionais:<br>
-	matricula (String)<br>
-	curso (String)<br><br>
3.	Crie uma classe Professor que herda de Pessoa e contém os seguintes atributos adicionais:<br>
-	salario (double)<br>
-	disciplina (String)<br><br>
4.	Todas as classes devem conter:<br>
-	Construtor<br>
-	Métodos get e set<br>
-	Um método exibirDados() que imprime todos os dados do objeto<br><br>
5.	Crie uma classe Main com o método main, que:<br>
-	Crie um objeto Aluno e um objeto Professor<br>
-	Atribua valores aos atributos<br>
-	Chame o método exibirDados() para exibir as informações de cada objeto<br><br>
<br><br>
Dica:<br>
Você deve utilizar o recurso de herança para evitar repetição de código entre as classes Aluno e Professor, já que ambas são tipos de Pessoa.<br>

Resolução - Saída do console:

![image](https://github.com/user-attachments/assets/1a3c0d88-b89d-4773-8d84-3dda9891dcf3)
