package personagens.herois;

public class Mago {
    // Estrutura do personagem
    private int hp = 100;
    private int forca = 30;
    private int xp;
    private int level = 1;

    public void boladefogo() {
        System.out.println(forca);
    }

    public void refletir() {
        System.out.println("Mago refletiu o ataque do inimigo");
        
    }
}