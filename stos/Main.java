package stos;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Stack stack = new Stack();
            stack.push(1);
            stack.push(9);
            stack.push(5);
            System.out.println(stack.pop()); // + " " + stack.pop() + " " + stack.pop());
            stack.pop();
        }
        catch (StackException e)
        {
            System.out.println(e.getReason());
        }
    }
}


