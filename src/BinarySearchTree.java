public class BinarySearchTree<E extends Comparable<E>> {
    TreeNode<E> head;

    /**
     * Add element to tree
     * @param element element to add
     */
    public void add(E element) {
        if(head == null) {
            head = new TreeNode<>(element, null, null);
            return;
        }
        head.insert(element);
    }

    /**
     * check if contains element
     * @param element element to check
     * @return if contains element
     */
    public boolean contains(E element) {
        return head.contains(element);
    }

    /**
     * get number of nodes
     * @return number of nodes
     */
    public int countNodes() {
        return head.countNodes();
    }

    /**
     * get number of leaf nodes
     * @return number of leaf nodes
     */
    public int countLeafNodes() {
        return head.countLeafNodes();
    }

    /**
     * get height of tree
     * @return height of tree
     */
    public int getHeight() {
        return head.getHeight();
    }

    /**
     * print in order
     */
    public void printInorder() {
        head.printInorder();
    }

    /**
     * print in order of middle left right
     */
    public void printPreorder() {
        head.printPreorder();
    }

    /**
     * print in order of left right middle
     */
    public void printPostorder() {
        head.printPostorder();
    }

    /**
     * delete element from tree
     * @param element element to delete
     */
    public void delete(E element) {
        head.delete(element);
    }

}
