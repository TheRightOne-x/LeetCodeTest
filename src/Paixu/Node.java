package Paixu;


public class Node<E> {
    private int size = 0;
    private Nd first;
    private class Nd<E>{
        E elementE;
        Nd<E> next;
        public Nd(E elementE, Nd<E> next) {
            this.elementE = elementE;
            this.next = next;
        }
    }
    public int Size(){
        return size;
    }

    public void add(int index,E element){
    }
    private boolean rangeCk(int index){
        if(index > size || index < 0)
        {
            return false;
        }
        return true;
    }
}
