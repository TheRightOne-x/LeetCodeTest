package 链表;
public class CircleList<E> extends AbstractTList{ // 也是TList 接口的子类
    private Node<E> current;
    private Node<E> last;
    private Node<E> first;
    private class Node<E>{
        Node next;
        Node prv;
        E element;
        public Node(Node next, Node prv, E element) {

            this.next = next;
            this.prv = prv;
            this.element = element;
        }
    }
    public void reset(){

    }
    public E next(){
        if(current.next == null) return null;
        current = current.next;
        return current.element;
    }
    public void remove(int index){

    }
    private E remove(Node<E> node){
        if(current == null) return null;
        if(size == 1){
            first = null;
            last = null;
        }else{
            Node<E> prev = node.prv;
            Node<E> next = node.next;
            prev.next = next;
            next.prv = prev;
            if(node == first){
                first = next;
            }
            if(node == last){
                last = prev;
            }
        }

        return null;
    }
    private Node<E> node(int index){
        return null;
    }
}
