package personagens.inimigos;

public class Orc extends Inimigo {

    public Orc() {
        super(200, 20, 3500);
    }

    // Métodos de ataque
    public void atacar() {
        System.out.println("Orc ataca com força: " + getForca());
    }
}
