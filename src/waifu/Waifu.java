package waifu;

import itens.Alimento;
import itens.Bebida;
import itens.Comida;
import java.util.ArrayList;
import util.StatusExtra;

public class Waifu{
    private String name;
    private Integer nivel;
    private Integer expericencia;
    private Integer vida;
    private Integer maxVida;
    private Integer mana;
    private Integer maxMana;
    private Integer fome;
    private Integer maxFome;
    private Integer sede;
    private Integer maxSede;
    private Integer energia;
    private Integer maxEnergia;
    private Integer afeto;
    private Integer idade;
    private Boolean acordado;
    private String genero;
    private String humor;
    private String personalidade;
    private StatusExtra statusExtra;
    private ArrayList<Alimento> gostosAlimento;

    public Waifu(){
        
    }
    
    public Waifu(String name, Integer nivel, Integer expericencia,
                 Integer maxVida, Integer maxMana, Integer maxFome, Integer maxSede, Integer maxEnergia, 
                 Integer afeto, Integer idade, Boolean acordado, String genero, String humor, String personalidade, ArrayList<Alimento> gostosAlimento){
        this.name = name;
        this.nivel = nivel;
        this.expericencia = expericencia;
        this.vida = maxVida;
        this.mana = maxMana;
        this.fome = maxFome;
        this.sede = maxSede;
        this.energia = maxEnergia;
        this.afeto = afeto;
        this.idade = idade;
        this.acordado = acordado;
        this.genero = genero;
        this.humor = humor;
        this.personalidade = personalidade;
        this.statusExtra = null;
        this.gostosAlimento = gostosAlimento;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public Integer getNivel(){
        return nivel;
    }

    public void setNivel(Integer nivel){
        this.nivel = nivel;
    }

    public Integer getExpericencia(){
        return expericencia;
    }

    public void setExpericencia(Integer expericencia){
        this.expericencia = expericencia;
    }

    public Integer getVida(){
        return vida;
    }

    public void setVida(Integer vida){
        this.vida = vida;
    }

    public Integer getMana(){
        return mana;
    }

    public void setMana(Integer mana){
        this.mana = mana;
    }

    public Integer getFome(){
        return fome;
    }

    public void setFome(Integer fome){
        this.fome = fome;
    }

    public Integer getSede(){
        return sede;
    }

    public void setSede(Integer sede){
        this.sede = sede;
    }

    public Integer getEnergia(){
        return energia;
    }

    public void setEnergia(Integer energia){
        this.energia = energia;
    }

    public Integer getAfeto(){
        return afeto;
    }

    public void setAfeto(Integer afeto){
        this.afeto = afeto;
    }

    public Integer getIdade(){
        return idade;
    }

    public void setIdade(Integer idade){
        this.idade = idade;
    }

    public Boolean getAcordado(){
        return acordado;
    }

    public void setAcordado(Boolean acordado){
        this.acordado = acordado;
    }

    public String getGenero(){
        return genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public String getHumor(){
        return humor;
    }

    public void setHumor(String humor){
        this.humor = humor;
    }

    public String getPersonalidade(){
        return personalidade;
    }

    public void setPersonalidade(String personalidade){
        this.personalidade = personalidade;
    }
    
    public StatusExtra getStatusExtra(){
        return statusExtra;
    }
    
    public void setStatusExtra(StatusExtra statusExtra){
        this.statusExtra = statusExtra;
    }
    
    public ArrayList<Alimento> getGostoAlimentos(){
        return gostosAlimento;
    }
    
    public void setGostoAlimento(ArrayList<Alimento> gostosAlimento){
        this.gostosAlimento = gostosAlimento;
    }

    public Integer getMaxVida(){
        return maxVida;
    }

    public void setMaxVida(Integer maxVida){
        this.maxVida = maxVida;
    }

    public Integer getMaxMana(){
        return maxMana;
    }

    public void setMaxMana(Integer maxMana){
        this.maxMana = maxMana;
    }

    public Integer getMaxFome(){
        return maxFome;
    }

    public void setMaxFome(Integer maxFome){
        this.maxFome = maxFome;
    }

    public Integer getMaxSede(){
        return maxSede;
    }

    public void setMaxSede(Integer maxSede){
        this.maxSede = maxSede;
    }

    public Integer getMaxEnergia(){
        return maxEnergia;
    }

    public void setMaxEnergia(Integer maxEnergia){
        this.maxEnergia = maxEnergia;
    }
    
    //Altera um atributo da waifu
    public void alteraAtributo(String atributo, Integer valor){
        if(atributo.equals("afeto")){
            afeto += valor;
        }
        else if(atributo.equals("energia")){
            energia += valor;
        }
        else if(atributo.equals("experiencia")){
            expericencia += valor;
        }
        else if(atributo.equals("fome")){
            fome += valor;
        }
        else if(atributo.equals("mana")){
            mana += valor;
        }
        else if(atributo.equals("sede")){
            sede += valor;
        }
        else if(atributo.equals("vida")){
            vida += valor;
        }
    }
    
    //Diz se a waifu gosta ou não desse alimento, pode ser tanto bebida quanto comida
    public boolean gostoDesseAlimento(Alimento alimento){
        for(Alimento i: gostosAlimento){
            if(i.equals(alimento)){
                return true;
            }
        }
        
        return false;
    }
}
