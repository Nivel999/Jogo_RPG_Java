package personagens.herois;

public class Guerreiro extends Personagem {

    public Guerreiro() {
        super(0, 1, 20, 150);
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
    public int atacar() {
        System.out.println("O heroi " + getNome() + " usou ataque e causou " + forca + " de dano!");
        return forca;
    }

    //Corrigir essa habilidade para reduzir o dano recebido
    public int defesa() {
        System.out.println("O heroi " + getNome() + " usou defesa e reduziu o dano recebido em " + forca + "!");
        return forca;
    }

    public int golpeForte() {
        int danoGuerreiro = this.forca * 2;
        System.out.println("O heroi " + getNome() + " usou golpe forte e causou " + danoGuerreiro + " de dano!");
        return danoGuerreiro;
    }
}
