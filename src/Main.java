package thiago;

import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class Main {

    // Método auxiliar para pausar a execução e esperar a confirmação
    private static void pausarEConfirmar(Scanner scanner, String proximoBloco) {
        System.out.println("\n---------------------------------------------");
        System.out.println("Pressione ENTER para continuar com: " + proximoBloco + "...");
        // Lê a linha (espera o usuário digitar algo e pressionar Enter)
        scanner.nextLine();
        System.out.println("---------------------------------------------");
    }

    public static void main(String[] args) {

        // Cria um objeto Scanner para ler a entrada do teclado
        Scanner scanner = new Scanner(System.in);

        System.out.println("=============================================");
        System.out.println("        INÍCIO DO TESTE INTERATIVO         ");
        System.out.println("=============================================");


        // --- 1. Teste da Classe Usuario ---
        pausarEConfirmar(scanner, "1. TESTE DA CLASSE USUARIO");
        System.out.println("\n--- 1. Teste: USUARIO ---");

        // Objetos da classe Usuario
        Usuario novoUsuario = new Usuario("João", 30, "123.456.789-00");
        Usuario novoUsuario2 = new Usuario("Artur", 25, "987.654.321-11");
        Usuario novoUsuario3 = new Usuario("Pedro", 18, "123.678.984-56");

        // Chamando métodos
        novoUsuario.comprar();
        novoUsuario2.reclamar("Filme Horrível!");
        novoUsuario3.devolver("devolvendo essa merda");


        // --- 2. Teste da Classe Funcionario ---
        pausarEConfirmar(scanner, "2. TESTE DA CLASSE FUNCIONARIO");
        System.out.println("\n--- 2. Teste: FUNCIONARIO ---");

        // Objetos classe Funcionario
        Funcionario novoFuncionario = new Funcionario("Carlos", "Gerente", "999.888.777-66");
        Funcionario novoFuncionario2 = new Funcionario("billy", "Serviços Gerais ", "400.289.227-66");
        Funcionario novoFuncionario3 = new Funcionario("Rivaldo", "Pichador", "723.345.784.21");

        novoFuncionario.funcao();
        novoFuncionario2.funcao();
        novoFuncionario3.funcao();


        // --- 3. Teste da Classe produto (minúsculo) ---
        pausarEConfirmar(scanner, "3. TESTE DA CLASSE PRODUTO");
        System.out.println("\n--- 3. Teste: PRODUTO ---");

        // Classe produto
        produto novoproduto = new produto("pipoca amanteigada,", "Invocação do mal 4", "Sprite zero 1L");
        novoproduto.degustar();


        // --- 4. Teste da Classe FILME INVOCACAO DO MAL 04 ---
        pausarEConfirmar(scanner, "4. TESTE DA CLASSE FILME");
        System.out.println("\n--- 4. Teste: FILME (Invocação do mal 04) ---");

        // 1. Criando uma instância da classe Filme
        Filme invocacaoFilme = new Filme(
                "Invocação do Mal 04",
                "Português (BR)/Inglês",
                2230,
                35.50,
                "Dublado",
                "Sala Premium 3D"
        );

        // Acessando e exibindo informações do Filme:
        System.out.println("Nome do Filme: " + invocacaoFilme.getNomeFilme());
        System.out.println("Preço: R$" + invocacaoFilme.getValores());

        // Chamando métodos públicos:
        invocacaoFilme.Exibicao();
        invocacaoFilme.Feedback();


        // --- 5. Teste da Classe Despesa ---
        pausarEConfirmar(scanner, "5. TESTE DA CLASSE DESPESA");
        System.out.println("\n--- 5. Teste: DESPESA ---");

        // 2. Criando uma instância da classe Despesa
        Despesa despesaMensal = new Despesa(
                "30 dias",
                1500.75,
                "000000123456",
                "Pendente"
        );

        // Acessando e exibindo informações da Despesa:
        System.out.println("Valor: R$" + despesaMensal.getValores());

        // Chamando o método público:
        despesaMensal.pagamento();

        // Exemplo de atualização de um atributo privado via Setter:
        despesaMensal.setBaixa("Concluída");
        System.out.println("Status da Baixa ATUALIZADO: " + despesaMensal.getBaixa());

        // Fecha o objeto Scanner para evitar vazamento de recursos
        scanner.close();

        System.out.println("\n=============================================");
        System.out.println("       TODOS OS TESTES FORAM CONCLUÍDOS.      ");
        System.out.println("=============================================");
    }
}