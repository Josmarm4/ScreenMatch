package screenmatch.principal;

import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Episodio;
import screenmatch.modelos.Filme;
import screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
        public static void main(String[] args) {
                Filme meuFilme = new Filme("O poderoso chefão", 1970);
                meuFilme.setDuracaoEmMinutos(180);

//                meuFilme.exibeFichaTecnica();
                meuFilme.avaliaFilme(8);
                meuFilme.avaliaFilme(5);
                meuFilme.avaliaFilme(10);

//                System.out.println(meuFilme.somaDasAvaliacoes);
//                System.out.println("Total de avaliações: "+ meuFilme.getTotalDeAvaliacoes());
//                meuFilme.somaDasAvaliacoes = 10;
//                meuFilme.totalDeAvaliacoes = 1;
//                System.out.println(meuFilme.pegaMedia());
//                System.out.println();

                Serie lost = new Serie("Lost", 2000);
                lost.setTemporadas(10);
                lost.setEpisodiosPorTemporada(10);
                lost.setMinutosPorEpisodio(50);
                System.out.println("Duração para maratonar Lost: "+ lost.getDuracaoEmMinutos() + " minutos\n");

                Filme outroFilme = new Filme("Avatar", 2023);
                outroFilme.setDuracaoEmMinutos(220);

                CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
                calculadora.inclui(meuFilme);
                calculadora.inclui(outroFilme);
                calculadora.inclui(lost);
                System.out.println("Tempo total para maratonar Lost: "+ calculadora.getTempoTotal() + " minutos");

                FiltroRecomendacao filtro = new FiltroRecomendacao();
                filtro.filtra(meuFilme);

                Episodio episodio = new Episodio();
                episodio.setNumero(1);
                episodio.setSerie(lost);
                episodio.setTotalVisualizacao(300);
                filtro.filtra(episodio);

                Filme filmeDoPaulo = new Filme("Dogville", 2003);
                filmeDoPaulo.setDuracaoEmMinutos(200);
                filmeDoPaulo.avaliaFilme(10);

                ArrayList<Filme> listaDeFilmes = new ArrayList<>();
                listaDeFilmes.add(filmeDoPaulo);
                listaDeFilmes.add(meuFilme);
                listaDeFilmes.add(outroFilme);
                System.out.println("Tamanho da lista "+ listaDeFilmes.size());
                System.out.println("Primeiro filme "+ listaDeFilmes.get(0).getNome());
                System.out.println(listaDeFilmes);
                System.out.println("toString do filme: "+ listaDeFilmes.get(0).toString());


        }
}
