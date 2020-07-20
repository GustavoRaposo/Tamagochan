package player;

import itens.Bebida;
import itens.Comida;
import java.util.ArrayList;

public class Inventario{
    private ArrayList<Comida> comidas;
    private ArrayList<Bebida> bebidas;
    
    public Inventario(){
        
    }
    
    public ArrayList<Comida> getComidas(){
        return comidas;
    }

    public void setComidas(ArrayList<Comida> comidas){
        this.comidas = comidas;
    }

    public ArrayList<Bebida> getBebidas(){
        return bebidas;
    }

    public void setBebidas(ArrayList<Bebida> bebidas){
        this.bebidas = bebidas;
    }
    
    public void addComida(Comida comida){
        comidas.add(comida);
    }
    
    public void removeComidaEspecifica(Comida comida){
        comidas.remove(comida);
    }
    
    
    //Implementar esssa função depois
    //É praticamente um print de todas as comidas e escolher o número da comida a ser retirada
    public Comida removeComida(){
        Comida comidaRetirada = new Comida();
        
        for(int i = 0; i < comidas.size(); i ++){
            System.out.println(i + ") " + comidas.get(i));
        }
        
        return comidaRetirada;
    }
    
    public void addBebida(Bebida bebida){
        bebidas.add(bebida);
    }
    
    public void removeBebidaEspecifica(Bebida bebida){
        bebidas.remove(bebida);
    }
    
    
    //Implementar esssa função depois
    //É praticamente um print de todas as bebidas e escolher o número da bebida a ser retirada
    public Bebida removeBebida(){
        Bebida bebidaRetirada = new Bebida();
        
        for(int i = 0; i < comidas.size(); i ++){
            System.out.println(i + ") " + comidas.get(i));
        }
        
        return bebidaRetirada;
    }
}