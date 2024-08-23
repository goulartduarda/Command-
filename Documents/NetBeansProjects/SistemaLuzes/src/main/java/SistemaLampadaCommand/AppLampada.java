
package SistemaLampadaCommand;


public class AppLampada {
    public static void main(String[] args) {
        Lampada lampada = new Lampada();
        
        Comando comandoLigar = new ComandoLigarLampada(lampada);
        Comando comandoDesligar = new ComandoDesligarLuz(lampada);
        
        ControleRemoto controle = new ControleRemoto();
        
        controle.definirComando(comandoLigar);
        controle.pressionarBotao();
        controle.pressionarBotaoDesfazer();
        
        controle.definirComando(comandoDesligar);
        controle.pressionarBotao();
        controle.pressionarBotaoDesfazer();
    }
    
}
