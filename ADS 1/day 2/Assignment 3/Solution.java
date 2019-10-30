import java.util.*;
class Solution{
	public static String isMatching(String str){
Stack<Character> stack = new Stack<Character>();
    for (int i = 0; i < str.length(); i++) {
        Character ch = str.charAt(i);
        if (str.charAt(i) == '{' || str.charAt(i) == '['
                || str.charAt(i) == '(') {
            stack.push(str.charAt(i));
        } else {
            if (stack.isEmpty() 
                    || (stack.peek() == '[' && ch == '[')
                    || (stack.peek() == '{' && ch == '{')
                    || (stack.peek() == '(' && ch == '(')) {
                return "NO";
            } else {
                stack.pop();
            }
        }
    }
    if (stack.empty())
        return "YES";
    return "NO";
}
}
