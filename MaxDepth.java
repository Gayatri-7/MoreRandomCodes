class Treenode{
    int val;
    Treenode right;
    Treenode left;
    Treenode root;
    
    public Treenode(int val){
        this.val=val;
        
    }
}
public class MaxDepth{
    public static int  MaxDepthBT(Treenode root){
      if(root==null){
        return 0;
    }
       return 1+ Math.max(MaxDepthBT(root.right),MaxDepthBT(root.left));
    
}
public static void main (String[] args) {
    Treenode root=new Treenode(1);
    root.right=new Treenode(2);
    root.left=new Treenode(3);
    root.left.left=new Treenode(4);
    root.left.right=new Treenode(5);
    System.out.print("The max depth of the tree is:="+ MaxDepthBT(root));
    
      }
}