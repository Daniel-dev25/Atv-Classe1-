package thiago;

public class Filme {

    // Novo atributo para armazenar o nome do filme (que antes era herdado de Invocacao)
    private String nomeFilme;

    // Atributos privados ("-") do diagrama original:
    private String legendasAudio;
    private int horario;
    private double valores;

    // Atributos públicos ("+") do diagrama original:
    public String Audio;
    public String Exibicao;

    // Construtor atualizado: não chama mais super(), mas recebe o nomeFilme.
    // O construtor é: Filme(nomeFilme, legendasAudio, horario, valores, Audio, Exibicao)
    public Filme(String nomeFilme, String legendasAudio, int horario, double valores, String Audio, String Exibicao) {
        // Inicializa o novo atributo de nome
        this.nomeFilme = nomeFilme;

        this.legendasAudio = legendasAudio;
        this.horario = horario;
        this.valores = valores;
        this.Audio = Audio;
        this.Exibicao = Exibicao;
    }

    // Métodos (Funções) Públicas ("+") do diagrama original:
    public void Exibicao() {
        System.out.println("Filme em exibição. Detalhes: " + this.Exibicao + ", Horário: " + this.horario);
    }

    // Método Feedback (atualizado para usar o nomeFilme)
    public void Feedback() {
        // Usa getNomeFilme()
        System.out.println("Feedback sobre o Filme '" + getNomeFilme() + "' registrado.");
    }

    // NOVO: Getter para o nome do filme (substitui getNomeBase())
    public String getNomeFilme() {
        return nomeFilme;
    }

    // Getters e Setters para atributos privados
    public String getLegendasAudio() {
        return legendasAudio;
    }

    public void setLegendasAudio(String legendasAudio) {
        this.legendasAudio = legendasAudio;
    }

    public int getHorario() {
        return horario;
    }

    public void setHorario(int horario) {
        this.horario = horario;
    }

    public double getValores() {
        return valores;
    }

    public void setValores(double valores) {
        this.valores = valores;
    }
}