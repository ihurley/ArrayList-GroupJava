/**
 * Name: Izzy Hurley
 * Lab Name: ArrayList
 * Lab Purpose: The goal of ArrayList is to create a program
 * Date: 8/24/18
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class ArrayList {
    Node front;
    int size;

    public int size(){return size;}

    public void add(int i, Object o){
        Node n= new Node(o);
        n.pointMe(getNode(i-1));
        getNode(i+1).pointMe(n);
        size++;
    }
    private Node getNode(int i){
        Node n=front;
        if(i>=size||i<0){return null;}

        for(int q=1;q<=i;q++){
            n=n.getPointer(0);
        }
    return n;
    }

}
