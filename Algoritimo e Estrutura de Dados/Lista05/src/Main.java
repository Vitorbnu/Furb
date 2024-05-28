public class Main {
    public static void main(String[] args) {

        PilhaVetor a = new PilhaVetor(20);
        a.push("A");
        a.push("B");
        a.push("C");
        a.push("D");
        System.out.println(a.toString());

        System.out.println("----------------");

        System.out.println(a.toString());

        System.out.println("---------------");
        PilhaVetor b = new PilhaVetor(20);
        b.push("E");
        b.push("F");
        b.push("G");
        b.push("H");
        System.out.println(b);

        a.concatenar(b);
        System.out.println(a.toString());


    }
}