package app;

import batalha.Batalha;
import java.util.Scanner;
import personagens.herois.Arqueiro;
import personagens.herois.Guerreiro;
import personagens.herois.Mago;
import personagens.herois.Personagem;
import personagens.inimigos.*;

public class Main {

    public static void main(String[] args) {
        //Criação dos objetos
        Personagem personagem = new Personagem();
        Arqueiro arqueiro = new Arqueiro(personagem);
        Mago mago = new Mago(personagem);
        Guerreiro guerreiro = new Guerreiro(personagem);
        Kraken Kraken = new Kraken();
        Scanner scanner = new Scanner(System.in);

        //Selecionar o nome
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        personagem.setNome(nome);
        System.out.println("Nome do personagem: " + personagem.getNome());

        // Limpar a tela
        System.out.print("\033[H\033[2J");
        System.out.flush();

        String resposta = "N";
        while (resposta.equalsIgnoreCase("N")) {
            //Selecionar a Classe
            System.out.println("Selecione sua classe:");
            System.out.println("1- Arqueiro:");
            System.out.println("2- Mago:");
            System.out.println("3- Guerreiro:");
            int opcao = scanner.nextInt();

            // Limpar a tela
            System.out.print("\033[H\033[2J");
            System.out.flush();

            personagem.setTipoClasse(opcao);
            System.out.println("Suas habilidades são: ");
            switch (personagem.getTipoClasse()) {
                case 1:
                    System.out.println("Arqueiro: \n hp: 100 \n força: 10");
                    System.out.println("- Ataque Flecha");
                    System.out.println("- Precisão");
                    System.out.println("- Ataque Multi");
                    break;
                case 2:
                    System.out.println("Mago: \n hp: 80 \n força: 30");
                    System.out.println("- Bola de Fogo");
                    System.out.println("- Tempestade de Gelo");
                    System.out.println("- Refletir");
                    break;
                case 3:
                    System.out.println("Guerreiro: \n hp: 150 \n força: 20");
                    System.out.println("- Ataque");
                    System.out.println("- Defesa");
                    System.out.println("- Golpe Forte");
                    break;
                default:
                    System.out.println("Opção inválida");
            }

            System.out.println("Deseja escolher outra classe? (S/N)");
            resposta = scanner.next();
        }

        // Iniciar a batalha
        Batalha batalha = new Batalha();
        Orc orc = new Orc();
        batalha.BatalhaOrc(personagem, arqueiro, mago, guerreiro, orc);

        Goblin goblin = new Goblin();
        batalha.BatalhaGoblin(personagem, arqueiro, mago, guerreiro, goblin);

        Kraken kraken = new Kraken();
        batalha.BatalhaKraken(personagem, arqueiro, mago, guerreiro, kraken);

        //Fim de jogo
        System.out.println("\nParabéns, " + personagem.getNome() + "! Você derrotou todos os inimigos e venceu o jogo!");

    }
}
