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
    }
}
