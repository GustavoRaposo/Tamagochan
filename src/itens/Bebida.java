package itens;

import util.Categoria;
import util.StatusExtra;

public class Bebida extends Alimento{
    public Bebida(){
        
    }
    
    public Bebida(String nome, Float preco, Integer pontosRestauracao, Categoria categoria, StatusExtra buffDebuff){
        super(nome, preco, pontosRestauracao, categoria, buffDebuff);
    }
}
