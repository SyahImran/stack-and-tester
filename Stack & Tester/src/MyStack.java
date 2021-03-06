import java.util.ArrayList;

public class MyStack<E> implements StackInterface<E> {

    private ArrayList<E> stack = new ArrayList<>();

    @Override
    public E push(E o) {
        stack.add(o);
        return o;
    }

    @Override
    public E peek() {
        return stack.get(0);
    }

    @Override
    public E pop() {
        return stack.remove(0);
    }

    @Override
    public boolean empty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public E get(int x) {
        return stack.get(x);
    }

    @Override
    public String toString() {
        return stack.toString();
    }
}
