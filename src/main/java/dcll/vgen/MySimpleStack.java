package dcll.vgen;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21000539 on 24/02/2016.
 */
public class MySimpleStack implements SimpleStack{

    Stack<Object> wrappedStack = new Stack<Object>();

    /* Un commentaire répondant à l'exigence #3*/
    @Override
    public boolean isEmpty() {
        return wrappedStack.isEmpty();
    }

    @Override
    public int getSize() {
        return wrappedStack.size();
    }

    @Override
    public void push(Item item) {
        wrappedStack.push(item);
    }

    @Override
    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    @Override
    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }
}
