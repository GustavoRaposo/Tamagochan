package config;

import gui.WaifuWidget;
import gui.WaifuDropdownLabel;
import java.awt.GridLayout;
import java.awt.Toolkit;
import javax.swing.JFrame;
import java.awt.Dimension;import java.awt.Font;

public class ConfiguracaoInicial extends WaifuWidget{
    private JFrame frame;
    
    public ConfiguracaoInicial(){
        super();
        
        frame = new JFrame("Configuração Inicial");
    }
    
    @Override
    public void setup(){
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        
        Font fonte = new Font("Verdana", Font.BOLD, 50);
        
        String[] opcoesLinguagem = {"Português Brasileiro", "English"};
        String[] opcoesResolucao = {""};
        
        WaifuDropdownLabel linguagem = new WaifuDropdownLabel("Linguagem", opcoesLinguagem, fonte);
        WaifuDropdownLabel resolucao = new WaifuDropdownLabel("Resolução Janela", opcoesResolucao, fonte);
        
        
        this.largura = screenSize.width / 4;
        this.altura = screenSize.height / 2;
        //Centraliza a tela horizontalmente
        this.x = (screenSize.width / 2) - (largura / 2);
        //Centraliza a tela verticalmente
        this.y = (screenSize.height / 2) - (altura / 2);
           
        frame.setSize(largura, altura);
        frame.setLocation(x, y);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        
        
        frame.add(linguagem.getLabel().getLabel());
        frame.add(linguagem.getDropdown().getDropdown());
        frame.add(resolucao.getLabel().getLabel());
        frame.add(resolucao.getDropdown().getDropdown());
        
        frame.setLayout(new GridLayout(0, 2));
    }
    
    @Override
    public void renderiza(){
        visivel = !visivel;
        
        frame.setVisible(visivel);
    }
}