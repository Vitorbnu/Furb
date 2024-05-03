public class ListaEncadeada<T> {

    private NoLista<T> primeiro;

    public ListaEncadeada() {
        primeiro = null;
    }

    public NoLista<T> getPrimeiro() {
        return primeiro;
    }

    public void inserir(T info) {
        NoLista<T> novo = new NoLista();
        novo.setInfo(info);
        novo.setProximo(primeiro);
        primeiro = novo;
    }

    public boolean estaVazia() {
        if (primeiro == null) {
            return true;
        } else {
            return false;
        }
    }

    public NoLista<T> buscar(T info) {
        NoLista p = primeiro;
        while (p != null) {
            if (p.equals(info)) {
                return p;
            }
            p = p.getProximo();
        }
        return null;
    }

    public void retirar(T info) {
        NoLista<T> anteiror = null;
        NoLista<T> p = primeiro;
        while (p != null && p.getInfo() != info) {
            anteiror = p;
            p = p.getProximo();
        }
        if (p != null) {
            if (p == primeiro) {
                this.primeiro = p.getProximo();
            }
        }
    }

    public int obterComprimento() {
        int contador = 0;
        NoLista<T> noAtual = primeiro;
        if (noAtual == null) {
            return 0;
        } else {
            while (noAtual != null) {
                contador++;
                noAtual = primeiro.getProximo();
            }
        }
        return contador;
    }

    public NoLista<T> obterNo(int idx) {
        int contador = 0;
        int comprimento = obterComprimento();
        NoLista<T> p = primeiro;

        if (idx > comprimento - 1 || idx < 0) {
            throw new IndexOutOfBoundsException();
        } else {
            while (p != null) {
                if (idx == contador) {
                    return p;
                } else {
                    contador++;
                    p = p.getProximo();
                }
            }

        }


        return p;
    }

    @Override
    public String toString() {
        if (primeiro == null) {
            return "[]"; // Lista está vazia!
        }

        String resultado = "[";
        NoLista<T> p = primeiro;
        while (p != null) {
            resultado += p.getInfo();
            if (p.getProximo() != null) {
                resultado += ", ";
            }
            p = p.getProximo();
        }
        resultado += "]";
        return resultado;
    }
}
