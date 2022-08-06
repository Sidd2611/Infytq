class Node {  
    public int value;  
    public Node left, right;  
  
    public Node(int element)  
    {  
        value = element;  
        left = right = null;  
    }  
}  
  
class PostorderTraversal {  
    Node root;  
  
    PostorderTraversal() { root = null; }  
  
    void traversePostorder(Node node)  
    {  
        if (node == null)  
            return;  
        traversePostorder(node.left);  
        traversePostorder(node.right);  
        System.out.print(node.value + " ");  
    }  
  
    void traversePostorder() { traversePostorder(root); }  
  
    public static void main(String args[])  
    {  
        PostorderTraversal pt = new PostorderTraversal();  
        pt.root = new Node(36);  
        pt.root.left = new Node(26);  
        pt.root.right = new Node(46);  
        pt.root.left.left = new Node(21);  
        pt.root.left.right = new Node(31);  
        pt.root.left.left.left = new Node(11);  
        pt.root.left.left.right = new Node(24);  
        pt.root.right.left = new Node(41);  
        pt.root.right.right = new Node(56);  
        pt.root.right.right.left = new Node(51);  
        pt.root.right.right.right = new Node(66);  
  
        System.out.println();  
        System.out.println("The Postorder traversal of given binary tree is - ");  
        pt.traversePostorder();  
        System.out.println();  
    }  
}  
