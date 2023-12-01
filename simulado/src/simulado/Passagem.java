package simulado;

public class Passagem {
	private String nome;
    private String origem;
    private String destino;
    public Passagem(String nome, String origem, String destino) {
        this.nome = nome;
        this.origem = origem;
        this.destino = destino;
    }

    public String getNome() {
        return nome;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }
}

