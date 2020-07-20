package gui;

import java.awt.Font;
import javax.swing.JLabel;

public class WaifuLabel extends WaifuWidget{
    private String texto;
    private Font fonte;
    private JLabel label;
    
    public WaifuLabel(String texto){
        super();
        
        this.texto = texto;
        this.fonte = fonte;
        this.label = new JLabel(texto);
        
        this.label.setFont(fonte);
    }
    
    public WaifuLabel(String texto, Font fonte){
        super();
        
        this.texto = texto;
        this.fonte = fonte;
        this.label = new JLabel(texto);
        
        this.label.setFont(fonte);
    }

    public String getTexto(){
        return texto;
    }

    public void setTexto(String texto){
        this.texto = texto;
    }

    public Font getFonte(){
        return fonte;
    }

    public void setFonte(Font fonte){
        this.fonte = fonte;
    }

    public JLabel getLabel(){
        return label;
    }

    public void setLabel(JLabel label){
        this.label = label;
    }
    
    @Override
    public void renderiza(){
        visivel = !visivel;
        
        label.setVisible(visivel);
    }
}