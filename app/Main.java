package app;

import java.util.Scanner;
import personagens.herois.Arqueiro;
import personagens.herois.Guerreiro;
import personagens.herois.Mago;
import personagens.herois.Personagem;
import personagens.inimigos.*;


public class Main{
    public static void main(String[] args) {
        //Criação dos objetos
        Personagem personagem = new Personagem();
        Arqueiro arqueiro = new Arqueiro();
        Mago mago = new Mago();
        Guerreiro guerreiro = new Guerreiro();
        Kraken Kraken = new Kraken();

        Scanner scanner = new Scanner(System.in);
        


        guerreiro.atacar();
        Kraken.golpeDeTentaculo();
        mago.boladefogo();
        arqueiro.ataqueFlecha();
        arqueiro.precisao();
        arqueiro.ataqueFlecha();
        arqueiro.ataqueMulti();
        
        int setTipoClasse = scanner.nextInt();
        personagem.setTipoClasse(setTipoClasse);
        personagem.setNome("Baltazar");
        

              
    }
}