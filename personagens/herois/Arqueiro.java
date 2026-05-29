package personagens.herois;

public class Arqueiro extends Personagem {

    public Arqueiro() {
        super(0, 1, 10, 100);
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


    //habilidades
    public int ataqueFlecha() {
        System.out.println("O heroi " + getNome() + " usou ataqueFlecha e causou " + forca + " de dano!");
        return forca;
    }

    public int precisao() {
        forca = this.forca * 2;
        System.out.println("O heroi " + getNome() + " usou Precisão! Força aumentada para " + forca + "!");
        return 0;
    }

    public int ataqueMulti() {
        int danoArqueiro = this.forca * 3;
        System.out.println("O heroi " + getNome() + " usou ataqueMulti e causou " + danoArqueiro + " de dano em múltiplos alvos!");
        return danoArqueiro;
    }

}
