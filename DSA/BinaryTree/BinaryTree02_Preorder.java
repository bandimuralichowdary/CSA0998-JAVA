import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
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
public class BinaryTree02_Preorder{
    public ArrayList<Integer> list;
    public List<Integer> preorderTraversal(TreeNode root){
        list=new ArrayList<Integer>();
        preorder(root);
        return list;
    }
    public void preorder(TreeNode root){
        if(root==null){
            return;
        }
        list.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
    public static TreeNode build(Scanner s){
        System.out.println("Enter -1 for null value !");
        int val=s.nextInt();
        if(val==-1){
            return null;
        }
        TreeNode p=new TreeNode(val);
        System.out.println("Enter the left child val of "+val+" : ");
        p.left=build(s);
        System.out.println("Enter the right child val of "+val+" : ");
        p.right=build(s);
        return p;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        TreeNode root=build(s);
        BinaryTree02_Preorder p=new BinaryTree02_Preorder();
        List<Integer> list=p.preorderTraversal(root);
        System.out.println("Preorder traversal : "+list);
        s.close();
    }
}
