package personagens.inimigos;

public class Orc extends Inimigo {

    public Orc() {
        super(120, 15, 3000);
    }

    // Métodos de ataque
    public void atacar() {
        System.out.println("Orc ataca com força: " + getForca());
    }
}
