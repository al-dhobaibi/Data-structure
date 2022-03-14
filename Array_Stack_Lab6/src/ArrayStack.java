public class ArrayStack<E> implements Stack<E> {
    static final int CAPACITY=100;
    E data[];
    int t=-1;
    public ArrayStack(int c){
        data= (E[]) new Object[c];
    }
    public ArrayStack(){
        this(CAPACITY);
    }
    @Override
    public boolean isEmpty() {
        return t==-1;
    }

    @Override
    public int size() {
        return t+1;
    }
    @Override
    public E top() {
         if (isEmpty())return null;                     // if size()==data length array is out of bound
        return data[t];
    }

    @Override
    public E pop() {
        if (isEmpty())return null;
        E delete=data[t];
        data[t]=null;
        t--;
        return delete;
    }

    @Override
    public void push(E element) {
        if (size()==data.length)
            throw new IllegalStateException("Stack is Full");
            data[++t] = element;

    }
}
