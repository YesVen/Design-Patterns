package interpretorPattern.context;

import interpretorPattern.expression.Expression;
import interpretorPattern.concreteExpression.Minus;
import interpretorPattern.concreteExpression.Number;
import interpretorPattern.concreteExpression.Plus;
import java.util.Stack;

public class Context {

    private Expression syntaxTree;

    public Context(String expression) {
        Stack<Expression> expressionStack = new Stack<>();
        String[] tokens = expression.split(" ");
        for (int i = tokens.length - 1; i >= 0; i--) {
            if (tokens[i].equals("+")) {
                Expression subExpression = new Plus(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else if (tokens[i].equals("-")) {
                Expression subExpression = new Minus(expressionStack.pop(), expressionStack.pop());
                expressionStack.push(subExpression);
            } else {
                expressionStack.push(new Number(Integer.valueOf(tokens[i])));
            }
        }
        syntaxTree = expressionStack.pop();
    }

    public int interpret() {
        return syntaxTree.interpret();
    }

}
