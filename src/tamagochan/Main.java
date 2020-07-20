/*Se estiver tendo problemas com o pacote é só descomentar o package com.company
e comentar o package tamagochan*/
//package com.company;
package tamagochan;

import config.ConfiguracaoInicial;
import gui.Janela;
import gui.WaifuTray;

public class Main{
    public static void main(String[] args){
        ConfiguracaoInicial configInicial = new ConfiguracaoInicial();
        
        configInicial.setup();
        configInicial.renderiza();
        
        /*
        WaifuTray waifuTray = new WaifuTray();
        Janela janela = new Janela("Tamago-chan", 0, 0, 800, 600);
        
        //waifuTray.start();
        
        janela.setup();
        janela.renderiza();
        */
    }
}