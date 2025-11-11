import com.sun.source.tree.Tree;

/**
 * A class representing a node in a binary tree
 * @param <E> the kind of elements the tree will hold
 */
public class TreeNode<E extends Comparable<E>> {
    private E value;
    private TreeNode<E> leftChild;
    private TreeNode<E> rightChild;

    /**
     * Creates a new TreeNode
     * @param val - the value held at the node
     * @param left - the left child
     * @param right - the right child
     */
    public TreeNode(E val, TreeNode<E> left, TreeNode<E> right){
        value = val;
        leftChild = left;
        rightChild = right;
    }

    /**
     * Retrieves the left child of this node
     * @return the left child of the node
     */
    public TreeNode<E> getLeftChild(){
        return leftChild;
    }

    /**
     * Retrieves the right child of this node
     * @return the right child of this node
     */
    public TreeNode<E> getRightChild(){
        return rightChild;
    }

    /**
     * Retrieves the value of this node
     * @return the value contained at this node
     */
    public E getValue(){
        return value;
    }

    /**
     * Sets the left child to the node given
     * @param left the new left child node
     */
    public void setLeftChild(TreeNode<E> left){
        leftChild = left;
    }

    /**
     * Sets the right child to the node given
     * @param right the new right child node
     */
    public void setRightChild(TreeNode<E> right){
        rightChild = right;
    }

    /**
     * Sets the value to the value given
     * @param val the new value of the node
     */
    public void setValue(E val){
        value = val;
    }

    /**
     * Is the node a leaf node (no children)
     * @return if node is leaf node
     */
    public boolean isLeafNode() {
        return (leftChild == null) && (rightChild == null);
    }

    public void insert(E element) {
        if(element.compareTo(value) < 0) {
            if(getLeftChild() == null) {
                setLeftChild(new TreeNode<>(element, null, null));
                return;
            }
            getLeftChild().insert(element);
        } else {
            if(getRightChild() == null) {
                setRightChild(new TreeNode<>(element, null, null));
                return;
            }
            getRightChild().insert(element);
        }
    }

    public boolean contains(E element) {
        int comp = element.compareTo(value);
        if(comp < 0) {
            if(getLeftChild() == null) {
                return false;
            }
            return getLeftChild().contains(element);
        } else if(comp == 0) {
            return true;
        } else {
            if(getLeftChild() == null) {
                return false;
            }
            return getRightChild().contains(element);
        }
    }

    public int countNodes() {
        if(isLeafNode()) {
            return 1;
        }
        int size = 1;
        if(getLeftChild() != null) {
            size += getLeftChild().countNodes();
        }
        if(getRightChild() != null) {
            size += getRightChild().countNodes();
        }
        return size;
    }

    public int countLeafNodes() {
        if(isLeafNode()) {
            return 1;
        }
        int size = 0;
        if(getLeftChild() != null) {
            size += getLeftChild().countLeafNodes();
        }
        if(getRightChild() != null) {
            size += getRightChild().countLeafNodes();
        }
        return size;
    }

    public int getHeight() {
        int left = 0;
        if(getLeftChild() != null) {
            left = getLeftChild().getHeight();
        }
        int right = 0;
        if(getRightChild() != null) {
            right = getRightChild().getHeight();
        }

        return Integer.max(left, right) + 1;
    }

    /**
     * Compares the values of this node to another node
     * Returns 0 if the two are equal
     * Returns a negative number if value is less than the given node
     * Returns a positive number if it is greater than the given node
     * @param node the node to compare the current node to
     * @return the numerical value of the comparison between the two nodes
     */
    public int compareTo(TreeNode<E> node){
        return value.compareTo(node.getValue());
    }

    public void printPreorder() {
        System.out.println(value);
        if(getLeftChild() != null) {
            getLeftChild().printPreorder();
        }
        if(getRightChild() != null) {
            getRightChild().printPreorder();
        }
    }
    public void printInorder() {
        if(getLeftChild() != null) {
            getLeftChild().printInorder();
        }
        System.out.println(value);
        if(getRightChild() != null) {
            getRightChild().printInorder();
        }
    }
    public void printPostorder() {
        if(getLeftChild() != null) {
            getLeftChild().printPostorder();
        }
        if(getRightChild() != null) {
            getRightChild().printPostorder();
        }
        System.out.println(value);
    }

    public void delete(E element) {
        if(element.compareTo(value) < 0) {
            if(getLeftChild().getValue().equals(element)) {
                setLeftChild(null);
                return;
            }
            getLeftChild().delete(element);
        }
        if(element.compareTo(value) > 0) {
            if(getRightChild().getValue().equals(element)) {
                setRightChild(null);
                return;
            }
            getRightChild().delete(element);
        }
    }
}