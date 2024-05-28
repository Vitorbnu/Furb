public class Main {
    public static void main(String[] args) {

        FilaVetor a = new FilaVetor(20);
        a.inserir("A");
        a.inserir("B");
        a.inserir("C");
        a.inserir("D");
        System.out.println(a.toString());

        FilaVetor b = new FilaVetor(20);

        b.inserir("E");
        b.inserir("F");
        b.inserir("G");
        b.inserir("H");

        System.out.println("-----------------------");

        FilaVetor c = a.criarFilaConcatenada(b);

        System.out.println(c.toString());
    }
}