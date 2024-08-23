
package SistemaLampadaCommand;

public class ComandoLigarLampada implements Comando{
    private Lampada lampada;

    public ComandoLigarLampada(Lampada lampada) {
        this.lampada = lampada;
    }
    
    

    @Override
    public void executar() {
        lampada.ligar();
    }

    @Override
    public void desfazer() {
        lampada.desligar();
    }
       
}
