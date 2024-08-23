
package SistemaLampadaCommand;

public class ControleRemoto {
    private Comando comandoAtual;

    public void definirComando(Comando comando){
        this.comandoAtual = comando;
    }
    public void pressionarBotao(){
            if(comandoAtual != null){
                comandoAtual.executar();
            }
    }
    public void pressionarBotaoDesfazer(){
        if(comandoAtual != null){
            comandoAtual.desfazer();
        }
    }   
}
