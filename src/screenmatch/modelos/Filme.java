package screenmatch.modelos;

public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluindoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: "+ nome);
        System.out.println("Ano de lançamento: "+ anoDeLancamento);
    }
    void avaliaFilme(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;}

}
