import java.util.Stack;

class _1544MakeTheStringGreat {

  public static String makeGood(String s) {
    Stack<Character> myStack = new Stack<>();
    StringBuilder myString = new StringBuilder();
    for (char ch : s.toCharArray()) {
      if (myStack.empty()) {
        myStack.push(ch);
      } else {
        char top = myStack.peek();
        if (
          Character.toUpperCase(ch) == Character.toUpperCase(top) && ch != top
        ) {
          myStack.pop();
        } else {
          myStack.push(ch);
        }
      }
    }

    for (char ch : myStack) {
      myString.append(ch);
    }

    return myString.toString();
  }

  public static void main(String[] args) {
    String s = "abBAcC";
    System.out.println(makeGood(s));
  }
}
