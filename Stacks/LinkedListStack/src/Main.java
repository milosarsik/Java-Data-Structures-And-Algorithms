public class Main
{
    public static void main(String[] args)
    {
        LinkedStack<Integer> S2 = new LinkedStack<>();

        S2.push(1);
        S2.push(2);
        S2.push(3);
        S2.push(4);
        S2.push(5);

        System.out.println(S2.pop());
        System.out.println(S2.pop());
        System.out.println(S2.pop());
        System.out.println(S2.pop());
        System.out.println(S2.pop());
    }
}
