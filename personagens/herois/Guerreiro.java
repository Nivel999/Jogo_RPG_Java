package personagens.herois;

public class Guerreiro {

    // Estrutura do personagem
    private int hp = 150;
    private int forca = 20;
    private int baseHp = 150;
    private int baseForca = 20;
    private int xp;
    private int level = 1;
    private Personagem personagem;

    public Guerreiro(Personagem personagem) {
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
    public int atacar() {
        System.out.println("O heroi " + personagem.getNome() + " usou ataque e causou " + forca + " de dano!");
        return forca;
    }

    //Corrigir essa habilidade para reduzir o dano recebido
    public int defesa() {
        System.out.println("O heroi " + personagem.getNome() + " usou defesa e reduziu o dano recebido em " + forca + "!");
        return forca;
    }

    public int golpeForte() {
        int danoGuerreiro = this.forca * 2;
        System.out.println("O heroi " + personagem.getNome() + " usou golpe forte e causou " + danoGuerreiro + " de dano!");
        return danoGuerreiro;
    }
}
