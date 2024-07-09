package br.br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Dev {

    private String name;
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    private Set<Desafio> desafiosIniciados = new LinkedHashSet<>();
    private Set<Desafio> desafiosConcluidos = new LinkedHashSet<>();

    public Dev(String name) {
        this.name = name;
    }

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getConteudos());
        bootcamp.inscreverDev(this);
    }

    public void iniciarDesafio(Desafio desafio) {
        this.desafiosIniciados.add(desafio);
    }

    public void concluirDesafio(Desafio desafio) {
        this.desafiosConcluidos.add(desafio);
        this.desafiosIniciados.remove(desafio);
    }

    public void progress() {
        // implement progress logic
    }

    public double calculateTotalXp() {
        // implement calculateTotalXp logic
        return 0;
    }

    public Set<Conteudo> getConteudosInscritos() {
        return conteudosInscritos;
    }

    public Set<Conteudo> getConteudosConcluidos() {
        return conteudosConcluidos;
    }

    public Set<Desafio> getDesafiosIniciados() {
        return desafiosIniciados;
    }

    public Set<Desafio> getDesafiosConcluidos() {
        return desafiosConcluidos;
    }
}