public class Pato implements Voador{
    private int energia;

    public Pato(int energia) {
        this.energia = energia;
    }
public Pato(){}
    @Override
    public void voar() {
        if (this.energia>=5) {
            this.energia -= 5;
            System.out.println("Estou voando como um pato");
        }
        else {
            System.out.println("Pato está cansado, não irá voar");
        }
    }
}
