public Node kthLastElement(Node head, int k)
{
    Node p1 = head;
    Node p2 = head;
    for(int i = 0; i < k - 1; i++)
    {
        if(p1 == null)
            return null;
        p1 = p1.next;
    }
    if(p1 == null) return null;
    
    while(p1.next != null)
    {
        p1 = p1.next;
        p2 = p2.next;
    }
    return p2;
}
