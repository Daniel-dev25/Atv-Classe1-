package thiago;

public class Main {
    public static void main(String[] args) {
        // Objetos da classe Usuario
        Usuario novoUsuario = new Usuario("João", 30, "123.456.789-00");

        // Chamando um dos métodos
        novoUsuario.comprar();

        // Criando o segundo objeto para testar
        Usuario novoUsuario2 = new Usuario("Artur", 25, "987.654.321-11");

        // Passando a mensagem diretamente no método//
        novoUsuario2.reclamar("Filme Horrível!");

        // Criando o terceiro objeto para testar
        Usuario novoUsuario3 = new Usuario("Pedro", 18, "123.678.984-56");
        novoUsuario3.devolver(" devolvendo essa merda");
        // Objetos classe Funcionario//
        Funcionario novoFuncionario = new Funcionario("Carlos", "Gerente", "999.888.777-66");
        novoFuncionario.funcao();

        Funcionario novoFuncionario2 = new Funcionario("billy", "Serviços Gerais ", "400.289.227-66");
        novoFuncionario2.funcao();
        Funcionario novoFuncionario3 = new Funcionario("Rivaldo", "Pichador", "723.345.784.21");
        novoFuncionario3.funcao();

        // Classe produto//

        produto novoproduto = new produto("pipoca amanteigada,", "Invocação do mal 4", "Sprite zero 1L");
        novoproduto.degustar();
    }
}



