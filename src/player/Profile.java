package player;

import itens.Alimento;
import itens.Bebida;
import itens.Comida;
import java.util.ArrayList;
import java.util.Scanner;
import waifu.Waifu;

public class Profile{
    private String nome;
    private int nivel;
    private int expericencia;
    private int waifuSelecionada;
    ArrayList<Waifu> waifus;
    private Inventario inventario;
   
    public Profile(String nome){
        this.nome = nome;
        this.nivel = 0;
        this.expericencia = 0;
        this.waifuSelecionada = 0;
        this.waifus = new ArrayList<Waifu>();
        this.inventario = new Inventario();
    }

    public void alimenta(){
        Alimento alimento = new Alimento();
        int escolhaAlimento = -1;
        Scanner input = new Scanner(System.in);
        
        //Mudar isso aqui depois para uma gui, isso é temporário, somente para testes
        while(escolhaAlimento != 1 || escolhaAlimento != 2){
            System.out.println("Escolha uma opção 1) Bebida\n2)Comida");
            escolhaAlimento = Integer.parseInt(input.nextLine());
        }
        
        //Opção para remover bebida
        if(escolhaAlimento == 1){
            alimento = inventario.removeBebida();
        }
        //Remove comida
        else if(escolhaAlimento == 2){
            alimento = inventario.removeComida();
        }
        
        //Fome não está no máximo e o alimento é uma comida
        if(alimento instanceof Comida && waifus.get(waifuSelecionada).getFome() < waifus.get(waifuSelecionada).getMaxFome()){
            //Se o alimento restaurar mais do que a fome máxima, a fome é obrigatóriamente setada para a máxima, buffs e debuffs ignoram a fome máxima
            Integer novaFome = (alimento.getPontosRestauracao() + waifus.get(waifuSelecionada).getFome() >= waifus.get(waifuSelecionada).getMaxFome()) ?
                                waifus.get(waifuSelecionada).getMaxFome() : waifus.get(waifuSelecionada).getFome() + alimento.getPontosRestauracao();
            waifus.get(waifuSelecionada).alteraAtributo("fome", novaFome);
            
            if(alimento.getBuffDebuff() != null){
                alimento.getBuffDebuff().aplica(waifus.get(waifuSelecionada));
            }
        }
        else if(alimento instanceof Bebida && waifus.get(waifuSelecionada).getSede() < waifus.get(waifuSelecionada).getMaxSede()){
            //Se o alimento restaurar mais do que a sede máxima, a sede é obrigatóriamente setada para a máxima, buffs e debuffs ignoram a fome máxima
            Integer novaSede = (alimento.getPontosRestauracao() + waifus.get(waifuSelecionada).getSede() >= waifus.get(waifuSelecionada).getMaxSede()) ?
                                waifus.get(waifuSelecionada).getMaxSede() : waifus.get(waifuSelecionada).getSede() + alimento.getPontosRestauracao();
            waifus.get(waifuSelecionada).alteraAtributo("sede", novaSede);
            
            if(alimento.getBuffDebuff() != null){
                alimento.getBuffDebuff().aplica(waifus.get(waifuSelecionada));
            }
        }
        else{
            //Fazer alguma coisa aqui
            System.out.println("Estou cheia caraio");
        }
    }

    public void acordarDormir(){
        waifus.get(waifuSelecionada).setAcordado(!waifus.get(waifuSelecionada).getAcordado());
    }
}
