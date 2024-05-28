public class ListaDupla<T> {

    NoListaDupla<T> primeiro;

    public ListaDupla() {
        primeiro = null;
    }

    public NoListaDupla<T> getPrimeiro() {
        return primeiro;
    }
    public void inserir(T elemento) {
       NoListaDupla<T> novo = new NoListaDupla<>();
       novo.setInfo(elemento);
       novo.setProximo(primeiro);
       novo.setAnterior(null);
       if (primeiro != null){
           primeiro.setAnterior(novo);
       }
       primeiro = novo;

    }
    public NoListaDupla<T> buscar(T elemento) {
        NoListaDupla<T> p = primeiro;
        while (p != null) {
            if (elemento.equals(p.getInfo())) {
                return p;
            } else {
                p = p.getProximo();
            }
        }
        return null;
    }
    public void retirar(T elemento) {
       NoListaDupla<T> p = buscar(elemento);
       if (p != null) {
           if(primeiro.equals(p)){
               primeiro = p.getProximo();
           }
           else {
               p.getAnterior().setProximo(p.getProximo());
           }
           if(p.getProximo() != null){
               p.getProximo().setAnterior(p.getAnterior());
           }
       }
    }
    public void exibirOrdemInversar(){
        NoListaDupla<T> p = primeiro;
        while (p != null && p.getProximo() != null){
            p = p.getProximo();
        }

        while (p != null){

            System.out.println(p.getInfo());
            p = p.getAnterior();

        }
        System.out.println();
    }
    public void liberar(T elemento){
        NoListaDupla<T> p = primeiro;
        while (p != null){
            p.setInfo(null);
            p = p.getProximo();
            p.setAnterior(null);
        }
        primeiro = null;
    }

    @Override
    public String toString() {
        NoListaDupla<T> p = primeiro;
        String str = "";
        while (p != null){
            str += p.getInfo() + ",";
            p = p.getProximo();

        }
        return str;
    }
}
