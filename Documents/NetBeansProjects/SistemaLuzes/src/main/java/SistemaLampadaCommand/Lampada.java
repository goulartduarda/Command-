package SistemaLampadaCommand;


public class Lampada {
    private boolean ligada;

    public Lampada() {
        this.ligada = false;
    }
    public void ligar(){
        if(!ligada){
            ligada = true;
            System.out.println("Luz ligada.");
        }else {
            System.out.println("A luz ja esta ligada!");
        }
    }
    public void desligar(){
        if(ligada){
            ligada = false;
            System.out.println("Luz desligada.");
        }else {
            System.out.println("A luz ja esta desligada");
        }
    }
    public boolean isLigada(){
        return ligada;
    }      
}
