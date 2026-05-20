package app;
import personagens.herois.Arqueiro;
import personagens.herois.Guerreiro;
import personagens.herois.Mago;
import personagens.herois.Personagem;
import personagens.inimigos.Inimigo;



public class Main{
    public static void main(String[] args) {
        //Criação dos objetos
        Personagem personagem = new Personagem();
        Arqueiro arqueiro = new Arqueiro();
        Mago mago = new Mago();
        Guerreiro heroi = new Guerreiro();
        Inimigo inimigo = new Inimigo();
        


        heroi.atacar();
        inimigo.atacar();
        mago.atacar();
        arqueiro.atacar();
        personagem.setTipoClasse(13);
              
    }
}