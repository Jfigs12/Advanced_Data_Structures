import java.util.Stack;

public class ParenTools{

    public static boolean isValid(String charString){
        Stack<Character> stack = new Stack<Character>();
        char[] charArray = charString.toCharArray();
        for (char c : charArray){
            if (c == '('){
                stack.push(c);
            }
            else if (c == ')'){
                if (stack.isEmpty()){
                    return false;
                }
                stack.pop();
            }
        }
        return true;
    }
}