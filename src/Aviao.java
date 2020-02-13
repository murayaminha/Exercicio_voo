public class Aviao implements Voador {
    private int horasDeVoo;

    public Aviao(int horasDeVoo) {
        this.horasDeVoo = horasDeVoo;
    }
    public Aviao(){}

    @Override
    public void voar() {
        this.horasDeVoo+=13;
        System.out.println("Estou voando como um avião");
    }
}

