package util;

import waifu.Waifu;

public abstract class StatusExtra{
    protected String nome;
    //Número de pontos que o buff/debuff vai afetar
    protected Integer pontos;
    protected Integer duracao;
    //O tipo do status extra é no que o buff/debuff vai afetar, fome, energia, afeto, etc...
    protected TipoStatusExtra tipo;
    
    public StatusExtra(String nome, Integer duracao){
        this.nome = nome;
        this.duracao = duracao;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public Integer getPontos(){
        return pontos;
    }
    
    public void setPontos(Integer pontos){
        this.pontos = pontos;
    }
    
    public Integer getDuracao(){
        return duracao;
    }
    
    public void setDuracao(Integer duracao){
        this.duracao = duracao;
    }
    
    public TipoStatusExtra getTipo(){
        return tipo;
    }
    
    public void setTipo(TipoStatusExtra tipo){
        this.tipo = tipo;
    }
    
    //Método para aplicar buff ou debuff, depende do que cada item faz
    public void aplica(Waifu waifu){
        //Inicia um contador para aplicar o buff/debuff na waifu e no atributo dela
        new ThreadStatusExtra(duracao, waifu, tipo.getNome(), pontos).start();
    }    
}
