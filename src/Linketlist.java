import org.w3c.dom.Node;

public class Linketlist {
    private Node head;

    private Node tail;

    public String get(int item){
        if (item > size()){throw new ArrayIndexOutOfBoundsException();}// 1 08
        Node tmp = head;
        while (item >0){
            tmp = tmp.next;
            item--;
        }

        return tmp.value;

    }

    public int size(){
        int size = 1;
        if (head == null) return 0;
        Node tmp = head;
        while (tmp.next != null){
            tmp = tmp.next;
            size++;
        }
        return size;
    }

    public void remove(){
        if (head != null)
            head = head.next;
    }

    public void add(String str){
        Node node = new Node();
        node.value = str;
        if (head != null){
            node.next = head;
        }
        head = node;

    }

    public void revert(){
        Node node = new Node();
        Node temp = head;
        head = tail;
        tail = temp;

        while (node.next != null){
            temp = node.next;
            node.next = node.previous;
            node.previous = temp;
            node = node.previous;
        }
    }

    class Node{
        public String value;
        public Node next;
        public Node previous;
    }
}

