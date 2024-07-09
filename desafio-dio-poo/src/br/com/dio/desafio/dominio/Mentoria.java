package br.br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate date;

    public Mentoria(String titulo, String descricao, LocalDate date) {
        super(titulo, descricao);
        this.date = date;
    }

    @Override
    public double calculateXp() {
        return getXpPadrao() + 20;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}