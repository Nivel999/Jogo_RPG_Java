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
        Scanner scanner = new Scanner(System.in);
        CrudJogador crud = new CrudJogador(scanner);
        int opcao = 0;

        while (opcao != 6) {
            System.out.println("\n====== Menu Principal ======");
            System.out.println("1- Adicionar Jogador");
            System.out.println("2- Listar Jogadores");
            System.out.println("3- Atualizar Jogador");
            System.out.println("4- Excluir Jogador");
            System.out.println("5- Jogar");
            System.out.println("6- Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    crud.adicionarJogador();
                    break;
                case 2:
                    crud.listarJogadores();
                    break;
                case 3:
                    crud.atualizarJogador();
                    break;
                case 4:
                    crud.excluirJogador();
                    break;
                case 5:
                    Jogador jogador = crud.selecionarJogadorParaJogar();
                    if (jogador != null) {
                        iniciarJogo(jogador, scanner);
                    }
                    break;
                case 6:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

    private static void iniciarJogo(Jogador jogador, Scanner scanner) {
        Personagem personagem = new Personagem(0, 1, 0, 0);
        Arqueiro arqueiro = new Arqueiro();
        Mago mago = new Mago();
        Guerreiro guerreiro = new Guerreiro();

        personagem.setNome(jogador.getNome());
        arqueiro.setNome(jogador.getNome());
        mago.setNome(jogador.getNome());
        guerreiro.setNome(jogador.getNome());
        personagem.setTipoClasse(jogador.getTipoClasse());

        System.out.println("\nIniciando jogo com " + jogador.getNome() + " (" + jogador.getNomeClasse() + ")");

        Batalha batalha = new Batalha();

        Orc orc = new Orc();
        if (!batalha.BatalhaOrc(personagem, arqueiro, mago, guerreiro, orc)) return;

        Goblin goblin = new Goblin();
        if (!batalha.BatalhaGoblin(personagem, arqueiro, mago, guerreiro, goblin)) return;

        Kraken kraken = new Kraken();
        if (!batalha.BatalhaKraken(personagem, arqueiro, mago, guerreiro, kraken)) return;

        System.out.println("\nParabéns, " + personagem.getNome() + "! Você derrotou todos os inimigos e venceu o jogo!");
    }
}
