import java.util.Iterator;

public class OurGenericList<T> implements Iterable<T> {
    private T[] items;
    private int size;

    public OurGenericList()
    {
        size=0;
        items= (T[]) new Object[100];
    }

    public void add(T item)
    {
        items[size++]=item;
    }

    public T getItemAtIndex(int index)
    {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new OurGenericClassIterator(this);
    }

    private class OurGenericClassIterator implements Iterator<T>
    {
        private OurGenericList<T> list;
        private int index=0;

        public OurGenericClassIterator(OurGenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return index< list.size;
        }

        @Override
        public T next() {
            return list.items[index++];
        }
    }

}
