package app;

public class Jogador {
    private String nome;
    private int tipoClasse;

    public Jogador(String nome, int tipoClasse) {
        this.nome = nome;
        this.tipoClasse = tipoClasse;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getTipoClasse() { return tipoClasse; }
    public void setTipoClasse(int tipoClasse) { this.tipoClasse = tipoClasse; }

    public String getNomeClasse() {
        switch (tipoClasse) {
            case 1: return "Arqueiro";
            case 2: return "Mago";
            case 3: return "Guerreiro";
            default: return "Desconhecido";
        }
    }
}
