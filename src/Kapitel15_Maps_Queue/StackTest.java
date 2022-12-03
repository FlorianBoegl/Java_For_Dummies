package Kapitel15_Maps_Queue;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Vector;

public class StackTest
{

    public static LinkedList<String> stack = new LinkedList<>();
    public static Vector<String> vector = new Vector<>();

    public StackTest() {

        stack.push("a");
        stack.push("b");
        stack.push("c");

        try {
            while (stack.peek() != null) stack.pop();
        } catch (NoSuchElementException e) {
            throw new NoSuchElementException(e);
        }
    }

    public static void main(String[] args) {
        StackTest test = new StackTest();
    }

}
