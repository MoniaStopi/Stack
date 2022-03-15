package stos;

//import Stack.StackItem;

public class Stack {
	

    //-------------------------------------------------------
    private class StackItem
    {
        private int mKey; //info
        private StackItem mNext; //reference to the next elem
        StackItem( int key, StackItem next )
        {
            setKey(key);
            setNext(next);
        }
        public int getKey()
        {
            return mKey;
        }
        public StackItem getNext()
        {
            return mNext;
        }
        public void setKey( int x )
        {
            mKey = x;
        }
        public void setNext( StackItem next )
        {
            mNext = next;
        }
    }
    //-------------------------------------------------------
    private StackItem mHead; //stack head

    public Stack()
    {
        mHead = null;
    }

    public void push( int key ) throws StackException
    {
        try
        {
            mHead = new StackItem(key, mHead);
        }
        catch ( OutOfMemoryError e )
        {
            throw new StackException(ErrCode.STACK_OVERFLOW);
        }
    }

    public int pop() throws StackException
    {
        if( !isEmpty() )
        {
            int key = top();
            del();
            return key;
        }
        else
        {
            throw new StackException(ErrCode.STACK_IS_EMPTY);
        }
    }

    public int top() throws StackException
    {
        if( !isEmpty() )
        {
            return mHead.getKey();
        }
        else
        {
            throw new StackException(ErrCode.STACK_IS_EMPTY);
        }
    }

    public void del() throws StackException
    {
        if( !isEmpty() )
        {
            mHead = mHead.getNext();
        }
        else
        {
            throw new StackException(ErrCode.STACK_IS_EMPTY);
        }

    }

    public boolean isEmpty()
    {
        return mHead == null;
    }

}
