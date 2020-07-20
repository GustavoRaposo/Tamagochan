package gui;

import static com.sun.javafx.PlatformUtil.isWindows;
import java.awt.Dimension;
import java.awt.GraphicsConfiguration;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.Window;
import javax.swing.JFrame;;

public class Janela extends WaifuWidget{
    private String titulo;
    private JFrame frame;
    
    public Janela(){
        super();
        
        this.x = 0;
        this.y = 0;
        this.largura = 600;
        this.altura = 200;
        this.frame = new JFrame("Tamago-chan");
    }
    
    public Janela(String titulo, int x, int y, int largura, int altura){
        super(x, y, largura, altura);
        
        this.titulo = titulo;
        this.frame = new JFrame(titulo);
    }
    
    @Override
    public void setup(){
        //Dimensões da janela
        frame.setSize(largura, altura);
        //Sempre deixar ela renderizando no topo de todas as aplicações
        frame.setAlwaysOnTop(true);
        //Define onde a janela será renderizada se baseando na posição padrão do sistema operacional
        frame.setLocationByPlatform(true);
        //Remove a barra superior da janela
        frame.setUndecorated(true);
        //Define finalizar o programa como ação ao fechar a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Aplicativo rodando em windows precisa considerar o tamanho da task bar para 
        //poder posicionar o frame no canto inferior direito
        if(isWindows()){
            //Remove o ícone da task bar
            frame.setType(Window.Type.UTILITY);
            //Tamanho total da tela principal
            Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
            //Obtém informações sobre a task bar
            Insets scnMax = Toolkit.getDefaultToolkit().getScreenInsets(frame.getGraphicsConfiguration());
            //Armazena o tamanho da task bart
            int taskBarSize = scnMax.bottom;
            
            //largura da tela - largura da janela
            x = screenSize.width - frame.getWidth();
            //altura da tela - altura da task bar - altura da janela
            y = screenSize.height - taskBarSize - frame.getHeight();    
        }
        //Linux e outros SO (eu acho que os outros não kk, não tenho mac poar)
        //não precisam considerar a task bar, mas isso depende do desktop sendo utilizado, no caso do linux
        else{
            GraphicsConfiguration config = frame.getGraphicsConfiguration();
            //Obtém os limites da tela
            Rectangle bounds = config.getBounds();
            
            //largura da tela - largura da janela
            x = bounds.width - frame.getWidth();
            //altura da tela - altura da janela
            y = bounds.height - frame.getHeight();
        }
        
        //Posiciona a janela nas coordenadas específicas
        frame.setLocation(x, y);
    }
    
    @Override
    public void renderiza(){
        //Inverte a visibilidade da janela
        visivel = !visivel;
        
        //Atualiza a visibilidade da janela
        frame.setVisible(visivel);
    }   
}