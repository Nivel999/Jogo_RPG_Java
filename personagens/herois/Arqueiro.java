package personagens.herois;

public class Arqueiro {
    // Estrutura do personagem
    private int hp = 100;
    private int forca = 5;
    private int xp;
    private int level = 1;

    //habilidades
    public void ataqueFlecha(){
        System.out.println(forca);
    }

    public int precisao(){
        forca = this.forca * 2;
        return forca;
    }

    public int ataqueMulti(){
        for(int a = 0; a < 3 ; a++){
            System.out.println(forca);
        }
        return forca;
    }
}