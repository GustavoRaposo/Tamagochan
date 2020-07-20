package itens;

import util.Categoria;
import util.StatusExtra;

public class Comida extends Alimento{
    public Comida(){
        
    }
    
    public Comida(String nome, Float preco, Integer pontosRestauracao, Categoria categoria, StatusExtra buffDebuff){
        super(nome, preco, pontosRestauracao, categoria, buffDebuff);
    }
}
