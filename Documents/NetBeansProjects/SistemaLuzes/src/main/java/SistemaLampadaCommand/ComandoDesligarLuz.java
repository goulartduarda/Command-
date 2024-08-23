
package SistemaLampadaCommand;

public class ComandoDesligarLuz implements Comando{
    private Lampada lampada;

    public ComandoDesligarLuz(Lampada lampada) {
        this.lampada = lampada;
    }
    
    

    @Override
    public void executar() {
        lampada.desligar();
    }

    @Override
    public void desfazer() {
        lampada.ligar();
    }
    
}
