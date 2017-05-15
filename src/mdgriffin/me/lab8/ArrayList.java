package mdgriffin.me.lab8;

/**
 This is a simplified implementation of an array list.
 */
public class ArrayList<E>
{
    private E[] buffer;
    private int currentSize;

    /**
     Constructs an empty array list.
     */
    public ArrayList()
    {
        final int INITIAL_SIZE = 10;
        Object [] buffer1 = new Object[INITIAL_SIZE];
        buffer = (E [])buffer1;
        currentSize = 0;
    }

    /**
     Gets the size of this array list.
     @return the size
     */
    public int size() { return currentSize; }

    /**
     Throws an IndexOutOfBoundsException if the checked index is out of bounds
     @param n the index to check
     */
    private void checkBounds(int n)
    {
        if (n < 0 || n >= currentSize)
        {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     Gets the element at a given position.
     @param pos the position
     @return the element at pos
     */
    public E get(int pos)
    {
        checkBounds(pos);
        return buffer[pos];
    }

    /**
     Sets the element at a given position.
     @param pos the position
     @param element the new value
     */
    public void set(int pos, E element)
    {
        checkBounds(pos);
        buffer[pos] = element;
    }

    /**
     Removes the element at a given position.
     @param pos the position
     @return the removed element
     */
    public E remove(int pos)
    {
        checkBounds(pos);

        E removed = buffer[pos];

        for (int i = pos + 1; i < currentSize; i++)
        {
            buffer[i - 1] = buffer[i];
        }

        currentSize--;

        return removed;
    }



    /**
     Adds an element after the end of the array list
     @param newElement the element to add
     */
    public boolean addLast(E newElement)
    {
        growBufferIfNecessary();
        currentSize++;

        buffer[currentSize - 1] = newElement;
        return true;
    }

    /**
     Grows the buffer if the current size equals the buffer's capacity.
     */
    private void growBufferIfNecessary()
    {
        if (currentSize == buffer.length)
        {
            Object[] newBuffer = new Object[2 * buffer.length];
            for (int i = 0; i < buffer.length; i++)
            {
                newBuffer[i] = buffer[i];
            }
            buffer = (E[])newBuffer;
        }
    }
}
