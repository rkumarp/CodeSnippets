public void postOrder(Node root)
{
    if(root == null) return;
    Stack s = new Stack();
    s.push(root);
    Node previos;
    while(!s.isEmty())
    {
         Node current = s.peak();
         
         //pop when returning back        
         if((current.left == null && current.right == null) || current.left == previous || current.right == previous)
         {
             s.pop();
             System.out.println(current.data);
             previous = current;
         }
         //push
         if(current.right != null)
             s.push(current.right);
         if(current.left != null)
             s.push(current.left);
    }
}

public void inOrder(Node root)
{
    if(root == null) return;
    Stack s = new Stack();
    Node current = root;
    while(true)
    {    
        if(current != null)
        {
            s.push(current);
            current = current.left;
        }
        else{
            if(s.isEmpty) break;
            else
            {
                current = s.pop();
                System.out.println(current.data);
                current = current.right;
            }
        }
    }
}
