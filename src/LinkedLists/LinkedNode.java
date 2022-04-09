package LinkedLists;

public class LinkedNode {
    LinkedNode predecessor;
    LinkedNode sucessor;
    String data;
    public LinkedNode(String data){
        this.data=data;
    }
    public LinkedNode getSucessor(){
        return this.sucessor;
    }
    public LinkedNode getPredecessor(){
        return this.predecessor;
    }
    public void setSucessor(LinkedNode ln){
        this.sucessor=ln;
    }

    public void setPredecessor(LinkedNode ln){
        this.predecessor=ln;
    }
}
