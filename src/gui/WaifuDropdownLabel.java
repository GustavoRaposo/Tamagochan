package gui;

import java.awt.Font;

public class WaifuDropdownLabel extends WaifuWidget{
    private String textoLabel;
    private String[] opcoesDropdown;
    private Font fonte;
    private WaifuLabel label;
    private WaifuDropdown dropdown;
    
    public WaifuDropdownLabel(String textoLabel, String[] opcoesDropdown, Font fonte){
        super();
        
        this.textoLabel = textoLabel;
        this.opcoesDropdown = opcoesDropdown;
        this.fonte = fonte;
        this.label = new WaifuLabel(textoLabel, fonte);
        this.dropdown = new WaifuDropdown(opcoesDropdown, fonte);
    }

    public String getTextoLabel(){
        return textoLabel;
    }

    public void setTextoLabel(String textoLabel){
        this.textoLabel = textoLabel;
    }

    public String[] getOpcoesDropdown(){
        return opcoesDropdown;
    }

    public void setOpcoesDropdown(String[] opcoesDropdown){
        this.opcoesDropdown = opcoesDropdown;
    }

    public Font getFonte(){
        return fonte;
    }

    public void setFonte(Font fonte){
        this.fonte = fonte;
    }

    public WaifuLabel getLabel(){
        return label;
    }

    public void setLabel(WaifuLabel label){
        this.label = label;
    }

    public WaifuDropdown getDropdown(){
        return dropdown;
    }

    public void setDropdown(WaifuDropdown dropdown){
        this.dropdown = dropdown;
    }
    
    @Override
    public void renderiza(){
        visivel = !visivel;
        
        label.getLabel().setVisible(visivel);
        dropdown.getDropdown().setVisible(visivel);
    }
}