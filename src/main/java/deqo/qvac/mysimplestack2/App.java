package deqo.qvac.mysimplestack2;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
       mySimpleStack<Integer> pile = new mySimpleStack<Integer>();

       pile.push(4);
        pile.push(2);
        System.out.println(pile.toString());
    }
}
