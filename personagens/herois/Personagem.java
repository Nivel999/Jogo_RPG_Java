package personagens.herois;

public class Personagem {
    int TipoClasse;
    String nome;

    public int TipoClasse(int TipoClasse, String nome) {
        switch (TipoClasse) {
            case 1:
                System.out.printf("%s você é um guerreiro", nome);
                TipoClasse = 1;

                break;
            case 2:
                System.out.println("Você é Mago");
                break;
            default:
                System.out.println("Não é nada");
        }

        return TipoClasse;
    }

}
