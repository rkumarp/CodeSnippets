//RECURSIVE
public Node reverseLinkedList(Node head)
{
    if(head == null)
        return null;
    if(head.next == null)
        return head;
    
    Node successor = head.next;
    head.next = null;

    Node newHead = reverseLinkedList(next);

    next.next = head;
    
    return newHead;
}

//ITERATIVE
public Node reverseLinkedList(Node head)
{
    Node current = head;
    Node previous = null;
    while(current != null)
    {
        Node next = current.next;
        current.next = previous;
        previous = current;
        current = next;
    }
    return previous;
}
