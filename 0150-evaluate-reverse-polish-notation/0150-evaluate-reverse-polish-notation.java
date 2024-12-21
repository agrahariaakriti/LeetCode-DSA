class Solution {
    public int evalRPN(String[] tokens) {
 ArrayDeque<Integer> al = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            String curr=tokens[i];
            if (!al.isEmpty() && (curr.equals("+") || curr.equals("-") || curr.equals("/") || curr.equals("*") )) {
                int num2 = al.pop(); // Pop num2 first
                int num1 = al.pop(); 
                int res = 0;

                if (curr.equals("+"))
                    res = num1 + num2;

                if (curr.equals("-"))
                    res = num1 - num2;

                if (curr.equals("/"))
                    res = num1 / num2;

                if (curr.equals("*"))
                    res = num1 * num2;
                   al.push(res);
            }
            else{
            int no=Integer.valueOf(tokens[i]);
            al.push(no);
            }
        }       
         return al.peek();
    }
}