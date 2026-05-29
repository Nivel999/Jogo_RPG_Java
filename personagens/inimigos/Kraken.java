package personagens.inimigos;

public class Kraken extends Inimigo {

    public Kraken() {
        super(5000, 20, 30000);
    }

    //habilidades
    public int golpeDeTentaculo() {
        int danoKraken = getForca() * 2;
        System.out.println("O Kraken ergueu seus tentáculos gigantes e causou " + danoKraken + " de dano esmagador!");
        return danoKraken;
    }

    public int invocacaoDaTsunami() {
        int danoKraken = getForca() + 25;
        System.out.println("O mar se revolta! O Kraken invocou uma Tsunami que causou " + danoKraken + " de dano!");
        return danoKraken;
    }
}