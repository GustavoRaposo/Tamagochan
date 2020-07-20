package util;

import java.util.logging.Level;
import java.util.logging.Logger;
import waifu.Waifu;

public class ThreadStatusExtra extends Thread{
    private Integer duracao;
    private Waifu waifu;
    private String atributo;
    private Integer valorAlteracao;
    
    public ThreadStatusExtra(Integer duracao, Waifu waifu, String atributo, Integer valorAlteracao){
        this.duracao = duracao;
        this.waifu = waifu;
        this.atributo = atributo;
        this.valorAlteracao = valorAlteracao;
    }
    
    @Override
    public void run(){
        //Altera o valor do atributo desejado
        waifu.alteraAtributo(atributo, valorAlteracao);
        
        //Espera o tempo do buff/debuff
        try{
            Thread.sleep(duracao);
        }catch(InterruptedException ex){
            Logger.getLogger(StatusExtra.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Remove os valores do buff/debuff
        waifu.alteraAtributo(atributo, -valorAlteracao);
        //Remove o buff/debuff
        waifu.setStatusExtra(null);
    }
}