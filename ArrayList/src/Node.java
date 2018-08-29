import java.util.ArrayList;

/**
 * Name: sloanwoodberry
 * Lab Name: Node
 * Lab Purpose
 * Date: 8/23/18
 * Collaborators: None
 */
public class Node {
    Object data;
    ArrayList <Node> pointers;

    public Node(Object myData, Node Mypointer){
        data=myData;
        pointers = new ArrayList<Node>();
        pointers.add(Mypointer);
    }
    public Node(Object myData){
        data=myData;
        pointers = new ArrayList<Node>();
    }

    public void pointMe(Node n){ pointers.add(n);}
    public void unPointMe(int index){ pointers.remove(index);}

    public void setData(Object data) {this.data = data; }

    public Object getData() { return data; }

    public Node getPointer(int x){
        return pointers.get(x);
    }

}
