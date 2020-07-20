package util;

public class TipoStatusExtra{
    protected String nome;
    
    public TipoStatusExtra(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
