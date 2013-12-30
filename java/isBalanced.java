public int checkHeight(Node root)
{
    if(root == null) return 0;
    
    int leftHeight = checkHeight(root.left);
    if(leftHeight == -1) return false;
    
    int rightHeight = checkHeight(root.right);
    if(rightHeight == -1) return false;
    
    if(Math.abs(leftHeight - rightHeight) > 1)
        return -1;
    else
        return Math.max(leftHeight, rightHeight) + 1;
}

public boolean isBalanced(Node root)
{
    return checkHeight(root) == -1 ? false : true;
}
