import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();

        meuFilme.setNome("Top Gun:Maverick");
        meuFilme.setAnoDeLancamento(2022);
        meuFilme.setDuracaoEmMinutos(131);

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar - O Caminho da Agua");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(190);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie serie = new Serie();

        serie.setNome("Lost");
        serie.setTemporadas(10);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(50);
        serie.setAnoDeLancamento(2000);
        serie.exibeFichaTecnica();
        System.out.println("Duração para maratonar Lost: " + serie.getDuracaoEmMinutos());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);
        Episodio episodio = new Episodio();
        episodio.setSerie(serie);
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
