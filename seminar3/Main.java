package seminar3;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(-5);
        list.add(8);
        list.add(0);
        list.add(14);
        list.add(-6);

        list.print();
        list.reverse();
        list.print();
    }
}