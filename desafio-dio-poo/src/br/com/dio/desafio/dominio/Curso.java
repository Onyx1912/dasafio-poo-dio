package br.br.com.dio.desafio.dominio;

public class Curso extends Conteudo {

    private int workload;

    public Curso(String titulo, String descricao, int workload) {
        super(titulo, descricao);
        this.workload = workload;
    }

    @Override
    public double calculateXp() {
        return getXpPadrao() * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }
}