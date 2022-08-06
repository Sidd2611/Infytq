boolean isValidBST (TreeNode root)
{
    if (root == NULL)
        return true 
    
    if (root->left != NULL && root->left->value > root->value)
        return false 
    if (root->right != NULL && root->right->value < root->value)
        return false
        
    boolean left = isValidBST(root->left)
    boolean right = isValidBST(root->right) 
    if(left == true && right == true)
        return true
    else 
        return false
}
