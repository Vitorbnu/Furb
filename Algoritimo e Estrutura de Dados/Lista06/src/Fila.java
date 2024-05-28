public interface Fila <T>{

    public void inserir(T valor);
    public boolean estaVazia();
    public T retirar();
    public T peek();
    public void liberar();

}
