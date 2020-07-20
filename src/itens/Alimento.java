package itens;

import util.Categoria;
import util.StatusExtra;

public class Alimento{
    protected String nome;
    protected Float preco;
    protected Integer pontosRestauracao;
    protected Categoria categoria;
    protected StatusExtra buffDebuff;

    public Alimento(){
        
    }
    
    public Alimento(String nome, Float preco, Integer pontosRestauracao, Categoria categoria, StatusExtra buffDebuff){
        this.nome = nome;
        this.preco = preco;
        this.pontosRestauracao = pontosRestauracao;
        this.categoria = categoria;
        this.buffDebuff = buffDebuff;
    }
    
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Float getPreco(){
        return preco;
    }

    public void setPreco(Float preco){
        this.preco = preco;
    }

    public Integer getPontosRestauracao(){
        return pontosRestauracao;
    }

    public void setPontosRestauracao(Integer pontosRestauracao){
        this.pontosRestauracao = pontosRestauracao;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
    
    public StatusExtra getBuffDebuff(){
        return buffDebuff;
    }
    
    public void setBuffDebuff(){
        this.buffDebuff = buffDebuff;
    }
}