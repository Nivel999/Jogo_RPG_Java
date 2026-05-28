package personagens.herois;

public class Mago {

    // Estrutura do personagem
    private int hp = 100;
    private int forca = 30;
    private int baseHp = 100;
    private int baseForca = 30;
    private int xp;
    private int level = 1;
    private Personagem personagem;

    public Mago(Personagem personagem) {
        this.personagem = personagem;
    }

    //Receber dano
    public int receberDano(int danoInimigo) {
        hp -= danoInimigo;
        System.out.println("O heroi " + personagem.getNome() + " recebeu " + danoInimigo + " de dano e agora tem " + hp + " de HP!");
        return hp;
    }

    //Receber xp
    public int receberXp(int xpInimigo) {
        xp += xpInimigo;
        System.out.println("O heroi " + personagem.getNome() + " recebeu " + xpInimigo + " de XP e agora tem " + xp + " de XP!");
        return xp;
    }

    //Subir de nível
    public int subirNivel() {
        if (xp >= 1000) {
            level++;
            hp += 20;
            forca += 5;
            baseHp = hp;
            baseForca = forca;
            xp -= 1000;
            System.out.println("O heroi " + personagem.getNome() + " subiu para o nível " + level + "! HP aumentado para " + hp + " e força aumentada para " + forca + "!");
        } else {
            System.out.println("O heroi " + personagem.getNome() + " precisa de mais XP para subir de nível! XP atual: " + xp);
        }
        return level;
    }

    //Resetar status para o estado base do nível atual
    public void resetStatus() {
        hp = baseHp;
        forca = baseForca;
        System.out.println("O status de " + personagem.getNome() + " foi resetado para os valores base do nível " + level + "!");
    }

    //Habilidades
    public int boladefogo() {
        System.out.println("O heroi " + personagem.getNome() + " usou Bola de Fogo e causou " + forca + " de dano!");
        return forca;
    }

    public int refletir() {
        System.out.println("O heroi " + personagem.getNome() + " usou Refletir e refletiu o ataque do inimigo!");
        return 0;
    }

    public int tempestadeDeGelo() {
        int danoMago = this.forca * 2;
        System.out.println("O heroi " + personagem.getNome() + " usou Tempestade de Gelo e causou " + danoMago + " de dano!");
        return danoMago;
    }
}
