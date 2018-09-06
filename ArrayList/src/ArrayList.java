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

    public ArrayList(){
        front=null;
        size=0;
    }

    public int size(){return size;}

    public void add(int i, Object o){
        Node n= new Node(o);
        n.pointMe(getNode(i-1));
        getNode(i+1).pointMe(n);
    }
    private Node getNode(int i){//if i is the index of the node being accessed
        if(i >= size|| i < 0){return null;}//needs to be >= size, bc ind = size is undefined
        Node n= front.getPointer(0);
        for(int q=0;q<=i;q++){//also this needs to start at 0 bc you will reach the index before the index given
            n=n.getPointer(0);
        }
    return n;
    }

    public Object set(int ind, Object O){
        if(ind  < 0 || ind >= size){
            throw new IndexOutOfBoundsException("Index: "+ ind +", Size: "+ size);
        }
            Node use = getNode(ind);
            Object toReturn = use.getData();
            use.setData(O);
        return toReturn;
    }

    public boolean add(Object O){
        Node obj = new Node(O);
        obj.pointMe(getNode(size-1));
        obj.pointMe(null);
        getNode(size-1).pointers.add(obj);
        return true;
    }


}

