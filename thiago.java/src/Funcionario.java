package thiago;

public class Funcionario {

    // Atributos (variáveis de instância)
    public String nome;
    public String funcao;
    private String cpf;

    // Construtor
    public Funcionario(String nome, String funcao, String cpf) {
        this.nome = nome;
        this.funcao = funcao;
        this.cpf = cpf;
    }

    // Metódos//
    public void funcao() {

        System.out.println(this.nome + " está trabalhando na funcao " + this.funcao);
    }

    public void Horario() {
        System.out.println(this.nome + "está em horário de trabalho no momento!.");
    }

    public void Salario(String mensagem) {
        System.out.println("O trabalhador" + this.nome + "sobe o cpf("
                + this.cpf + "tem o salario" + mensagem);
    }


    }
