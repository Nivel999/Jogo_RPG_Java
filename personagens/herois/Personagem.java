package personagens.herois;

public class Personagem {
    private int TipoClasse;
    private String nome;

    public int setTipoClasse(int TipoClasse) {
        this.TipoClasse = TipoClasse;
        
        switch (this.TipoClasse) {
            case 1:
                System.out.println("você é um Arqueiro ");
                return TipoClasse;
            case 2:
                System.out.println("você é um Guerreiro ");
                return TipoClasse;
            case 3:
                System.out.println("você é um Mago ");
                return TipoClasse;
            default:
                System.out.println("Opção inválida");
                return TipoClasse;
        }
    }

    public String setNome(String nome){
        this.nome = nome;
        System.out.println("Seu nome é " + nome);
        return nome;
    }

}
