

public class R_3_10 {

    public int Size(){
        int s=0; // s for size
        if (tail==null) return s;
        else s++;
        Node<E> node=tail;
        while (node.getNext()!=tail){
            s++;
            node=node.getNext();
        }
        return s;
    }
}
