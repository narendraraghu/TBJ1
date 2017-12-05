

/**
 * Created by Raghu on 22-Jul-17.
 */
public class ST {

    public static void main(String[] args) {

        String s = "Java technology blog for smart java concepts and coding practices";

// Put words from String in Stack
        Stack<String> myStack = new Stack<>();
        StringTokenizer st = new StringTokenizer(s, " ");

        while (st.hasMoreTokens()) {
            myStack.push(st.nextToken());
        }

// Build the reverse string
        StringBuilder reverseString = new StringBuilder();
        while (!myStack.empty()) {
            reverseString.append(myStack.pop() + " ");
        }

        System.out.println(reverseString.toString());
    }
}
