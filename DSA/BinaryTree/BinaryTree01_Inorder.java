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
public class BinaryTree01_Inorder{
    public ArrayList<Integer> list;
    public List<Integer> inorderTraversal(TreeNode root){
        list=new ArrayList<Integer>();
        inorder(root);
        return list;
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        list.add(root.val);
        inorder(root.right);
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
        BinaryTree01_Inorder p=new BinaryTree01_Inorder();
        List<Integer> list=p.inorderTraversal(root);
        System.out.println("Inorder traversal : "+list);
        s.close();
    }
}
