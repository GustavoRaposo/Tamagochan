package gui;

public abstract class WaifuWidget{
    protected int x;
    protected int y;
    protected int largura;
    protected int altura;
    protected boolean visivel;
    
    public WaifuWidget(){
        this.x = 0;
        this.y = 0;
        this.largura = 0;
        this.altura = 0;
        this.visivel = false;
    }
    
    public WaifuWidget(int x, int y, int largura, int altura){
        this.x = x;
        this.y = y;
        this.largura = largura;
        this.altura = altura;
        this.visivel = false;
    }

    public int getX(){
        return x;
    }

    public void setX(int x){
        this.x = x;
    }

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y = y;
    }

    public int getLargura(){
        return largura;
    }

    public void setLargura(int largura){
        this.largura = largura;
    }

    public int getAltura(){
        return altura;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public boolean isVisivel(){
        return visivel;
    }

    public void setVisivel(boolean visivel){
        this.visivel = visivel;
    }
    
    public void setup(){
        
    }
    
    public void renderiza(){

    }
}