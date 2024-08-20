import java.util.Scanner;
class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;
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
class Solution{
    public boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        return isSymm(root.left, root.right);
    }
    public boolean isSymm(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        if(root1.val!=root2.val) return false;
        return root1.val==root2.val && root1.left==root2.right && root2.left==root1.right;
    }
}
class BinaryTree05_SymmetricTree{
    public static TreeNode create(Scanner s){
        System.out.println("Enter -1 for null value: ");
        int val=s.nextInt();
        if(val==-1){
            return null;
        }
        TreeNode node=new TreeNode(val);
        System.out.println("Enter the left val of "+val+" : ");
        node.left=create(s);
        System.out.println("Enter the right val of "+val+" : ");
        node.right=create(s);
        return node;
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        TreeNode root=create(s);
        Solution sol=new Solution();
        boolean isSymmetric=sol.isSymmetric(root);
        System.out.println("Symmetric or Not ? "+isSymmetric);
        s.close();
    }
}
