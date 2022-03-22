

import lab_four.CircularyLinkedList;


public class R_3_7 {

    public void addFirst(E e){
        if (isEmpty()){
            tail=new CircularyLinkedList.Node<E>(e,null);
            tail.setNext(tail);
        }
        else {
            tail.next=new CircularyLinkedList.Node<E>(e,tail.getNext()); // rather than creating new node
        }
    }
}
