package app;
import personagens.herois.Arqueiro;
import personagens.herois.Guerreiro;
import personagens.herois.Mago;
import personagens.herois.Personagem;
import personagens.inimigos.Kraken;



public class Main{
    public static void main(String[] args) {
        //Criação dos objetos
        Personagem personagem = new Personagem();
        Arqueiro arqueiro = new Arqueiro();
        Mago mago = new Mago();
        Guerreiro heroi = new Guerreiro();
        Kraken inimigo = new Kraken();
        


        heroi.atacar();
        inimigo.golpeDeTentaculo();
        mago.boladefogo();
        arqueiro.ataqueFlecha();
        arqueiro.precisao();
        arqueiro.ataqueFlecha();
        arqueiro.ataqueMulti();
        
        personagem.TipoClasse(1, "da");

              
    }
}