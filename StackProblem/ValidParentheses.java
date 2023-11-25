package StackProblem;
import java.util.*;

public class ValidParentheses {
    public boolean isValid(String s) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put(')', '(');
        map.put('}', '{');
        map.put(']', '[');
        Stack<Character> stack = new Stack<>();

        for (int i=0; i<s.length(); i++){
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '['){
                stack.push(s.charAt(i));
                continue;
            }
            if(stack.size() == 0 || map.get(s.charAt(i)) != stack.pop()){
                return false;
            }
        }
        if(stack.size() == 0){
            return true;
        }
        return false;
    }
}
