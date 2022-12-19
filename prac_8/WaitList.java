package prac_8;

import java.util.Collection;
import java.util.concurrent.ConcurrentLinkedQueue;

public class WaitList<E> implements IWaitList<E> {

    protected ConcurrentLinkedQueue<E> content;

    public WaitList() {
        content = new ConcurrentLinkedQueue<E>();
    }

    public WaitList(Collection<E> c)
    {
        content = new ConcurrentLinkedQueue<E>(c);
    }

    @Override
    public String toString() {
        String res;
        boolean ff = false;
        res = "Waitlist: ";
        for (E element: content)
        {
            if (ff) res+=", ";
            res+=element.toString();
            ff = true;
        }
        res+=";";
        return res;
    }

    @Override
    public void add(E element) {
        content.add(element);
    }

    @Override
    public E remove() {
        return content.remove();
    }

    @Override
    public boolean contains(Object element) {
        return content.contains(element);
    }

    @Override
    public boolean containsAll(Collection c) {
        return content.containsAll(c);
    }

    @Override
    public boolean isEmpty() {
        return content.isEmpty();
    }
}
