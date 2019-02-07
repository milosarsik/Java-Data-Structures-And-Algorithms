public class Main
{
    public static void main(String[] args)
    {
        Stack<Integer> S = new ArrayStack<>();

        S.push(5);
        S.push(3);

        System.out.println(S.size());
        System.out.println(S.pop());
        System.out.println(S.empty());
        System.out.println(S.pop());
        System.out.println(S.empty());
        System.out.println(S.pop());

        S.push(7);
        S.push(9);

        System.out.println(S.peek());

        S.push(4);

        System.out.println(S.size());
        System.out.println(S.pop());

        S.push(6);
        S.push(8);

        System.out.println(S.pop());

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