package deqo.qvac.mysimplestack2;

import org.junit.Test;

import static org.junit.Assert.*;

public class mySimpleStackTest {



    @Test
    public void isEmpty() throws Exception {

        mySimpleStack<Integer> stack = new mySimpleStack<Integer>();

        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void getsize() throws Exception {

        mySimpleStack<Integer> stack = new mySimpleStack<Integer>();

        stack.push(2);
        assertEquals(1,stack.getsize());
    }

    @Test
    public void push() throws Exception {

        mySimpleStack<Integer> stack = new mySimpleStack<Integer>();

        assertEquals(0,stack.getsize());
        stack.push(48);
        assertEquals(1,stack.getsize());

    }

    @Test
    public void peek() throws Exception {

        mySimpleStack<Integer> stack = new mySimpleStack<Integer>();

        stack.push(48);
        assertEquals("48", stack.peek().toString());


    }

    @Test
    public void pop() throws Exception {

        mySimpleStack<Integer> stack = new mySimpleStack<Integer>();

        stack.push(48);
        assertEquals("48",stack.pop().toString());
        assertEquals(0,stack.getsize());

    }

}