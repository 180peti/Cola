public class ColaImpl<T> implements Cola<T>{

    int i;
    T[] v;
    public ColaImpl(int len) {

        v=new T[len];
        i=0;
    }

    private boolean estaPlena()
    {
        for (T)
    }


    @Override
    public void push(T d) throws PilaLlenaException {
        //log.info (d)


        if (estaPlena()) throw new PilaLlenaException();
        v[i++]=d;
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
