public class PilhaVetor<T> implements Pilha<T> {

    private T[] info;
    private int tamanho;
    private int limite;

    public PilhaVetor(int tamanho) {
        info = (T[]) new Object[tamanho];
    }


    @Override
    public boolean estaVazio() {
        if (tamanho == 0) return true;
        return false;
    }

    @Override
    public void push(T item) {
        if (tamanho == info.length - 1)
            throw new PilhaCheiaException("A pilha está cheia");

            info[tamanho] = item;
            tamanho++;


    }

    @Override
    public T pop() {
        T aux = peek();
        if (estaVazio()){
            throw new PilhaVaziaException("Não tem nada na pilha");
        }


             info[tamanho] = null;
             tamanho--;

        return aux;

    }

    @Override
    public T peek() {
        if (estaVazio()){
            throw new PilhaVaziaException("Não tem nada na pilha");
        }
        return info[tamanho - 1];
    }

    @Override
    public void liberar() {
        while (!estaVazio()){
            pop();
        }
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < tamanho; i++) {

               s += "[" + info[i] + "]";

           }
        return s;
    }

    public void concatenar(Pilha<T> p) {

        if (tamanho == info.length) throw new PilhaCheiaException("Pilha está cheia");

        T[] aux = (T[]) new Object[info.length - 1];
        int tamanhoAux = 0;


        while (!p.estaVazio()) {
          aux[tamanhoAux] =  p.pop();
           tamanhoAux++;
        }
        for (int i = tamanhoAux; i >= 0 ; i--) {
            if (aux[i] != null) {
                push(aux[i]);
            }

        }
    }
}
