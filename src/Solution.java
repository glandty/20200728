import java.util.Stack;

public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stcak = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '[' || c == '{') {
                stcak.push(c);
                continue;
            }
            if (stcak.empty()) {
                return false;
            }
            char top = stcak.pop();
            if (top == '(' && c == ')') {
                continue;
            }
            if (top == '[' && c == ']') {
                continue;
            }
            if (top == '{' && c == '}') {
                continue;
            }
            return false;
        }
        if (stcak.empty()) {
            return true;
        }
        return false;
    }
}
