package personagens.inimigos;

public class Inimigo {
    private int hp;
    private int forca;
    private int xp;

    public Inimigo(int hp, int forca, int xp) {
        this.hp = hp;
        this.forca = forca;
        this.xp = xp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getXp() {
        return xp;
    }

    public void setXp(int xp) {
        this.xp = xp;
    }

    public void receberDano(int dano) {
        hp -= dano;
        System.out.println("O inimigo recebeu " + dano + " de dano! HP restante: " + hp);
    }
}
