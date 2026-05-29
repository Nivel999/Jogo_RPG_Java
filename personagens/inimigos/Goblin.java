package personagens.inimigos;

public class Goblin extends Inimigo {

    public Goblin() {
        super(1200, 20, 3500);
    }

    // Métodos de ataque
    public int atacar() {
        System.out.println("Goblin ataca com força: " + getForca());
        return getForca();
    }


}

