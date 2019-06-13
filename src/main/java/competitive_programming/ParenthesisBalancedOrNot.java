package competitive_programming;

import java.util.Stack;

public class ParenthesisBalancedOrNot {

    public static void main(String[] args) {
        String parenthesis = "{()}[]"; //[[[{{{((()))}{{}}}}]]],  (a+b*(c-d)-(e-f/(g+h*(k-i)/(l-j+k, [()]{}{[()()]()}
        System.out.println("Input Length : " + parenthesis.length());
        Stack<Character> characters = ParenthesisBalancedOrNot.pushCharacters(parenthesis, '(', '{', '[');
        boolean isBalanced = ParenthesisBalancedOrNot.balanceParenths(parenthesis, characters);
        if (isBalanced)
            System.out.println("Balanced");
        else System.out.println("Unbalanced");
    }

    public static Stack<Character> pushCharacters(String parenthesis, Character character1, Character character2, Character character3) {
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < parenthesis.length(); i++) {
            if (parenthesis.charAt(0) == ')' || parenthesis.charAt(0) == '}' || parenthesis.charAt(0) == ']') {
                return null;
            }
            if (parenthesis.charAt(i) == character1 || parenthesis.charAt(i) == character2 || parenthesis.charAt(i) == character3)
                characters.push(parenthesis.charAt(i));
        }
        return characters;
    }

    public static boolean balanceParenths(String parenthesis, Stack<Character> characters) {
        if (!(null == characters)) {
            for (int i = 0; i < parenthesis.length(); i++) {
                if (parenthesis.charAt(i) == ')')
                    characters.pop();
                else if (parenthesis.charAt(i) == '}')
                    characters.pop();
                else if (parenthesis.charAt(i) == ']')
                    characters.pop();

                if (characters.size() == 0) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }
}
