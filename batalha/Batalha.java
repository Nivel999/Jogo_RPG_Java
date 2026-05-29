package batalha;

import java.util.Scanner;
import personagens.herois.*;
import personagens.inimigos.*;

public class Batalha {

    public boolean BatalhaOrc(Personagem personagem, Arqueiro arqueiro, Mago mago, Guerreiro guerreiro, Orc orc) {
        Scanner scanner = new Scanner(System.in);
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
                int danoInimigo = orc.getForca();
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

            int hpHeroiOrc = 0;
            switch (personagem.getTipoClasse()) {
                case 1: hpHeroiOrc = arqueiro.getHp(); break;
                case 2: hpHeroiOrc = mago.getHp(); break;
                case 3: hpHeroiOrc = guerreiro.getHp(); break;
            }
            if (hpHeroiOrc <= 0) {
                System.out.println("\nVocê foi derrotado pelo Orc...");
                return false;
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
        return true;
    }

    public boolean BatalhaGoblin(Personagem personagem, Arqueiro arqueiro, Mago mago, Guerreiro guerreiro, Goblin goblin) {
        Scanner scanner = new Scanner(System.in);
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

            goblin.receberDano(dano);

            if (goblin.getHp() > 0) {
                System.out.println("\n--- Turno do Goblin ---");
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

            int hpHeroiGoblin = 0;
            switch (personagem.getTipoClasse()) {
                case 1: hpHeroiGoblin = arqueiro.getHp(); break;
                case 2: hpHeroiGoblin = mago.getHp(); break;
                case 3: hpHeroiGoblin = guerreiro.getHp(); break;
            }
            if (hpHeroiGoblin <= 0) {
                System.out.println("\nVocê foi derrotado pelo Goblin...");
                return false;
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
        return true;
    }
    

    public boolean BatalhaKraken(Personagem personagem, Arqueiro arqueiro, Mago mago, Guerreiro guerreiro, Kraken kraken) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("A batalha começou entre " + personagem.getNome() + " e o Kraken!");

        while (kraken.getHp() > 0) {
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

            kraken.receberDano(dano);

            if (kraken.getHp() > 0) {
                System.out.println("\n--- Turno do Kraken ---");
                
                java.util.Random random = new java.util.Random();
                int chance = random.nextInt(2); // 0 ou 1
                int danoInimigo = 0;
                if (chance == 0) {
                    danoInimigo = kraken.golpeDeTentaculo();
                } else if (chance == 1) {
                    danoInimigo = kraken.invocacaoDaTsunami();
                }
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

            int hpHeroiKraken = 0;
            switch (personagem.getTipoClasse()) {
                case 1: hpHeroiKraken = arqueiro.getHp(); break;
                case 2: hpHeroiKraken = mago.getHp(); break;
                case 3: hpHeroiKraken = guerreiro.getHp(); break;
            }
            if (hpHeroiKraken <= 0) {
                System.out.println("\nVocê foi derrotado pelo Kraken...");
                return false;
            }

            
        }

        System.out.println("\nVocê venceu! O Kraken foi derrotado.");

        //Sistema de XP e Level Up
        switch (personagem.getTipoClasse()) {
            case 1:
                arqueiro.receberXp(kraken.getXp());
                arqueiro.subirNivel();
                break;
            case 2:
                mago.receberXp(kraken.getXp());
                mago.subirNivel();
                break;
            case 3:
                guerreiro.receberXp(kraken.getXp());
                guerreiro.subirNivel();
                break;
        }
        return true;
    
    }
}
