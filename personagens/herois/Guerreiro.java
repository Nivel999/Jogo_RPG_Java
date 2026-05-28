package personagens.herois;

public class Guerreiro{
    // Estrutura do personagem
    private int hp = 200;
    private int forca = 15;
    private int xp;
    private int level = 1;

    //Habilidades
    public void atacar(){
        System.out.printf("O heroi %s usou ataque e causou %d de dano!", "Guerreiro", forca);
    }

    //Corrigir essa habilidade para reduzir o dano recebido
    public void defesa(){
        System.out.printf("O heroi %s usou defesa e reduziu o dano recebido em %d!", "Guerreiro", forca);
    }

    public void golpeForte(){
        int danoGuerreiro = this.forca * 2;
        System.out.printf("O heroi %s usou golpe forte e causou %d de dano!", "Guerreiro", danoGuerreiro);
    }
}