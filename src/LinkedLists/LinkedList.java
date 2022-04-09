package LinkedLists;

public class LinkedList {
    LinkedNode root;
    public LinkedList(LinkedNode ln){
        if(root==null){
            this.root=ln;
        }
    }
    public void append(LinkedNode ln){
        LinkedNode counterItem=root;
        while(counterItem.getSucessor()!=null){
            counterItem=counterItem.getSucessor();
        }
        counterItem.setSucessor(ln);
    }


    public void showLinkedNodes(){
        LinkedNode counterItem=root;
        System.out.println(counterItem.data);
        while(counterItem.getSucessor()!=null){
            counterItem=counterItem.getSucessor();
            System.out.println(counterItem.data);

        }
    }
}
