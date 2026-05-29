package personagens.herois;

public class Personagem {

    private int TipoClasse;
    private String nome;
    protected int hp;
    protected int forca;
    protected int baseHp;
    protected int baseForca;
    protected int xp;
    protected int level;

    public Personagem(int xp, int level, int forca, int hp) {
        this.xp = xp;
        this.level = level;
        this.forca = forca;
        this.hp = hp;
        this.baseHp = hp;
        this.baseForca = forca;
    }

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

    public int getHp() {
        return hp;
    }

    public void receberDano(int danoInimigo) {
        hp -= danoInimigo;
        System.out.println("O heroi " + nome + " recebeu " + danoInimigo + " de dano! HP restante: " + hp);
    }
}
