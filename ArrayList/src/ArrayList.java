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
    }
    private Node getNode(int i){
        if(i>size||i<0){return null;}
        Node n= front.getPointer(0);
        for(int q=1;q<=i;q++){
            n=n.getPointer(0);
        }
    return n;
    }



    public Object remove(int i){
     ///   getNode(i).setData(null);
        if(i == 0){
            Node old = this.front;

            if(this.size == 1){
                this.front = null;
                size--;
            }
            else {
                this.front = getNode(i + 1);
                this.front.unPointMe(0); //deletests the front's back pointer
                old.unPointMe(1); //deletes the front's front pointer
                this.front.pointMe(null, 0);

            }
            size -=1;
            return old.getData();

        }
        else if(i == this.size-1){
            Node toDel = getNode(i);
            Node newBack = getNode(i-1);
            newBack.unPointMe(1);
            toDel.unPointMe(0);
            newBack.pointMe(null,1);
            size--;
            return toDel.getData();
        }
        else {
            //make this match the edge cases
            Node old = getNode(i);
            getNode(i - 1).pointMe(getNode(i + 1), 1);
            getNode(i+1).pointMe(getNode(i-1), 0);
            getNode(i).unPointMe(0);
            getNode(i).unPointMe(1);
            size = this.size - 1;
            return old.getData();
        }


    }
}
