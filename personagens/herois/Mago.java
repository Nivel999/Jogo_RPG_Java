package personagens.herois;

public class Mago extends Personagem {

    public Mago() {
        super(0, 1, 30, 100);
    }

    //Receber xp
    public int receberXp(int xpInimigo) {
        xp += xpInimigo;
        System.out.println("O heroi " + getNome() + " recebeu " + xpInimigo + " de XP e agora tem " + xp + " de XP!");
        return xp;
    }

    //Subir de nível
    public int subirNivel() {
        while (xp >= 1000) {
            level++;
            hp += 20;
            forca += 5;
            baseHp = hp;
            baseForca = forca;
            xp -= 1000;
            System.out.println("O heroi " + getNome() + " subiu para o nível " + level + "! HP aumentado para " + hp + " e força aumentada para " + forca + "!");
        }
        return level;
    }

    //Habilidades
    public int boladefogo() {
        System.out.println("O heroi " + getNome() + " usou Bola de Fogo e causou " + forca + " de dano!");
        return forca;
    }

    public int refletir() {
        System.out.println("O heroi " + getNome() + " usou Refletir e refletiu o ataque do inimigo!");
        return 0;
    }

    public int tempestadeDeGelo() {
        int danoMago = this.forca * 2;
        System.out.println("O heroi " + getNome() + " usou Tempestade de Gelo e causou " + danoMago + " de dano!");
        return danoMago;
    }
}
