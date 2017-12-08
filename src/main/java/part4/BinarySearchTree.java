package part4;

public class BinarySearchTree {
    TreeNode root;

    public void addNode(int key, String value){

        TreeNode newNode = new TreeNode(key, value);

        if(root == null){

            root = newNode;

        }else {

            TreeNode focusNode = root;
            TreeNode parent;

            while(true){
                parent = focusNode;
                if(key < focusNode.key){
                    focusNode = focusNode.leftChild;

                    if(focusNode == null){
                        parent.leftChild = newNode;
                        return;
                    }

                }else {
                    focusNode = focusNode.rightChild;

                    if(focusNode == null){
                        parent.rightChild = newNode;
                        return;
                    }

                }
            }
        }
    }

    public TreeNode findNode(int key){
        TreeNode focusNode = root;

        while (focusNode.key != key){
            if(key < focusNode.key){
                focusNode = focusNode.leftChild;
            }else{
                focusNode = focusNode.rightChild;
            }
        }

        if(focusNode == null){
            return null;
        }

        return focusNode;
    }

    public void inOrderTraversal(TreeNode focusNode){
        if(focusNode != null){
            inOrderTraversal(focusNode.leftChild);
            System.out.println(focusNode);
            inOrderTraversal(focusNode.rightChild);
        }
    }

    public void preOrderTraversal(TreeNode focusNode){
        if(focusNode != null){
            System.out.println(focusNode);
            preOrderTraversal(focusNode.leftChild);
            preOrderTraversal(focusNode.rightChild);
        }
    }

    public void postOrderTraversal(TreeNode focusNode){
        if(focusNode != null){
            postOrderTraversal(focusNode.leftChild);
            postOrderTraversal(focusNode.rightChild);
            System.out.println(focusNode);
        }
    }

}

class TreeNode {
    int key;
    String value;
    TreeNode leftChild;
    TreeNode rightChild;

    public TreeNode(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public String toString(){
        return value + " has a key " + key;
    }
}