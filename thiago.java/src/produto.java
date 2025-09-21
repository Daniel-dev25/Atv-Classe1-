package thiago;

public class produto {

    private String comida;
    private String filme;
    private String bebida;

    public produto (String comida,String filme,String bebida)
    {
        this.comida = comida;
        this.filme = filme;
        this.bebida = bebida;
    }

    public void degustar(){
        System.out.println("Seu ingresso é para o filme " + filme + " e está levando "+ bebida + " e "+comida);
    }

  }