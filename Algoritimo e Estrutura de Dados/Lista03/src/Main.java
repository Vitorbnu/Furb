public class Main {
    public static void main(String[] args) {
        ListaEncadeada l = new ListaEncadeada();
        Integer a = 10;
        l.inserir(a);
        l.inserir(20);
        l.inserir(30);

        System.out.println(l.toString());
    }
}