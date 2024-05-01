public class Main {
    public static void main(String[] args) {

        ListaEstatica a = new ListaEstatica();

        a.inserir(10);
        a.inserir(20);
        a.inserir(30);
        a.inserir(5);
        a.inserir(7);
        a.inserir(35);
        a.inserir(53);
        a.inserir(555);
        a.inserir(5223);
        a.inserir(222);
        a.inserir(333);
        a.exibir();
        System.out.println("---------------");
        a.retirar(10);
        a.exibir();
        System.out.println("---------------");
        a.liberar();
        a.exibir();
        System.out.println("---------------");
        a.inserir(10);
        a.buscar(10);

    }
}