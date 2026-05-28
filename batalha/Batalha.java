package batalha;

import java.util.Scanner;
import personagens.herois.*;
import personagens.inimigos.*;

public class Batalha {

    public void BatalhaOrc(Personagem personagem, Arqueiro arqueiro, Mago mago, Guerreiro guerreiro, Orc orc) {
        Scanner scanner = new Scanner(System.in);

        // Reseta o status do herói para os valores base do nível atual
        switch (personagem.getTipoClasse()) {
            case 1: arqueiro.resetStatus(); break;
            case 2: mago.resetStatus(); break;
            case 3: guerreiro.resetStatus(); break;
        }

        System.out.println("A batalha começou entre " + personagem.getNome() + " e o Orc!");

        while (orc.getHp() > 0) {
            System.out.println("\n--- Seu turno ---");

            // Exibe habilidades da classe escolhida
            switch (personagem.getTipoClasse()) {
                case 1:
                    System.out.println("1- Ataque Flecha");
                    System.out.println("2- Precisão");
                    System.out.println("3- Ataque Multi");
                    break;
                case 2:
                    System.out.println("1- Bola de Fogo");
                    System.out.println("2- Tempestade de Gelo");
                    System.out.println("3- Refletir");
                    break;
                case 3:
                    System.out.println("1- Ataque");
                    System.out.println("2- Defesa");
                    System.out.println("3- Golpe Forte");
                    break;
            }

            //Sistema de escolha de habilidade
            int escolha = scanner.nextInt();
            int dano = 0;
            switch (personagem.getTipoClasse()) {
                case 1:
                    if (escolha == 1) {
                        dano = arqueiro.ataqueFlecha();
                    } else if (escolha == 2) {
                        arqueiro.precisao();
                    } else if (escolha == 3) {
                        dano = arqueiro.ataqueMulti();
                    }
                    break;
                case 2:
                    if (escolha == 1) {
                        dano = mago.boladefogo();
                    } else if (escolha == 2) {
                        dano = mago.tempestadeDeGelo();
                    } else if (escolha == 3) {
                        dano = mago.refletir();
                    }
                    break;
                case 3:
                    if (escolha == 1) {
                        dano = guerreiro.atacar();
                    } else if (escolha == 2) {
                        dano = guerreiro.defesa();
                    } else if (escolha == 3) {
                        dano = guerreiro.golpeForte();
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            orc.receberDano(dano);

            if (orc.getHp() > 0) {
                System.out.println("\n--- Turno do Orc ---");
                orc.atacar();
            }
        }

        System.out.println("\nVocê venceu! O Orc foi derrotado.");

        //Sistema de XP e Level Up
        switch (personagem.getTipoClasse()) {
            case 1:
                arqueiro.receberXp(orc.getXp());
                arqueiro.subirNivel();
                break;
            case 2:
                mago.receberXp(orc.getXp());
                mago.subirNivel();
                break;
            case 3:
                guerreiro.receberXp(orc.getXp());
                guerreiro.subirNivel();
                break;
        }
    }

    public void BatalhaGoblin(Personagem personagem, Arqueiro arqueiro, Mago mago, Guerreiro guerreiro, Goblin goblin) {
        Scanner scanner = new Scanner(System.in);

        // Reseta o status do herói para os valores base do nível atual
        switch (personagem.getTipoClasse()) {
            case 1: arqueiro.resetStatus(); break;
            case 2: mago.resetStatus(); break;
            case 3: guerreiro.resetStatus(); break;
        }

        System.out.println("A batalha começou entre " + personagem.getNome() + " e o Goblin!");

        while (goblin.getHp() > 0) {
            System.out.println("\n--- Seu turno ---");

            // Exibe habilidades da classe escolhida
            switch (personagem.getTipoClasse()) {
                case 1:
                    System.out.println("1- Ataque Flecha");
                    System.out.println("2- Precisão");
                    System.out.println("3- Ataque Multi");
                    break;
                case 2:
                    System.out.println("1- Bola de Fogo");
                    System.out.println("2- Tempestade de Gelo");
                    System.out.println("3- Refletir");
                    break;
                case 3:
                    System.out.println("1- Ataque");
                    System.out.println("2- Defesa");
                    System.out.println("3- Golpe Forte");
                    break;
            }

            //Sistema de escolha de habilidade
            int escolha = scanner.nextInt();
            int dano = 0;
            switch (personagem.getTipoClasse()) {
                case 1:
                    if (escolha == 1) {
                        dano = arqueiro.ataqueFlecha();
                    } else if (escolha == 2) {
                        arqueiro.precisao();
                    } else if (escolha == 3) {
                        dano = arqueiro.ataqueMulti();
                    }
                    break;
                case 2:
                    if (escolha == 1) {
                        dano = mago.boladefogo();
                    } else if (escolha == 2) {
                        dano = mago.tempestadeDeGelo();
                    } else if (escolha == 3) {
                        dano = mago.refletir();
                    }
                    break;
                case 3:
                    if (escolha == 1) {
                        dano = guerreiro.atacar();
                    } else if (escolha == 2) {
                        dano = guerreiro.defesa();
                    } else if (escolha == 3) {
                        dano = guerreiro.golpeForte();
                    }
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            // Aplica o dano ao Goblin
            goblin.receberDano(dano);

            if (goblin.getHp() > 0) {
                System.out.println("\n--- Turno do Goblin ---");
                //jogador recebe dano do Goblin
                int danoInimigo = goblin.getForca();
                switch (personagem.getTipoClasse()) {
                    case 1:
                        arqueiro.receberDano(danoInimigo);
                        break;
                    case 2:
                        mago.receberDano(danoInimigo);
                        break;
                    case 3:
                        guerreiro.receberDano(danoInimigo);
                        break;
                }
            }

        }

        System.out.println("\nVocê venceu! O Goblin foi derrotado.");

        //Sistema de XP e Level Up
        switch (personagem.getTipoClasse()) {
            case 1:
                arqueiro.receberXp(goblin.getXp());
                arqueiro.subirNivel();
                break;
            case 2:
                mago.receberXp(goblin.getXp());
                mago.subirNivel();
                break;
            case 3:
                guerreiro.receberXp(goblin.getXp());
                guerreiro.subirNivel();
                break;
        }
    }

    public void BatalhaKraken(Personagem personagem, Arqueiro arqueiro, Mago mago, Guerreiro guerreiro, Kraken kraken) {
        // Implementação da batalha contra o Kraken
    }
}
