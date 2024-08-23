
package com.mycompany.sistemaluzes;

public class Lampada {
    private boolean ligada;

    public Lampada() {
        this.ligada = false;
    }
    public void ligar(){
        if(!ligada){
            ligada = true;
            System.out.println("Lampada ligada.");       
        }else {
            System.out.println("Lampada ja esta ligada!");
        }
    }
    public void desligar(){
        if(ligada){
            ligada = false;
            System.out.println("Lampada desligada.");
        }else {
            System.out.println("Lampada ja esta desligada");
        }    
    }
    public boolean isLigada() {
        return ligada;
    }
    public void setLampada(boolean Lampada) {
        this.ligada = Lampada;
    }      
}
