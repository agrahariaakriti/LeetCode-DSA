class Solution {
    public int calculate(String s) {
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        int sign = 1; // 1 for +, -1 for -
        int ans=0;
        stack.push(sign); 

        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                num = 10 * num + (c - '0'); 
            } else if (c == '+') {
                ans += sign * num;
                num = 0;
                sign = 1;
            } else if (c == '-') {
                ans += sign * num;
                num = 0;
                sign = -1;
            } else if (c == '(') {
                stack.push(sign);
                stack.push(ans); 
                ans = 0;
                sign = 1; 
            } else if (c == ')') {
                ans += sign * num;
                sign = stack.pop(); 
                ans = ans * stack.pop() + sign; 
                num = 0;
            }
        }
        ans += sign * num;
        return ans;
    }
}