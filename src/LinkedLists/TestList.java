package LinkedLists;

public class TestList {
    public static void main(String[] args) {
        LinkedNode ln=new LinkedNode("Erster");
        LinkedList ll=new LinkedList(ln);
        ln=new LinkedNode("Zweiter");
        ll.append(ln);
        ln=new LinkedNode("Dritter");
        ll.append((ln));
        ll.showLinkedNodes();
    }
}
