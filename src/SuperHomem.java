public class SuperHomem implements Voador {
    private int experiencia;

    public SuperHomem(int experiencia) {
        this.experiencia = experiencia;
    }
    public SuperHomem(){}

    @Override
    public void voar() {
        this.experiencia+=3;
        System.out.println("Estou voando como um campeão");
    }
}
