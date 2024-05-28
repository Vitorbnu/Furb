public class Main {
    public static void main(String[] args) {
        ListaDupla a = new ListaDupla();
        a.inserir("A");
        a.inserir("B");
        a.inserir("C");

        System.out.println(a.toString());

        System.out.println("---------------------");
        a.exibirOrdemInversar();
        System.out.println("--------------------------");
        a.retirar("A");
        System.out.println(a.toString());
    }
}