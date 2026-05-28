package personagens.inimigos;

public class Goblin extends Inimigo {

    public Goblin() {
        super(120, 15, 3000);
    }

    // Métodos de ataque
    public void atacar() {
        System.out.println("Goblin ataca com força: " + getForca());
    }
}
