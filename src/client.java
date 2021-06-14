public class client {

    private static void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("Five");
        stack.push("Four");
        stack.push("Three");
        stack.push("Two");
        stack.push("One");
        System.out.println("1.1 Size of stack after push:" + stack.size());
        System.out.println("1.2 Pop elements from stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("1.3 Size of stack after pop:" + stack.size());
    }

    private static void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("2.1 Size of stack after push:" + stack.size());
        System.out.println("2.2 Pop element from stack:");
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
        System.out.println("Size after pop:" + stack.size());
    }
    public static void main(String[] args) {
        System.out.println("Stack of String");
        stackOfStrings();
        stackOfIntegers();
    }

}
