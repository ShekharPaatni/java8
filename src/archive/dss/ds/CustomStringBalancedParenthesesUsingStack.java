package archive.dss.ds;

/**
 * @author Chandra Shekhar Paatni on 8/5/19
 */
public class CustomStringBalancedParenthesesUsingStack<T> {
    private T[] data;
    private static int top = -1;
    private int INITIAL_DEFAULT_CAPACITY = 10;

    public CustomStringBalancedParenthesesUsingStack(int initialCapacity) {
        this.data = (T[])new Object[initialCapacity];
    }

    public CustomStringBalancedParenthesesUsingStack() {
        this.data = (T[])new Object[INITIAL_DEFAULT_CAPACITY];
    }

    public int size() {
        return top;
    }

    public void push(T value) {
        if (top > data.length/2)
            this.data = copyOf(data, data.length*2);
        data[++top] = value;
    }

    public T pop() {
        if (top < 0)
            throw new IndexOutOfBoundsException();
        return data[top--];
    }

    public boolean isEmpty() {
        return (top < 0);
    }

    public T[] copyOf(T[] values, int newLength) {
        T[] newData = (T[]) new Object[newLength];
        for (int i = 0; i < top; i++) {
            newData[i] = data[i];
        }
        return newData;
    }

    private Boolean isMatcher(char lastStackElement, char stringCharacter) {
        if (lastStackElement == '{' && stringCharacter == '}')
            return true;
        if (lastStackElement == '[' && stringCharacter == ']')
            return true;
        if (lastStackElement == '(' && stringCharacter == ')')
            return true;
        return false;
    }
    public static void main(String[] args) {
        CustomStringBalancedParenthesesUsingStack<Character> customStringBalancedParenthesesUsingStack = new CustomStringBalancedParenthesesUsingStack<>();
        String parentheses = "{{[]}}";
        char[] chars = parentheses.toCharArray();
        for (int i = 0; i < chars.length; i++)
            if (top < 0)
                customStringBalancedParenthesesUsingStack.push(chars[i]);
            else if (chars[i] == '{' || chars[i] == '[' || chars[i] == '(')
                customStringBalancedParenthesesUsingStack.push(chars[i]);
            else
                customStringBalancedParenthesesUsingStack.pop();
        System.out.println((customStringBalancedParenthesesUsingStack.isEmpty()) ? "Balanced" : "UnBalanced");
    }
}
