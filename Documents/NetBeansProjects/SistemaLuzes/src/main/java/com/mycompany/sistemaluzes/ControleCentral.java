
package com.mycompany.sistemaluzes;


public class ControleCentral {
    private Lampada lampada;

    public ControleCentral(Lampada lampada) {
        this.lampada = lampada;
    }
    public void ligarLampada(){
        lampada.ligar();
    }
    public void desligarLampada(){
        lampada.desligar();
    }
    public boolean isLampadaLigada(){
        return lampada.isLigada();
    }

    public Lampada getLampada() {
        return lampada;
    }

    public void setLampada(Lampada lampada) {
        this.lampada = lampada;
    }
    
    
}
