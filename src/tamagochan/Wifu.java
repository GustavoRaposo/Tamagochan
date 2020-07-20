package com.company;

public class Wifu {
    private String name;
    private int nivel;
    private int expericencia;
    private int vida;
    private int mana;
    private int fome;
    private int sede;
    private int energia;
    private int afeto;
    private int idade;
    private Boolean acordado;
    private String genero;
    private String humor;
    private String personalidade;

    public Wifu(String name, int nivel, int expericencia, int vida, int mana, int fome, int sede, int energia, int afeto, int idade, Boolean acordado, String genero, String humor, String personalidade) {
        this.name = name;
        this.nivel = nivel;
        this.expericencia = expericencia;
        this.vida = vida;
        this.mana = mana;
        this.fome = fome;
        this.sede = sede;
        this.energia = energia;
        this.afeto = afeto;
        this.idade = idade;
        this.acordado = acordado;
        this.genero = genero;
        this.humor = humor;
        this.personalidade = personalidade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getExpericencia() {
        return expericencia;
    }

    public void setExpericencia(int expericencia) {
        this.expericencia = expericencia;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getFome() {
        return fome;
    }

    public void setFome(int fome) {
        this.fome = fome;
    }

    public int getSede() {
        return sede;
    }

    public void setSede(int sede) {
        this.sede = sede;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public int getAfeto() {
        return afeto;
    }

    public void setAfeto(int afeto) {
        this.afeto = afeto;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Boolean getAcordado() {
        return acordado;
    }

    public void setAcordado(Boolean acordado) {
        this.acordado = acordado;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getHumor() {
        return humor;
    }

    public void setHumor(String humor) {
        this.humor = humor;
    }

    public String getPersonalidade() {
        return personalidade;
    }

    public void setPersonalidade(String personalidade) {
        this.personalidade = personalidade;
    }
}
