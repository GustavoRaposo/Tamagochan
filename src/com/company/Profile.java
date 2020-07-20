package com.company;

import java.util.ArrayList;

public class Profile {
    ArrayList<Wifu> wifus;
    private Wifu wifu;
    private int nivel;
    private int expericencia;
    private int comida;
    private int bebida;

    public Profile(ArrayList<Wifu> wifus, Wifu wifu, int nivel, int expericencia) {
        this.wifus = wifus;
        this.wifu = wifu;
        this.nivel = nivel;
        this.expericencia = expericencia;
    }

    public void darComida() {
        if (wifu.getFome() == 10) {
            comida--;
            return;
        } else {
            comida--;
            wifu.setFome(wifu.getFome() + 1);
        }
    }

    public void darBebida() {
        if (wifu.getSede() == 10) {
            bebida--;
            return;
        } else {
            bebida--;
            wifu.setSede(wifu.getSede() + 1);
        }
    }

    public void acordarDormir() {
        if (wifu.getAcordado() == true) {
            wifu.setAcordado(false);
        } else wifu.setAcordado(true);
    }
}
