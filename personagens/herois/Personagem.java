package personagens.herois;

public class Personagem {

    private int TipoClasse;
    private String nome;

    public int setTipoClasse(int TipoClasse) {
        this.TipoClasse = TipoClasse;

        switch (this.TipoClasse) {
            case 1:
                System.out.println(nome + " é um Arqueiro");
                return TipoClasse;
            case 2:
                System.out.println(nome + " é um Guerreiro");
                return TipoClasse;
            case 3:
                System.out.println(nome + " é um Mago");
                return TipoClasse;
            default:
                System.out.println("Opção inválida");
                return TipoClasse;
        }
    }

    public int getTipoClasse() {
        return this.TipoClasse;
    }

    public String setNome(String nome) {
        this.nome = nome;
        return nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void getReceberDano(int dano) {
        {
            System.out.println(nome + " recebeu " + dano + " de dano!");
        }
    }
}
