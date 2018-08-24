import java.util.ArrayList;

/**
 * Name: sloanwoodberry
 * Lab Name: Node
 * Lab Purpose
 * Date: 8/23/18
 * Collaborators: None
 */
public class Node {
    String data;
    ArrayList <Node> pointers;

    public Node(String myData, Node Mypointer){
        data=myData;
        pointers = new ArrayList<Node>();
        pointers.add(Mypointer);
    }
    public Node(String myData){
        data=myData;
        pointers = new ArrayList<Node>();
    }

    public void pointMe(Node n){ pointers.add(n);}

    public void setData(String data) {this.data = data; }
    public String getData() { return data; }

    public Node getPointer(int x){
        return pointers.get(x);
    }

}
