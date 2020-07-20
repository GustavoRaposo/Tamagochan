package gui;

import java.awt.Font;
import javax.swing.JComboBox;

public class WaifuDropdown extends WaifuWidget{
    private JComboBox dropdown;
    private String[] opcoes;
    private Font fonte;
    
    public WaifuDropdown(String[] opcoes){
        super();
        
        this.opcoes = opcoes;
        this.fonte = fonte;
        this.dropdown = new JComboBox(opcoes);
        
        this.dropdown.setFont(fonte);
    }
    
    public WaifuDropdown(String[] opcoes, Font fonte){
        super();
        
        this.opcoes = opcoes;
        this.fonte = fonte;
        this.dropdown = new JComboBox(opcoes);
        
        this.dropdown.setFont(fonte);
    }

    public JComboBox getDropdown(){
        return dropdown;
    }

    public void setDropdown(JComboBox dropdown){
        this.dropdown = dropdown;
    }

    public String[] getOpcoes(){
        return opcoes;
    }

    public void setOpcoes(String[] opcoes){
        this.opcoes = opcoes;
    }

    public Font getFonte(){
        return fonte;
    }

    public void setFonte(Font fonte){
        this.fonte = fonte;
    }
    
    
    
    @Override
    public void renderiza(){
        visivel = !visivel;
        
        getDropdown().setVisible(visivel);
    }
}