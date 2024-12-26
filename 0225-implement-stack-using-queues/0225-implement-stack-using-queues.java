class MyStack {
    ArrayDeque<Integer> main;
    ArrayDeque<Integer> aqx;

    public MyStack() {
        main=new ArrayDeque<>();
        aqx=new ArrayDeque<>();
    }
    
    public void push(int x) {
        if(main.size()==0)
        main.offer(x);
        else
        {
            while(!main.isEmpty())
            aqx.offer(main.poll());

            main.offer(x);

            while(!aqx.isEmpty())
            main.offer(aqx.poll());
        }
    }
    
    public int pop() {
        return main.poll();
    }
    
    public int top() {
       return  main.peek();
    }
    
    public boolean empty() {
    return main.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */