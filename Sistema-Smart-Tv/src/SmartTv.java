public class SmartTv {
    boolean ligada = false;
    int canal=1;
    int volume=25;

    /*Criando os metodos que manipula esses estados.*/
    public void mudarCanal(int novoCanal){
        canal = novoCanal;
    }
    public void aumentarCanal(){
        canal++;
    }
    public void diminuirCanal(){
        canal--;
    }
    public void aumentarVolume(){
        volume++;
    }
    public void diminuirVolume(){
        volume--;

    }
    public void ligar(){
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }
}