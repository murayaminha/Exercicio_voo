public class Main {
    public static void main(String[] args) {
        Aviao aviao = new Aviao(0);
        Pato pato=new Pato(20);
        SuperHomem superHomem=new SuperHomem(10);
        TorreDeControle torreDeControle = new TorreDeControle();
        torreDeControle.adicionarVoador(superHomem);
        torreDeControle.adicionarVoador(aviao);
        torreDeControle.adicionarVoador(pato);
        torreDeControle.voemTodos();
        torreDeControle.voemTodos();
        torreDeControle.voemTodos();
        torreDeControle.voemTodos();
        torreDeControle.voemTodos();
    }
}
