import br.com.alura.screenmatch.Episodios;
import br.com.alura.screenmatch.calculo.CalculoDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelo.Filme;
import br.com.alura.screenmatch.modelo.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970) ;
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(7);
        meuFilme.avalia(5);

        System.out.println("A soma das avaliações é: " + meuFilme.getSomaDasAvaliacoes());
        System.out.println("O total de avaliações é: " + meuFilme.getTotalDeAvaliacoes());
        //System.out.println(meuFilme.totalDeAvaliacoes); -- Como estava antes;
        //System.out.println(meuFilme.pegaMedia());

        Serie suits = new Serie();
        suits.setNome("Suits");
        suits.setAnoDeLancamento(2011);
        suits.setMinutosPorEpsodio(54);
        suits.exibeFichaTecnica();
        suits.setTemporadas(5);
        suits.setEpsodiosPorTemporada(25);
        System.out.println("\n duração para maratonar: " + suits.getDuracaoEmMinutos());

        Filme JohnWick = new Filme();
        JohnWick.setNome("John Wick");
        JohnWick.setAnoDeLancamento(1979) ;
        JohnWick.setDuracaoEmMinutos(88);

        CalculoDeTempo calculadora = new CalculoDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(JohnWick);
        calculadora.inclui(suits);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodios epsodio = new Episodios();
        epsodio.setNumero(1);
        epsodio.setSerie(suits);
        epsodio.setTotalVisualizacoes(300);
        filtro.filtra(epsodio);





    }
}
