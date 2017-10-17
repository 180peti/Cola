import java.PilaLlenaException;


public class ColaImpl<T> implements Cola<T>{

    int i;
    T[] data;
    //Stack v = new Stack();
    //Cola c;

    public ColaImpl(int len) {
        data = (E[])new Object[len];
        //v = new T[len];
        //a = new Cola<T>(len);
                //T[len];
        i = 0;
    }

    private boolean estaPlena()
    {
        return true;
    }


    @Override
    public void push(T d) throws PilaLlenaException {
        //log.info (d)


        if (estaPlena()) throw new PilaLlenaException();
        data[i++] = d;
    }

    @Override
    public T pop() throws Exception {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}
