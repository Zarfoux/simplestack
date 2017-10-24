package deqo.qvac.mysimplestack2;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class mySimpleStack <E>  {

    public ArrayList<E> mySimpleStack = new ArrayList<E>();

    public boolean isEmpty ()
    {
        return mySimpleStack.isEmpty();
    }

    public int getsize()
    {
        return mySimpleStack.size();
    }

    public void push(E item)
    {
        mySimpleStack.add(getsize(),item);
    }

    public E peek () throws EmptyStackException
    {
        return mySimpleStack.get(getsize()-1);
    }

    public E pop () throws  EmptyStackException
    {
       return mySimpleStack.remove(getsize()-1);
    }

    @Override
    public String toString() {
        String res = "";
        for (int i = 0 ;  i < this.getsize(); i++)
        {
            res += this.mySimpleStack.get(i).toString();
        }

        return res;
    }

    public ArrayList<E> getMySimpleStack() {
        return mySimpleStack;
    }
}
