import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.nome = "Top Gun:Maverick";
        meuFilme.anoDeLancamento = 2022;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());
    }
}
