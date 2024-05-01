public class ListaEstatica {


        private Object[] info;
        private int tamanho;

        public ListaEstatica() {
            info = new Object[10];
        }

        public void redimensionar() {
            Object[] auxiliar = new Object[info.length + 10];
            for (int i = 0; i <= tamanho; i++) {
                auxiliar[i] = info[i];
            }
            info = auxiliar;

        }

        public void inserir(Object valor) {
            if (tamanho == info.length - 1) {
                redimensionar();
            }
            info[tamanho] = valor;
            tamanho++;

        }

        public void exibir() {
            for (int i = 0; i < tamanho; i++) {
                System.out.println(info[i]);
            }
        }

        public int buscar(Object valor) {
            for (int i = 0; i <= tamanho; i++) {
                if (valor.equals(info[i])) {
                    return i;
                }
            }
            return -1;
        }

        public void retirar(Object valor) {
            int posicao = buscar(valor);

            if (posicao > -1) {
                for (int i = posicao + 1; i < tamanho -2; i++) {
                    info[i - 1] = info[i];
                }
            }
        }

        public void liberar() {
            info = new Object[10];
            tamanho = 0;
        }

        public Object obterElemento(int posicao) {
            if (posicao >= 0 && (posicao < tamanho)) {
                return info[posicao];
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        public boolean estaVazia() {
            if (getTamanho() == 0) {
                return true;
            }
            return false;
        }

        public int getTamanho() {
            return tamanho;
        }

        @Override
        public String toString() {
            for (int i = 0; i < info.length; i++) {
                return info[i] + ",";
            }
            return null;
        }
        public void inverter(){

            int i = 0;
            int j = info.length - 1;


            while (i < j) {
                Object temp = info[i];
                info[i] = info[j];
                info[j] = temp;
                i++;
                j--;
            }
        }
    }



