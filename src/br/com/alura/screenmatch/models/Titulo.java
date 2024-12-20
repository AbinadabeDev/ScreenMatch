package br.com.alura.screenmatch.models;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Titulo implements Classificavel {
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    public String getNome() {
        return nome;
    }
    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }
    public boolean IncluidoNoPlano() {
        return incluidoNoPlano;
    }
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }
    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void exibeFichaTecnica(){
        System.out.println("Nome: " + nome);
        System.out.println("Ano de lancamento: " + anoDeLancamento);
    }
    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }
    public double obterMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int getClassificacao() {
        return 0;
    }
}
