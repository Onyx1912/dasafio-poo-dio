package br.br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {

    private String name;
    private String description;
    private Set<Dev> devsInscritos = new LinkedHashSet<>();
    private Set<Conteudo> conteudos = new LinkedHashSet<>();

    public Bootcamp(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void inscreverDev(Dev dev) {
        this.devsInscritos.add(dev);
    }

    public void addConteudo(Conteudo conteudo) {
        this.conte