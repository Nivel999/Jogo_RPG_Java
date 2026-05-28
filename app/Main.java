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
        Arqueiro arqueiro = new Arqueiro(personagem);
        Mago mago = new Mago();
        Guerreiro guerreiro = new Guerreiro();
        Kraken Kraken = new Kraken();
        Scanner scanner = new Scanner(System.in);
        

        //Selecionar o nome
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        personagem.setNome(nome);
        System.out.println("Nome do personagem: " + personagem.getNome());

        //Selecionar a Classe
        System.out.println("Selecione sua classe:");
        System.out.println("1- Arqueiro:");
        System.out.println("2- Mago:");
        System.out.println("3- Guerreiro:");
        int opcao = scanner.nextInt();
        personagem.setTipoClasse(opcao);
        System.out.println("Classe selecionada: " + personagem.getTipoClasse());
        

              
    }
}