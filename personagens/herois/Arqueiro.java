package personagens.herois;

public class Arqueiro {
    // Estrutura do personagem
    private int hp = 100;
    private int forca = 5;
    private int xp;
    private int level = 1;
    private String nome;
    private Personagem personagem;

    public Arqueiro(Personagem personagem) {
        this.personagem = personagem;
    }

    //habilidades
    public int ataqueFlecha(){
        System.out.printf("O heroi %s usou ataqueFlecha e causou %d de dano!", personagem.getNome(), forca);
        return forca;
    }

    public int precisao(){
        forca = this.forca * 2;
        System.out.printf("O heroi %s usou Precisao e aumentou %d de dano!", personagem.getNome(), forca);
        return forca;
    }

    public int ataqueMulti(){
        for(int a = 0; a < 3 ; a++){
            System.out.printf("O heroi %s usou ataqueMulti e causou %d de dano!", personagem.getNome(), forca);
        }
        return forca;
    }
}