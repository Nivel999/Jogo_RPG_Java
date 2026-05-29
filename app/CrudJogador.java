package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CrudJogador {
    private List<Jogador> jogadores = new ArrayList<>();
    private Scanner scanner;

    public CrudJogador(Scanner scanner) {
        this.scanner = scanner;
    }

    public void adicionarJogador() {
        System.out.print("Digite o nome do jogador: ");
        String nome = scanner.next();
        int tipoClasse = escolherClasse();
        jogadores.add(new Jogador(nome, tipoClasse));
        System.out.println("Jogador '" + nome + "' adicionado com sucesso!");
    }

    public void listarJogadores() {
        if (jogadores.isEmpty()) {
            System.out.println("Nenhum jogador cadastrado.");
            return;
        }
        System.out.println("\n--- Lista de Jogadores ---");
        for (int i = 0; i < jogadores.size(); i++) {
            Jogador j = jogadores.get(i);
            System.out.println((i + 1) + ". " + j.getNome() + " - " + j.getNomeClasse());
        }
    }

    public void atualizarJogador() {
        listarJogadores();
        if (jogadores.isEmpty()) return;
        System.out.print("Número do jogador a atualizar: ");
        int indice = scanner.nextInt() - 1;
        if (indice < 0 || indice >= jogadores.size()) {
            System.out.println("Número inválido.");
            return;
        }
        Jogador j = jogadores.get(indice);
        System.out.print("Novo nome (atual: " + j.getNome() + "): ");
        String novoNome = scanner.next();
        int novaClasse = escolherClasse();
        j.setNome(novoNome);
        j.setTipoClasse(novaClasse);
        System.out.println("Jogador atualizado com sucesso!");
    }

    public void excluirJogador() {
        listarJogadores();
        if (jogadores.isEmpty()) return;
        System.out.print("Número do jogador a excluir: ");
        int indice = scanner.nextInt() - 1;
        if (indice < 0 || indice >= jogadores.size()) {
            System.out.println("Número inválido.");
            return;
        }
        String nome = jogadores.get(indice).getNome();
        jogadores.remove(indice);
        System.out.println("Jogador '" + nome + "' excluído com sucesso!");
    }

    public Jogador selecionarJogadorParaJogar() {
        listarJogadores();
        if (jogadores.isEmpty()) return null;
        System.out.print("Número do jogador para jogar: ");
        int indice = scanner.nextInt() - 1;
        if (indice < 0 || indice >= jogadores.size()) {
            System.out.println("Número inválido.");
            return null;
        }
        return jogadores.get(indice);
    }

    private int escolherClasse() {
        int classe = 0;
        while (classe < 1 || classe > 3) {
            System.out.println("Escolha a classe:");
            System.out.println("1- Arqueiro  (HP: 100 | Força: 10)");
            System.out.println("2- Mago      (HP: 80  | Força: 30)");
            System.out.println("3- Guerreiro (HP: 150 | Força: 20)");
            classe = scanner.nextInt();
            if (classe < 1 || classe > 3) {
                System.out.println("Opção inválida, tente novamente.");
            }
        }
        return classe;
    }
}
