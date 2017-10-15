import java.PilaLlenaException;


public class ColaImpl<T> implements Cola<T>{

    int i;
    //T[] v;
    //Stack v = new Stack();
    Cola a;

    public ColaImpl(int len) {

        //v = new T[len];
        a = new Cola<T>(len);
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
        a[i++]=d;
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
