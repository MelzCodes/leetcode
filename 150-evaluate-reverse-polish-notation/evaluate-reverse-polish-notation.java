class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String str : tokens) {
            if (!isOperator(str)) {
                stack.push(Integer.parseInt(str));
            } else {
                stack.push(performOperation(stack, str.charAt(0)));
            }
        }
        return stack.pop();
    }

    private int performOperation(Stack<Integer> stack, Character operator) {
        if (operator == '*') return stack.pop() * stack.pop();
        else if (operator == '+') return stack.pop() + stack.pop();
        else if (operator == '-') {
            int temp = stack.pop();
            return stack.pop() - temp;
        }
        else {
            int temp = stack.pop();
            return stack.pop() / temp;
        }
    }

    private boolean isOperator(String str) {
        return str.equals("+") || str.equals("*") || str.equals("-") || str.equals("/");
    }
}