package seminar4;

public class Main {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        tree.add(5);
        tree.add(9);
        tree.add(8);
        tree.add(7);
//        tree.add(6);
//        tree.add(4);
//        tree.add(1);
//        tree.add(2);

        tree.print();

    }

}