
public class FilaVetor<T> implements Fila<T> {
    private Object[] info;
    private int tamanho;
    private int limite;
    private int inicio;

    public FilaVetor(int limite) {
        this.info = new Object[limite];
        this.inicio = 0;
        this.tamanho = 0;
        this.limite = limite;

    }


    @Override
    public void inserir(T valor) {
        if (tamanho == limite) {
            throw new FilaCheiaException("Fila cheia");
        }
        int fim = (inicio + tamanho) % limite; // Calcula o índice do fim
        info[fim] = valor;
        tamanho++;
    }

    @Override
    public boolean estaVazia() {
        if (tamanho == 0) return true;
        return false;
    }

    @Override
    public T retirar() {
        if (estaVazia()) {
            throw new FilaVaziaException("Fila vazia");
        }
        T valor = (T) info[inicio];
        info[inicio] = null; // Limpa a posição
        inicio = (inicio + 1) % limite;
        tamanho--;
        return valor;
    }

    @Override
    public T peek() {
        if (estaVazia()) {
            throw new FilaVaziaException("Fila vazia");
        }
        return (T) info[inicio];
    }

    @Override
    public void liberar() {
        for (int i = 0; i < tamanho; i++) {
            retirar();
        }
    }

    public FilaVetor<T> criarFilaConcatenada(FilaVetor<T> f2) {
        FilaVetor<T> novaFila = new FilaVetor<>(this.tamanho + f2.tamanho);

        for (int i = 0; i < this.tamanho; i++) {
            novaFila.inserir((T) this.info[(this.inicio + i) % this.limite]);
        }

        for (int i = 0; i < f2.tamanho; i++) {
            novaFila.inserir((T) f2.info[(f2.inicio + i) % f2.limite]);
        }

        return novaFila;
    }

    @Override
    public String toString() {
        String str = "[";
        for (int i = 0; i < tamanho; i++) {
            int pos = (inicio + i) % limite;
            str += info[pos] + (i < tamanho - 1 ? ", " : "");
        }
        return str + "]";
    }
}
