public interface Pilha <T>{

    public boolean estaVazio();
    public void push(T item);
    public T pop();
    public T peek();
    public void liberar();
}
