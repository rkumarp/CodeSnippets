//with extra space
public Node removeDuplicates(Node head)
{
    Set set = new HashSet();
    Node current = head;
    Node previous = null;
    while(current != null)
    {
        if(!s.add(current.data))
            previous.next = current.next;
        else
            previous = current;
        current = current.next;
    }
    return head;
}

//without extra space
public Node removeDuplicates(Node head)
{
    Node current = head;
    while(current != null)
    {
        Node runner = current;
        while(runner.next != null)
        {
            if(runner.next.data == current.data)
                runner.next = runner.next.next;
            else
                runner = runner.next;
        }
        current = current.next;
    }
}
