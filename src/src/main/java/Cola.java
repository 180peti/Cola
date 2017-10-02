public interface Cola<T> {

    public void push(T d) throws Exception;

    public T pop() throws Exception;

    public int size();

}
