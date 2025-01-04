package Utils;

public class LinkedList<E>{
    public class Node<E> {
        E value;
        Node<E> next;
        Node(E value) {
            this.value=value;
        }

        public E getValue() {
            return value;
        }

        public void setValue(E value) {
            this.value = value;
        }
    }

    public Node<E> head=null;
    public Node<E> tail=head;
    public int size=0;

    public void add(E value){
        Node<E> temp=new Node<E>(value);
        if(head==null){
            head=temp;
            tail=head;
        }else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    public Node<E> get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }

    public void delete(int index){
        Node<E> temp=get(index-1);
        if(index==0){
            head=head.next;
        }else if(size==1){
            head=null;
        }else{
            temp.next=temp.next.next;
        }
        size--;
    }

    public void list(){
        Node temp = head;

        for (int i=0;i<size;i++){
            System.out.println(temp.getValue());
            temp=temp.next;
        }
    }

    public int search(E value){
        Node<E> temp = head;
        int a = -1;
        for (int i=0;i<size;i++){
            if(temp.getValue()==value){
                a=i;
            }
            temp=temp.next;
        }
        return a;
    }

    public Node<E> find(E value){
        Node<E> temp = head;
        int a = -1;
        for (int i=0;i<size;i++){
            if(temp.getValue()==value){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
}
