package app;
import personagens.herois.Guerreiro;
import personagens.herois.Mago;
import personagens.inimigos.Inimigo;



public class Main{
    public static void main(String[] args) {
        //Criação dos objetos
        Mago mago = new Mago();
        Guerreiro heroi = new Guerreiro();
        Inimigo inimigo = new Inimigo();


        heroi.atacar();
        inimigo.atacar();
        mago.atacar();
              
    }
}