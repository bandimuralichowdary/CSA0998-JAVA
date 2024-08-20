import java.util.Scanner;
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() { }
    TreeNode(int val){
        this.val=val;
    }
    TreeNode(int val, TreeNode left, TreeNode right){
        this.val=val;
        this.left=left;
        this.right=right;
    }
}
public class BinaryTree04_SameTree{
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static TreeNode build(Scanner s){
        System.out.println("Enter -1 for null value! ");
        int val=s.nextInt();
        if(val==-1){
            return null;
        }
        TreeNode node=new TreeNode(val);
        System.out.println("Enter the left node of "+val+" : ");
        node.left=build(s);
        System.out.println("Enter the right node of "+val+" : ");
        node.right=build(s);
        return node;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Binary Tree-1 :");
        TreeNode Root1=build(s);
        System.out.println("Enter Binary Tree-2 :");
        TreeNode Root2=build(s);
        BinaryTree04_SameTree p=new BinaryTree04_SameTree();
        boolean result=p.isSameTree(Root1, Root2);
        if(result){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
        s.close();
    }
}
