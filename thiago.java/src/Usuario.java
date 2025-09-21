package thiago;

public class Usuario {

    // Atributos (variáveis de instância)
    public int idade;
    public String nome;
    private String cpf;

    // Construtor
    public Usuario(String nome, int idade, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
    }

    // Métodos (características/comportamentos)
    public void comprar() {
        System.out.println(this.nome + " está realizando uma compra.");
    }

    public void devolver(String mensagem) {
        System.out.println(this.nome + " está devolvendo um produto." + mensagem);
    }

    public void reclamar(String mensagem) {
        System.out.println(this.nome + " está fazendo uma reclamação: " + mensagem);
    }
    // Métodos de acesso para o CPF (getter e setter)
    // Isso é uma boa prática, já q ue o atributo 'cpf' é privado.
    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}