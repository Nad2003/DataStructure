package example;

public class myclass {
    public static void main(String[] args) throws Exception {
        coustomestack stack=new dynamicsttack(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
         stack.push(9);
//        stack.push(10);

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

    }
}
