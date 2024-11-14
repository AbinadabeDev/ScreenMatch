import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.models.Filme;
import br.com.alura.screenmatch.models.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("God Of War");
        meuFilme.setAnoDeLancamento(2025);
        meuFilme.setDuracaoEmMinutos(120);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.obterMedia());


        Serie Suits = new Serie();
        Suits.setNome("Suits");
        Suits.setAnoDeLancamento(2016);
        Suits.exibeFichaTecnica();
        Suits.setTemporadas(10);
        Suits.setEpisodiosPorTemporada(15);
        Suits.setMinutosPorEpisodio(45);

        System.out.println("Duração para Maratonar Suits: " + Suits.getDuracaoEmMinutos());

        Filme outroFilme = new Filme();
        outroFilme.setNome("Snoopy");
        outroFilme.setAnoDeLancamento(2024);
        outroFilme.setDuracaoEmMinutos(180);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(Suits);
        System.out.println(calculadora.getTempoTotal());
    }
}