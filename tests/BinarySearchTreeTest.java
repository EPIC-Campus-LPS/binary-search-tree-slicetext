import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @org.junit.jupiter.api.Test
    void add() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(7);
        tree.add(6);
        tree.add(8);
        tree.add(2);
        tree.head.printPreorder();
    }

    @org.junit.jupiter.api.Test
    void contains() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(7);
        tree.add(6);
        tree.add(8);
        tree.add(2);
        assertTrue(tree.contains(7));
    }

    @org.junit.jupiter.api.Test
    void countNodes() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(7);
        tree.add(6);
        tree.add(8);
        tree.add(2);
        assertEquals(7, tree.countNodes());
    }

    @org.junit.jupiter.api.Test
    void countLeafNodes() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(7);
        tree.add(6);
        tree.add(8);
        tree.add(2);
        assertEquals(4, tree.countLeafNodes());
    }

    @org.junit.jupiter.api.Test
    void getHeight() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(7);
        tree.add(6);
        tree.add(8);
        tree.add(2);
        assertEquals(3, tree.getHeight());
    }

    @org.junit.jupiter.api.Test
    void printInorder() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(7);
        tree.add(6);
        tree.add(8);
        tree.add(2);
        tree.printInorder();
    }

    @org.junit.jupiter.api.Test
    void printPostorder() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(7);
        tree.add(6);
        tree.add(8);
        tree.add(2);
        tree.printPostorder();
    }

    @org.junit.jupiter.api.Test
    void delete() {
        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.add(5);
        tree.add(3);
        tree.add(4);
        tree.add(7);
        tree.add(6);
        tree.add(8);
        tree.add(2);
        tree.delete(4);
        tree.printInorder();
    }
}