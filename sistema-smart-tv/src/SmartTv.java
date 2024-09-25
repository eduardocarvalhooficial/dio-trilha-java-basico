public class SmartTv {

    private boolean ligada;
    private int canal;
    private int volume;

    public SmartTv() {
        ligada = false;
        canal = 1;
        volume = 25;
    }

    public boolean isLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void ligar() {
        setLigada(true);
    }

    public void desligar() {
        setLigada(false);
    }

    public void aumentarVolume(){
        volume++;
    }

    public void abaixarVolume(){
        volume--;
    }

    public void mudarCanal(int canal){
        this.setCanal(canal);
    }

}