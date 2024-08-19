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
public class BinaryTree03_Postorder{
    public ArrayList<Integer> list;
    public List<Integer> postorderTraversal(TreeNode root){
        list=new ArrayList<Integer>();
        postorder(root);
        return list;
    }
    public void postorder(TreeNode root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        list.add(root.val);
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
        BinaryTree03_Postorder p=new BinaryTree03_Postorder();
        List<Integer> list=p.postorderTraversal(root);
        System.out.println("Post order traversal : "+list);
        s.close();
    }
}
