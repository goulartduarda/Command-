
package com.mycompany.sistemaluzes;

public class SistemaLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        ControleCentral controle = new ControleCentral(lampada);
        
        controle.ligarLampada();
        controle.ligarLampada();
        controle.desligarLampada();
        controle.desligarLampada();
        
        System.out.println("Lampada ligada? "+ controle.isLampadaLigada());
      
    }    
}
