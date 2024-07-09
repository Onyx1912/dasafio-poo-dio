package br.br.com.dio.desafio.dominio;

public class Desafio {

    private String title;
    private String description;
    private String language;
    private String level;

    public Desafio(String title, String description, String language, String level) {
        this.title = title;
        this.description = description;
        this.language = language;
        this.level = level;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}