package personagens.inimigos;

public class Kraken {
    private int hp = 500;
    private int forca = 20;
    private int xp = 30000;

    //habilidades 
    public int golpeDeTentaculo(){
        int danoKraken = this.forca * 2; 
        System.out.println("O Kraken ergueu seus tentáculos gigantes e causou " + danoKraken + " de dano esmagador!");
        return danoKraken;
    }

    public int invocacaoDaTsunami(){
        int danoKraken = this.forca + 25;
        System.out.println("O mar se revolta! O Kraken invocou uma Tsunami que causou " + danoKraken + " de dano!");
        return danoKraken;
    }
}