
/**
 * Name: Izzy Hurley
 * Lab Name: ArrayListDriver
 * Lab Purpose: The goal of ArrayListDriver is to create a program
 * Date: 8/29/18
 * Collaborators: None
 * ON MY HONOR: IH
 */

public class ArrayListDriver {
    public static void main(String[] args) {
        Integer oForNode = new Integer(0);//data for first node
        Node first = new Node(oForNode, new Node(null));
        ArrayList test = new ArrayList(first);

        //Testing set method:
        test.add(new Integer(1));
        test.add(new Integer(2));
        test.add(new Integer(3));
        test.add(new Integer(4));

        System.out.println(test.set(2, new Integer(33)));
        System.out.println(test.get(2));
    }
}
