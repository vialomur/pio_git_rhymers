package edu.kis.vh.nursery.list;


/**

 The Node class represents a node in a linked list.

 Each node stores an integer value and maintains references to the previous and next nodes.
 */
public class Node {

    /**

     The value stored in the node.
     */
    public final int value;
    /**

     Reference to the previous node in the linked list.
     */
    public Node prev;
    /**

     Reference to the next node in the linked list.
     */
    public Node next;
    /**

     Constructs a new Node with the specified integer value.
     @param value the integer value to be stored in the node
     */
    public Node(int value) {
        this.value = value;
    }
}
